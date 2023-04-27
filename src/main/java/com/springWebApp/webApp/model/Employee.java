package com.springWebApp.webApp.model;

import lombok.Data;

@Data
public class Employee {
    private Integer id;
    private String firstName;
    private String laststName;
    private String mail;
    private String password;
}
