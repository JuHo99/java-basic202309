package day05.static_;

public class Count {
    public static int x; // 정적 필드 : 모든 객체가 공유
    public int y; // 인스턴스 필드 : 각 객체별로 관리

    // static 메서드 안에서는 static필드만 직접 참조 가능
    public  static  void m1(Count c){ // 정적 메서드
        System.out.println("static 메서드 호출");
        System.out.println("x = " + x);
        System.out.println("y = " + c.y);
    }
    public void m2(){ // 인스턴스 메서드
        System.out.println("인스턴스 메서드 호출");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
