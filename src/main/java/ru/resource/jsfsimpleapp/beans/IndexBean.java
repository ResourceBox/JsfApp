package ru.resource.jsfsimpleapp.beans;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by d.mashkov on 30.06.2016.
 */

@Named
@SessionScoped
public class IndexBean implements Serializable{

    private String firstName = "Петя";
    private String lastName = "Иванов";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
