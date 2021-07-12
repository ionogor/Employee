package com.step.employee;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Employee {
    private int id;
    private String name;
    private String lastname;
    private String idnp;
    private String sex;
    private int stage;

    public Employee( String name, String lastname, String idnp, String sex, int stage) {
        id++;
        this.name = name;
        this.lastname = lastname;
        this.idnp = idnp;
        this.sex = sex;
        this.stage = stage;
    }

    public Employee(int id, String name, String lastname,String idnp) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.idnp=idnp;
    }

    public Employee(String name, String lastname, String idnp) {
        this.name = name;
        this.lastname = lastname;
        this.idnp = idnp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getIdnp() {
        return idnp;
    }

    public String getSex() {
        return sex;
    }

    public int getStage() {
        return stage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }
    @Override
    public String toString() {
        return "ID "+this.id+"Name : "+this.name+" "+" LastName "+ this.lastname+" "+" sex "+this.sex+" "+stage+" idnp "+this.idnp;
    }



}
