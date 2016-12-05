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
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author sebastie.quiquere
 */
@Named(value = "peopleListBean")
@RequestScoped

public class PeopleListBean implements Serializable {

    @Inject
    Services service;
    /**
     * Creates a new instance of PeopleListBean
     */

    private String gender;
    private String firstName;
    private String lastName;
    private boolean married;
    private Date birthDate;
    private Person personToDelete;
    private int currentPersonID;
    private Person currentPerson;

    //restful
    private List peopleList;

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

    public List getPeopleList() {
        return service.getPeopleList();
    }

    public Person getPersonToDelete() {
        return personToDelete;
    }

    public void setPersonToDelete(Person personToDelete) {
        this.personToDelete = personToDelete;
    }

    public String addPerson() {

        service.savePerson(gender, firstName, lastName, married, birthDate);
        return "index.xhtml";
    }

    public String deletePerson() {

        service.deletePerson(personToDelete);
        return "index.xhtml";
    }

    //initialisation de la liste des personnes
    public void iniPeopleList() {
        this.peopleList = service.getPeopleList();
    }

    public void initPerson() {
        String idParam = FacesContext
                .getCurrentInstance()
                .getExternalContext()
                .getRequestParameterMap().get("id");
        if (!(idParam == null || idParam.isEmpty())) {
            currentPersonID = Integer.parseInt(idParam);
            currentPerson = service.getPerson(new Long(currentPersonID));
        }
    }

    public int getCurrentPersonID() {
        return currentPersonID;
    }

    public void setCurrentPersonID(int currentPersonID) {
        this.currentPersonID = currentPersonID;
    }

    public Person getCurrentPerson() {
        return currentPerson;
    }

    public void setCurrentPerson(Person currentPerson) {
        this.currentPerson = currentPerson;
    }
    
    

}
