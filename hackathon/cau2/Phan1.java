package hackathon.cau2;

import java.util.Scanner;

public class Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử thêm vào mảng: ");
        int n = sc.nextInt();
        int count = 1;
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int target = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                count++;
            } else {
                System.out.println("Số "+ target +" xuất hiện: "+ count +" lần");
                count = 1;
                target = arr[i+1];
            }
        }
        count = 1;
        target = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == arr[i-1]) {
                count++;
            } else {
                System.out.println("Số "+ target +" xuất hiện: "+ count +" lần");
                break;
            }
        }
    }
}

