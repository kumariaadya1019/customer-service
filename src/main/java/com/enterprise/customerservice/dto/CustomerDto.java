package com.enterprise.customerservice.dto;

public class CustomerDto {

    private Long id;
    private String fullName;
    private String status;
    private String email;

    public Long getId(){
        return id;
    }
    public  void setId(Long id){
        this.id =id;
    }
    public  String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public  String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }



}
