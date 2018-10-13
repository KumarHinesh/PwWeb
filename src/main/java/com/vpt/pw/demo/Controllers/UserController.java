package com.vpt.pw.demo.Controllers;


import com.vpt.pw.demo.dtos.LoginDTO;
import com.vpt.pw.demo.dtos.TeamDTO;
import com.vpt.pw.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

  /*  public String logout() {
        String status = "FAIL";
        return status;
    }*/

  /*  @PostMapping("/team/create")
    public TeamDTO createTeam(@RequestBody TeamDTO teamDTO) {
        return userService.createTeam(teamDTO);
    }
*/
  /*  @PostMapping("/employee/create")
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return userService.createEmployee(employeeDTO);
    }*/

    @PostMapping("/login")
    public LoginDTO login(@RequestBody TeamDTO teamDTO) {
        return userService.authenticate(teamDTO);
    }

}
