package day02;

public class DancerMain {
    public static void main(String[] args) {
        //댄서 객체 생성
        Dancer kim = new Dancer();
//        kim.dancerName = "김또띠아";
//        kim.crewNaem = "신호등";
//        kim.genre = "스트릿";

        kim.stretch();
        kim.dance();
        System.out.println("========================");
        Dancer park = new Dancer("박격포");
        park.introduce();
        kim.introduce();
        System.out.println("========================");
        Dancer jang = new Dancer("장동견","목각");
        jang.introduce();
        System.out.println("========================");
        Dancer hong = new Dancer("홍박사", "틱톡커", Ganre.KPOP, DanceLevel.AMATEUR);
        hong.stretch();
        hong.dance();
        hong.introduce();

        System.out.println(kim);
        System.out.println(park);
    }
}
