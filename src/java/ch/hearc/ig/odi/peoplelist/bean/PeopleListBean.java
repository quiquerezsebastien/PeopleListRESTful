/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.bean;

import ch.hearc.ig.odi.peoplelist.service.Services;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author sebastie.quiquere
 */
@Named(value = "peopleListBean")
@RequestScoped



public class PeopleListBean implements Serializable{
    
    @Inject Services service;
    /**
     * Creates a new instance of PeopleListBean
     */
    public PeopleListBean() {
    }
    
    public List getPeopleList(){
        return service.getPeopleList();
    }
    
}
