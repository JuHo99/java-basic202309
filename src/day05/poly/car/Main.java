package day05.poly.car;


import day04.modi.pac2.D;
import util.Utility;

public class Main {
    public static void main(String[] args) {
       Avante avante =  new Avante();
       Avante avante2 =  new Avante();
       Mustang mustang = new Mustang();
       Stinger stinger = new Stinger();

//       avante.accelerate();
//       mustang.accelerate();
//       stinger.accelerate();

       Car[] avantes = {avante,avante2,mustang,stinger};

        for (Car a : avantes) {
//            a.accelerate();
        }
        mustang.exhaust();
        Object[] arr = {"hello","안녕",10,false}; // 다형성을 이용한 이종 모움 배열

        Utility.makeLine();
        Driver park = new Driver();
        park.drive(new Mustang());

        Utility.makeLine();
        CarShop shop = new CarShop();
        Mustang myCar = (Mustang)shop.exportCar(6000);
        myCar.accelerate();
        myCar.exhaust();

//        객체의 다운캐스팅 : 전제 조건이 존재
//        한번 업캐스팅이 된 자식 객체만 다시 다운캐스팅 가능

        Utility.makeLine();
        Car myStinger = new Stinger();
        Stinger ss = (Stinger)myStinger;

//        Car car = new Car();
//        Avante aaa = (Avante)car;
        Car carcar = shop.exportCar(6000);
        System.out.println(carcar instanceof Avante);
        System.out.println(carcar instanceof Stinger);
        System.out.println(carcar instanceof Mustang);

        if (carcar instanceof Mustang){
            Mustang ms = (Mustang) carcar;
            ms.exhaust();
        }
    }
}
