package day09.io;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static final String ROOT_PATH="D:/";
    public static void main(String[] args) {
        // 폴더 생성
        File file = new File(ROOT_PATH + "/hello");

//        폴더 생성 명령
        if (!file.exists())file.mkdir();

        // 파일 생성하기
        File f = new File(ROOT_PATH + "/hello/food.txt");

        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("파일 생성 실패");
            }
        }



    }
}
