package day05.poly;

import java.util.Scanner;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}
public class Basic {
    void test() { // 자식 객체가 부모의 타입을 사용 가능
        Object a = new A();
        A b = new B();
        Object c = new C();
        A d = new D();
        E e = new E();

        Object sc = new Scanner(System.in);
    }
}
