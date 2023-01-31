package com.example.employeemanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @Enumerated(EnumType.ORDINAL)
    private DeveloperFunctions developerFunction;

    @Enumerated(EnumType.ORDINAL)
    private AdministrativeFunctions administrativeFunction;

    private Integer baseSalary;

    @ManyToOne
    @JoinColumn(name="team_id", nullable = false)
    private Team team;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DeveloperFunctions getDeveloperFunction() {
        return developerFunction;
    }

    public void setDeveloperFunction(DeveloperFunctions developerFunction) {
        this.developerFunction = developerFunction;
    }

    public AdministrativeFunctions getAdministrativeFunction() {
        return administrativeFunction;
    }

    public void setAdministrativeFunction(AdministrativeFunctions administrativeFunction) {
        this.administrativeFunction = administrativeFunction;
    }

    public Integer getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Integer baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
