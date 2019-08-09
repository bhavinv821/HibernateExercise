package com.mycompany.hibernateexample1;

import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;  
import javax.persistence.Table;   

@Entity  
@Table(name= "HelloWord")   
public class helloWord {    
  
@Id   
@GeneratedValue(strategy = GenerationType.AUTO)
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
