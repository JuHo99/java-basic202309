package day04.inherit;

public class Mage extends Player{
    private int mp;

    public Mage(String nickName) {
        super(nickName);
        this.mp =100;
    }

    @Override
    public void status() {
        super.status();
        System.out.println("# 마나 : "+mp);
    }

    public void blizzard(){
        System.out.println("눈 내린 전선을 우리는 간다");
    }


    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
