package com.vpt.pw.demo.service;

import com.vpt.pw.demo.Constants.ConstantValues;
import com.vpt.pw.demo.dtos.LoginDTO;
import com.vpt.pw.demo.dtos.SiteDTO;
import com.vpt.pw.demo.dtos.TeamDTO;
import com.vpt.pw.demo.dtos.TeamTitleDTO;
import com.vpt.pw.demo.exceptions.RestException;
import com.vpt.pw.demo.model.Team;
import com.vpt.pw.demo.repository.PregnantWomanRepository;
import com.vpt.pw.demo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class UserService {


    @Autowired
    EntityManager entityManager;
    @Autowired
    private TeamRepository teamRepository;
    /*@Autowired
    TeamTitleRepository teamTitleRepository;
*/
  /*  @Autowired
    SiteRepository siteRepository;
  */
    @Autowired
    private PregnantWomanRepository pregnantWomanRepository;

    /*public EmployeeDTO createEmployee(EmployeeDTO newEmployee) {
        Team team = teamRepository.findById(newEmployee.getTeam().getId()).get();

        Employee employee = new Employee();
        employee.setAccessStatus(newEmployee.getAccessStatus());
        employee.setDesignation(newEmployee.getDesignation());
        employee.setName(newEmployee.getName());
        employee.setTeam(team);

        employee = employeeRepository.save(employee);

        newEmployee.setId(employee.getId());
        return newEmployee;
    }*/

   /* public TeamDTO createTeam(TeamDTO newTeam) {

        String title = newTeam.getTeam().getTitle();

        GroupTitle teamTitle = teamTitleRepository.findByTitle(title);

        Team team = new Team();
        team.setUserName(newTeam.getUserName());
        team.setPassword(newTeam.getPassword());

        team.setGroupTitle(teamTitle);

        String strSite = newTeam.getSite().getSite();

        Site site = siteRepository.findBySite(strSite);

        team.setSite(site);

        team = teamRepository.save(team);

        newTeam.setId(team.getId());
        return newTeam;
    }*/

    public LoginDTO authenticate(TeamDTO teamDTO) {

        LoginDTO loginDTO = new LoginDTO();

        Team team = teamRepository.findByUserNameAndPassword(teamDTO.getUserName(), teamDTO.getPassword());

        TeamDTO teamDTO2 = new TeamDTO();
        SiteDTO siteDTO = new SiteDTO();
        TeamTitleDTO teamTitleDTO = new TeamTitleDTO();


        if (team != null) {

            if (team.getStatus() == ConstantValues.ACTIVE_ACCESS) {

                teamDTO2 = teamDTO;

                siteDTO.setId(team.getSite().getId());
                siteDTO.setSite(team.getSite().getSite());

                teamTitleDTO.setId(team.getGroupTitle().getId());
                teamTitleDTO.setTitle(team.getGroupTitle().getTitle());

                teamDTO2.setId(team.getId());
                teamDTO2.setTeamTitle(teamTitleDTO);
                teamDTO2.setSite(siteDTO);
                teamDTO2.setSraName(team.getSraName());
                teamDTO2.setStatus(team.getStatus());

                loginDTO.setTeamDTO(teamDTO2);

            } else {

                throw new RestException(HttpStatus.NOT_FOUND, "Team Deactivated");

            }


        }

        return loginDTO;
    }
}
