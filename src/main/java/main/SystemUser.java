package main;

import java.util.List;

//TODO: Add constructor with address and accessCards
//TODO: Read about final methods
public class SystemUser {

    private String uniqueId;
    private String name;
    private UserAddress address;
    private List<UserAccessCard> accessCards;

    public SystemUser(String name) {
        System.out.println("Creating new user " + name);
        this.name = name;
        this.uniqueId = String.valueOf(System.currentTimeMillis());
    }

    public SystemUser(String name, int age) {
        System.out.println("Creating new user " + name);
        this.name = name;
        this.uniqueId = String.valueOf(System.currentTimeMillis());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public static String staticMethod(String a, String b) {
        return a + b;
    }

    public String getAccessLevel() {
        if (this.name.equals("Admin")) {
            return "this is our admin!";
        } else {
            return "this is not our admin!";
        }
    }
}
