package day05.poly.car;

public class Driver {
//    오버로딩 : 같은 이름의 메서드를 하나의 클래스에서 중복해서 작성하는 것
//    오버 라이딩  : 상속에서 부모클레스가 물려준 메서드를 자식이 사용하는 것
    public void drive(Car car){
        System.out.println("운전을 시작합니다");
        car.accelerate();
    }
//    public void drive(Mustang car){
//        System.out.println("운전을 시작합니다");
//        car.accelerate();
//    }
//    public void drive(Stinger car){
//        System.out.println("운전을 시작합니다");
//        car.accelerate();
//    }
}
