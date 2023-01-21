package com.example.employeemanagement.service;

import com.example.employeemanagement.domain.Team;
import com.example.employeemanagement.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService implements AbstractService<Team> {

    private TeamRepository teamRepository;

    @Autowired
    public void setTeamRepository(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Iterable<Team> listAll() {
        return teamRepository.findAll();
    }

    @Override
    public Team getById(Long id) {
        return teamRepository.getReferenceById(id);
    }

    @Override
    public Team save(Team team) {
        return teamRepository.save(team);
    }
}
