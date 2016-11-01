package com.springapp.mvc.domain;


/**
 * Created by LinHuan on 14-4-30.
 */

public class Users {

    private String id;

    private String name;

    private String address;

    public Users() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
