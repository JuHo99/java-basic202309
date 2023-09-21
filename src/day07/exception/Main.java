package day07.exception;

import util.Utility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginUser user = new LoginUser("abc123","123");
        String id = Utility.input("ID : ");
        String pw = Utility.input("PW : ");

//        try {
//            String result= user.validate(id,pw);
//        } catch (LoginFailException e) {
//            System.out.println(e.getMessage());
//        } catch (NullPointerException e){
//
//        }

//        System.out.println("result : "+result);



    }
}
