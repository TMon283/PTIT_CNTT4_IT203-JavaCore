package session07.homework06;

public class Main {
    public static void main(String[] args) {
        User u1 = new User(1, "dev_x", "123456");
        User u2 = new User(2, "dev_y", "password");
        User u3 = new User(3, "dev_z", "qwerty");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);
        UserManager.printAllUsers();

        System.out.println("\n>> Kiểm tra đăng nhập:");
        System.out.println("- Login (\"dev_x\", \"123456\"): " +
                (UserManager.checkLogin("dev_x", "123456") ? "Thành công!" : "Thất bại!"));
        System.out.println("- Login (\"dev_y\", \"wrongpassword\"): " +
                (UserManager.checkLogin("dev_y", "wrongpassword") ? "Thành công!" : "Thất bại!"));
    }
}

