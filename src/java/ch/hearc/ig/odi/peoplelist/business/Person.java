/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.business;

import java.util.Date;

/**
 *
 * @author sebastie.quiquere
 */
public class Person {
    
    private Long id;
    private String gender;
    private String firstName;
    private String lasteName;
    private Boolean married;
    private Date birthDate;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasteName() {
        return lasteName;
    }

    public Boolean getMarried() {
        return married;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLasteName(String lasteName) {
        this.lasteName = lasteName;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    
    
}
