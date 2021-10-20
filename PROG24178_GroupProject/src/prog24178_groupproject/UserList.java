/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178_groupproject;

import java.util.ArrayList;

/**
 *
 * @author Junqi Du
 */
public class UserList {

    ArrayList<User> users = new ArrayList<User>();

    public UserList() {

    }

    public void add(User user) {
        User addan = new User();
        addan.setUserName("addan");
        addan.setPassWord("1234");
        addan.setRole("manger");
        users.add(0, addan);
    }
}
