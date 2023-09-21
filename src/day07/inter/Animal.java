package day07.inter;


//class : 객체를 만드는 설계도
//interface : 클래스를 만드는 명세서 (설계도를 만드는 것)
//interface : 추상메서드를 만들기 위한 명세서, 본문 불가능 , 생성자 불가능, 필드 불가능
//interface : 상수 선언 가능, 타입으로 사용 가능, 다중상속 허용
//interface : 다형성이 구현된다
public interface Animal { // 기능들 명세 가능

    String PET = "동물";
    void feed(String foodName);
    boolean sleep();
    default void makeHobby() {};

}
