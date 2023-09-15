package util;

import java.util.Scanner;

public class Utility {
    static Scanner sc = new Scanner(System.in);

    public static void makeLine(){
        System.out.println("==================================");
    }

    public static String input (String message){
        System.out.print(message);
        return sc.nextLine();
    }

    public static void stop() {
        System.out.println("\n======= 엔터를 눌러서 계속…======");
        sc.nextLine();
    }
}
