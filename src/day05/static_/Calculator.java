package day05.static_;

public class Calculator {

    String color;
    static double PI;

    static double calcAteaCircle(int r){
        return  PI*r*r;
    }

    void paint (String color){
        this.color = color;
    }
}
