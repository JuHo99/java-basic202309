package day04.inherit;


public class Warrior extends Player {//상속 키워드 : extends
    private int rage;

    public Warrior(String nickName) {
        super(nickName);
        System.out.println("워리어 생성자");
        this.rage =100;
    }

    @Override//오버라이딩 : 형태(이름,매개변수,리턴타입)는 super에서 상속받은 대로 사용해야함
    public void status(){
        super.status();
        System.out.println("# 분노 : "+rage);
    }

    public void powerSlash(){
        System.out.println("파워슬레쉬 두두등장");
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }
}
