package session10.homework04;

public class Main {
    public static void main(String[] args) {
        RemoteControl light = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }
        };

        light.powerOn();
        light.checkBattery();
    }
}

