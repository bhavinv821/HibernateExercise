package com.mycompany.hibernateexample1;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;   

/**
 *
 * @author bhavin
 */

  
@Entity  
@Table(name= "HelloWord")   
public class helloWord {    
  
@Id   
private int id;    
private String description;    
    
public int getId() {    
    return id;    
}    
public void setId(int id) {    
    this.id = id;    
}    
public String getdescription() {    
    return description;    
}    

public void setdescription(String description) {    
    this.description = description;    
}    
}   
