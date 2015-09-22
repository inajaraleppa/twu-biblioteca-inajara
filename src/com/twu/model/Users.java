package com.twu.model;

import com.twu.biblioteca.XMLClass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by ileppa on 9/22/15.
 */
@XmlRootElement(name = "Users")
@XmlAccessorType(XmlAccessType.FIELD)
public class Users {
    @XmlElement(name = "User")
    private List<User> users = null;

    public List<User> getUsers(){
        XMLClass xml = new XMLClass();
        users =  xml.unMarshal("users", Users.class).users;
        return users;
    }

    public User getUser(String login, String password){
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }

        return null;
    }
}
