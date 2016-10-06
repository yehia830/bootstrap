package com.tiy;

import java.util.ArrayList;

/**
 * Created by jessicatracy on 9/30/16.
 */
public class LoginContainer {
    String errorMessage;
    User user;
    ArrayList<User> usersWhoWantMyInfo = new ArrayList<>();

    public LoginContainer() {
    }

    public LoginContainer(String errorMessage, User user, ArrayList<User> usersWhoWantMyInfo) {
        this.errorMessage = errorMessage;
        this.user = user;
        this.usersWhoWantMyInfo = usersWhoWantMyInfo;
    }

    //Getters and setters
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<User> getUsersWhoWantMyInfo() {
        return usersWhoWantMyInfo;
    }

    public void setUsersWhoWantMyInfo(ArrayList<User> usersWhoWantMyInfo) {
        this.usersWhoWantMyInfo = usersWhoWantMyInfo;
    }
}
