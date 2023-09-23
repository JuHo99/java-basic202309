package day09.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {
    public static void main(String[] args) {

        String path = "C:\\Users\\cyci\\Desktop\\박주호\\java-basic202309\\src\\day03\\member\\MemberRepository.java";

        try(FileInputStream fis = new FileInputStream(path)){

            int data = 0;

            while (data != -1){
                data = fis.read();
                //write : 아스키 코드 읽기
                System.out.write(data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
