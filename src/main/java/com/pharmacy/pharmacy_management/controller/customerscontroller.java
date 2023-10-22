// package com.pharmacy.pharmacy_management.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.PostMapping;

// import com.pharmacy.pharmacy_management.model.customers;
// @Controller
// public class customerscontroller {
// @Autowired
// JdbcTemplate jdbcTemplate;
//  //Check for Credentials
//  @PostMapping("/customers")
//  public String customers(customers customers) {
//    String insert_query = "insert into customers"
//                         +"(phone_no,password)" 
//                         +"value"
//                         +"(?,?);";
//     int rows=jdbcTemplate.update(insert_query, customers.getphone(),
//     customers.getPassword());
//     if(rows==1){
//         return "welcome";
//     }else{
//         return "customers";
//     }
// }
// }





package com.pharmacy.pharmacy_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pharmacy.pharmacy_management.model.customers;

@Controller
public class customerscontroller {
//  @GetMapping("/customers")
//  public String showcustomers() {
//   return "customers";
//  }
@Autowired
JdbcTemplate jdbcTemplate;
 //Check for Credentials
 @PostMapping("/customers")
 public String customers(customers customers) {
   String insert_query = "insert into customers"
                        +"(phone_no,password)" 
                        +"value"
                        +"(?,?);";
    int rows=jdbcTemplate.update(insert_query, customers.getphone_no(),
    customers.getPassword());
    if(rows==1){
        return "welcome";
    }else{
        return "customers";
    }
   
  
 }
}

