package day04.encap;

public class Car {
    private String model; // 모델
    private int speed;  // 속도
    private char mode; // 변속
    private boolean start; // 시동 여부

    public Car(String model) {
        this.model = model;
        this.mode = 'P';

    }

    public void setSpeed(int speed) { // setter 메서드 private의 값을 변경하는 메서드
        if (speed < 0 || speed >100){
            return;
        }
        this.speed = speed;
    }

    public int getSpeed() { //getter 메서드 private의 값을 가져오는 메서드
        return this.speed;
    }

    public void setMode(char mode) {
        switch (mode) {
            case 'R': case 'P': case 'D': case 'N':
                this.mode = mode;
                break;
            default:
                this.mode = 'P';
        }

    }

    public char getMode() {
        return mode;
    }
    //엔진에 연료가 주입되는 기능
    private void inject(){
        System.out.println("연료 주입");
    }
    private void putOil(){
        System.out.println("오일 순환");
    }
    private void moveCylinder(){
        if (start) {
            System.out.println("실린더 움직임");
        }else{
            System.out.println("엔진 과열");
        }
    }
    public void pressButton(){
        this.start = true;
        inject();
        putOil();
        System.out.println("시동");
        moveCylinder();
    }


}
