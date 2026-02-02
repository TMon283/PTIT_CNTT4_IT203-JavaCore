package session07.homework06;

import java.util.ArrayList;

public class UserManager {
    public static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User u) {
        users.add(u);
    }

    public static boolean checkLogin(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void printAllUsers() {
        System.out.println("Danh sách hiện tại:");
        int i = 1;
        for (User u : users) {
            System.out.println(i + ". " + u.toString());
            i++;
        }
    }
}
