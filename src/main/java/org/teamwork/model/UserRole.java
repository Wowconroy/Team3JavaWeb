package org.teamwork.model;

import java.util.HashMap;
import java.util.Map;

public class UserRole {
    Map <Integer, String> userRole = new HashMap<>();

    public void addRole(){
        userRole.put(1, "Reader");
        userRole.put(2, "Manager");
    }

    public String getRole(int role){
        return userRole.get(role);
    }
}
