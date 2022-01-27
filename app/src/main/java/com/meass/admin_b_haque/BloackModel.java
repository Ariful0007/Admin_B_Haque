package com.meass.admin_b_haque;

public class BloackModel {
    String username,email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BloackModel() {
    }

    public BloackModel(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
