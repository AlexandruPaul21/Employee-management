package com.example.employeemanagement.controller;

import com.example.employeemanagement.domain.Team;
import com.example.employeemanagement.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TeamController {

    private TeamService teamService;

    @Autowired
    public void setTeamService(TeamService teamService) {
        this.teamService = teamService;
    }

    @RequestMapping(value = "/teams", method = RequestMethod.GET)
    public List<Team> Teams() {
        return (List<Team>) teamService.listAll();
    }

    @RequestMapping(value = "/teams/{id}", method = RequestMethod.GET)
    public Team findById(@PathVariable Long id) {
        return (Team) teamService.getById(id);
    }

    @RequestMapping(value = "/teams", method = RequestMethod.POST)
    public void addEmployee(@RequestBody Team team) {
        teamService.save(team);
    }

    @RequestMapping(value = "/teams", method = RequestMethod.PUT)
    public void editTeam(@RequestBody Team team) {
        teamService.update(team);
    }

    @RequestMapping(value = "/teams/{id}", method = RequestMethod.DELETE)
    public void deleteTeam(@PathVariable Long id) {
        teamService.delete(id);
    }
}
