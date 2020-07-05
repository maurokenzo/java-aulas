package com.mks.springwebmvcgradlemks.model;

public class Jedi {
    private String lastname;
    private String name;

    public Jedi(final String name, final String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Jedi() {
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
