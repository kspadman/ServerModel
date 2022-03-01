package org.cis120;

import java.util.*;

public class Channel {

    private TreeSet<String> users;
    private String owner;
    private boolean privacy; // 1 if private, 0 if public
    private String name;

    public Channel(String own, boolean priv, String n) {
        users = new TreeSet<String>();
        owner = own;
        privacy = priv;
        name = n;
        users.add(own);
    }

    public TreeSet<String> getUsers() {
        return users;
    }

    public String getOwner() {
        return owner;
    }

    public boolean containsUser(String username) {
        return users.contains(username);
    }

    public String getName() {
        return name;
    }

    public boolean getPrivacy() {
        return privacy;
    }

    public void removeUser(String user) {
        users.remove(user);
    }

    public void addUser(String user) {
        users.add(user);
    }

    public void setOwner(String user) {
        owner = user;
    }

}
