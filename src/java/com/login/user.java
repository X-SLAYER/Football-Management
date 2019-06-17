package com.login;

public class user {

    private final String username;
    private final String first;
    private final String last;
    private final String password;
    private final String email;

    public user(String username, String first, String last, String password, String email) {
        this.username = username;
        this.first = first;
        this.last = last;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

}
