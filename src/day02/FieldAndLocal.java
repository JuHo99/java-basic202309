package day02;

public class FieldAndLocal {
    int a;       //필드 : 초기화하지 않아도 기본값을 초기화
    void foo(int c){  //foo = 메서드 c = 지역변수 : 호출시 초기화가 되기 때문에 지역변수임에도 초기화를 안해놓아도 된다
        int b =10;   //지역변수 : 반드시 초기화를 수동으로 해야함
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

}
