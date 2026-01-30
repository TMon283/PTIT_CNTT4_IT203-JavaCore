package session06.homework06;

public class Homework06_SS06 {
    public static class User {
        private String id;
        private String username;
        private String password;
        private String email;

        public User(String id, String username, String password, String email) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public void setEmail(String email) {
            if (email != null && email.contains("@")) {
                this.email = email;
            } else {
                System.out.println("Email không hợp lệ!");
            }
        }

        public void setPassword(String password) {
            if (password != null && !password.isEmpty()) {
                this.password = password;
            } else {
                System.out.println("Password không được rỗng!");
            }
        }

        public void displayInfo() {
            System.out.println("ID: "+ id);
            System.out.println("Username: "+ username);
            System.out.println("Password: ******");
            System.out.println("Email: "+ email);
        }
    }
    public static void main(String[] args) {
        User u1 = new User("", "", "", "");
        u1.setEmail("abc@gmail.com");
        u1.setPassword("12345");
        u1.displayInfo();
        User u2 = new User("", "", "", "");
        u2.setEmail("abcgmail.com");
        u2.setPassword("");
        u2.displayInfo();
    }
}
