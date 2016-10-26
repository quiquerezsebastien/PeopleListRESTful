/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.bean;

import ch.hearc.ig.odi.peoplelist.business.Person;
import ch.hearc.ig.odi.peoplelist.service.Services;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author sebastie.quiquere
 */
@Named(value = "peopleListBean")
@SessionScoped



public class PeopleListBean implements Serializable{
    
    @Inject Services service;
    /**
     * Creates a new instance of PeopleListBean
     */
    
    private String gender;
    private String firstName;
    private String lastName;
    private boolean married;
    private Date birthDate;
    
    public PeopleListBean() {
    }

    public Services getService() {
        return service;
    }
    
    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isMarried() {
        return married;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    
    public List getPeopleList(){
        return service.getPeopleList();
    }
    
    public String addPerson(){
        
        service.savePerson(gender, firstName, lastName, married, birthDate);
        
        return "index.xhtml";
    }
    
}
