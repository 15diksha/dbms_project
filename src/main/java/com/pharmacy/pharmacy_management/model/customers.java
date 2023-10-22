// package com.pharmacy.pharmacy_management.model;

// // // import java.sql.Date;

// public class customers {
    
// //     // private String customer_name;
    
//     private String phone_no;
//     private String password;
// //     // private Date DOB;
// //     // private String address;

//     public customers() {
//         super();
//         // TODO Auto-generated constructor stub
//        }
//     public customers(String phone_no, String password) {
//         super();
//         this.phone_no = phone_no;
//         this.password = password;
//        }
//     public String getphone() {
//         return phone_no;
//        }
//     public void setphone(String phone_no) {
//         this.phone_no = phone_no;
//        }
//     public String getPassword() {
//         return password;
//        }
//     public void setPassword(String password) {
//         this.password = password;
//        }
// }




package com.pharmacy.pharmacy_management.model;
public class customers {

 private String phone_no;
 private String password;
 
 

public customers() {
  super();
  // TODO Auto-generated constructor stub
 }
 
 public customers(String phone_no, String password) {
  super();
  this.phone_no = phone_no;
  this.password = password;
 }

 public String getphone_no() {
  return phone_no;
 }
 public void setphone_no(String phone_no) {
  this.phone_no = phone_no;
 }
 public String getPassword() {
  return password;
 }
 public void setPassword(String password) {
  this.password = password;
 }
 
}
