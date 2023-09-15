package day05.Project;

import day03.member.Gender;
import util.Utility;

public class LibraryView {

    private static LibraryRepository repository;

    void viewProcess() {
        startView();
        while (true) {
            menuView();
            String menuNum = Utility.input(" - 메뉴 번호 : ");

            switch (menuNum) {
                case "1":  //마이페이지
                    mypage();
                    Utility.stop();
                    break;
                case "2":  // 도서 전체 조회
                    showBooks();
                    Utility.stop();
                    break;
                case "3":  // 도서 제목으로 조회
                    Utility.stop();
                    break;
                case "4":  // 도서 대여
                    break;
                case "5": // 도서 저자이름으로 검색
                    Utility.stop();
                    break;
                case "9":  // 종료
                    String answer = Utility.input("# 정말로 종료합니까? [y/n] : ");
                    if (answer.toLowerCase().charAt(0) == 'y') {
                        System.out.println("# 프로그램을 종료합니다.");
                        System.exit(0);
                    } else {
                        continue;
                    }
                    break;
                default:
                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");
            }
        }
    }


    void startView() {
        System.out.println("# 회원 정보 입력");
        String name = Utility.input("# 이름 : ");
        int age = Integer.parseInt(Utility.input("# 나이 : "));
        String genderStr = Utility.input("성별(M/F) : ");
        Gender gender;
        if (genderStr.equalsIgnoreCase("M")) {
            gender = Gender.MALE;
        } else if (genderStr.equalsIgnoreCase("F")) {
            gender = Gender.FEMALE;
        } else {
            System.out.println("올바른 성별 값을 입력하세요.");
            return;
        }
        new BookUser(name, age, gender, 0);
    }

    void menuView() {
        System.out.println("========= 도서 메뉴 =========");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 제목으로 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 5. 도서 저자이름으로 검색");
        System.out.println("# 9. 프로그램 종료하기");
        System.out.println("============================");
    }

    void mypage(){
        repository.mypage();
    }
    void showBooks(){
        repository.showBooks();
    }




}
