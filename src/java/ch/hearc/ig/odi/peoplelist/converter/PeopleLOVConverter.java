/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.converter;

import ch.hearc.ig.odi.peoplelist.business.Person;
import ch.hearc.ig.odi.peoplelist.service.Services;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

/**
 *
 * @author sebastie.quiquere
 */
@Named(value = "peopleLOVConverter")
@RequestScoped

public class PeopleLOVConverter implements Converter{
    
    @Inject Services service;
    /**
     * Creates a new instance of PeopleLOVConverter
     */

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null) {
            return null;
        }else{
            return service.getPerson(new Long(value));
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return null;
        }else if (value instanceof Person){
            return((Person)value).getId().toString();
        }else{
            return "";
        }
    }
    
}
