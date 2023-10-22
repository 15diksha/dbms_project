package com.pharmacy.pharmacy_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pharmacy.pharmacy_management.model.Login;

@Controller
public class LoginController {
//  @GetMapping("/login")
//  public String showLogin() {
//   return "login";
//  }
@Autowired
JdbcTemplate jdbcTemplate;
 //Check for Credentials
 @PostMapping("/Login")
 public String Login(Login Login) {
   String insert_query = "insert into Login"
                        +"(username,password)" 
                        +"value"
                        +"(?,?);";
    int rows=jdbcTemplate.update(insert_query, Login.getUsername(),
    Login.getPassword());
    if(rows==1){
        return "welcome";
    }else{
        return "Login";
    }
   
  
 }
}
