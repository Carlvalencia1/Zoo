package com.alilopez.application.models;

public class Login {
    private String user;
    private String password;
    private String userVendedor = "vendedor";
    private String passVendedor = "123";

    public boolean checkLogin(String user, String password){
        return user.equals(userVendedor) && password.equals(passVendedor);
    }
}
