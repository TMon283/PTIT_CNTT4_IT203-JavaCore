package session06.homework02;

import java.util.Scanner;

public class Homework02_SS06 {
    static final Scanner sc = new Scanner(System.in);
    public static class Account {
        private String username;
        private String password;
        private String email;

        public Account (String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public void getAccountInfo () {
            System.out.print("Nhập username: ");
            this.username = sc.nextLine();
            System.out.print("Nhập password: ");
            this.password = sc.nextLine();
            System.out.print("Nhập email: ");
            this.email = sc.nextLine();
        }

        public void changePassword() {
            System.out.print("Nhập mật khẩu mới: ");
            this.password = sc.nextLine();
        }

        public void displayInfo () {
            System.out.println("Username: "+ username);
            System.out.println("Password: ******");
            System.out.println("Email: "+ email);
        }
    }
    public static void main(String[] args) {
        Account acc = new Account("", "", "");
        acc.getAccountInfo();
        acc.changePassword();
        acc.displayInfo();
    }
}
