package com.rudolfhladik.rd.disciplines;

/**
 * Created by RD on 16.9.2014.
 */
public class User {

    private String userID;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private long googleid;


    public User(){

    }
    //constructor for anonymous user
    public User(String userID){

        this.userID = userID;
        this.name = null;
        this.surname = null;
        this.email = null;
        this.phone = null;
        this.googleid = 0;


    }
    //constructor for registred user

    public User(String userID, String name, String surname, String email, String phone, long googleid)
    {
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.googleid = googleid;
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public long getGoogleid() {
        return googleid;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGoogleid(long googleid) {
        this.googleid = googleid;
    }
}
