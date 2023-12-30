package main.finale.System_Design.System_Design_src_not_mine.DesignSplitwise.User;

import main.finale.aa.System_Design.System_Design_src_not_mine.DesignSplitwise.User.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    List<User> userList;

    public UserController(){
        userList = new ArrayList<>();
    }

    //add user
    public void addUser(User user) {
        userList.add(user);
    }

    public User getUser(String userID) {

        for (User user : userList) {
            if (user.getUserId().equals(userID)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers(){
        return userList;
    }
}
