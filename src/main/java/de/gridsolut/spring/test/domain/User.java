package de.gridsolut.spring.test.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: ungerts
 * Date: 29.10.13
 * Time: 11:14
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "usertable")
public class User {

   @Id
    private String userId;

    private String firstname;

    private String lastname;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
}
