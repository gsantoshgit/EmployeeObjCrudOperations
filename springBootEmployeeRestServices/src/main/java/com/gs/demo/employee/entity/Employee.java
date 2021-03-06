package com.gs.demo.employee.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Santosh Chary Gadepally
 *
 */
@Entity
@Table
public class Employee {
  
 @Id
 private Long id;
 
 private String name;

 private Integer salary;
  

 private String department;
 
 public Long getId() {
  return id;
 }
 
 public void setId(Long id) {
  this.id = id;
 }
 
 public String getName() {
  return name;
 }
 
 public void setName(String name) {
  this.name = name;
 }
 
 public Integer getSalary() {
  return salary;
 }
 
 public void setSalary(Integer salary) {
  this.salary = salary;
 }
 
 public String getDepartment() {
  return department;
 }
 
 public void setDepartment(String department) {
  this.department = department;
 }
}