package models;

import java.util.ArrayList;

public class Personne {

    private String firstname;

    private String lastname;

    private Integer years;

    public Personne(String firstname, String lastname, Integer years) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.years = years;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }
}
