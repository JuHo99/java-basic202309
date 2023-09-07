package day02;

public class Dancer {
    //객체의 속성 (필드)
    String dancerName;
    String crewNaem;
    Ganre genre;
    DanceLevel danceLevel;

    //생성자 : 객체의 초기값 세팅 , 리턴 데이터가 주소값으로 고정 (리턴 타입 void)
    Dancer(){
        dancerName = "김뽀삐";
        crewNaem = "헬로우";
        danceLevel = DanceLevel.AMATEUR;
        genre = Ganre.URBAN;
    }

    Dancer(String dName){
        dancerName = dName;
        crewNaem = "굿바이";
        danceLevel = DanceLevel.BEGINNER;
        genre = Ganre.HIPHOP;
    }
    Dancer(String dName,String cName){
        dancerName = dName;
        crewNaem = cName;
        danceLevel = DanceLevel.PRO;
        genre = Ganre.KPOP;
    }

    public Dancer(String dancerName, String crewNaem, Ganre genre, DanceLevel danceLevel) {
        this.dancerName = dancerName;
        this.crewNaem = crewNaem;
        this.genre = genre;
        this.danceLevel = danceLevel;
    }

    //객체의 기능 static을 붙이지 말 것
    void dance(){
        System.out.println(genre+"춤을 열정적으로 춥니다");
    }
    void stretch(){
        System.out.println(dancerName+"님이 몸을 풉니다");
    }
    void introduce(){
        System.out.printf("내 이름은 %s이고 %s팀에 소속되어 있습니다\n", dancerName,crewNaem);
    }

}
