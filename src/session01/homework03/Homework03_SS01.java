package session01.homework03;

public class Homework03_SS01 {
    public static void main(String[] args){
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        String temp = book1;
        book1 = book2;
        book2 = temp;

        // Trước khi hoán đổi:
        // book1 --> "Java Basic"
        // book2 --> "Python Intro"

        // Sau khi gán temp = book1:
        // temp  --> "Java Basic"
        // book1 --> "Java Basic"
        // book2 --> "Python Intro"

        // Sau khi gán book1 = book2:
        // book1 --> "Python Intro"
        // book2 --> "Python Intro"
        // temp  --> "Java Basic"

        // Sau khi gán book2 = temp:
        // book1 --> "Python Intro"
        // book2 --> "Java Basic"
        // temp  --> "Java Basic"

    }
}
