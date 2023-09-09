package day03.member;

import java.util.Objects;
import java.util.Scanner;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberView {

    Scanner sc;
    MemberRepository mr;
    int MAX_REGISTER = 10;
    public MemberView() {
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();
        viewProcess();
    }

    /**
     * 초기 메인 화면을 출력
     */
    void mainView() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        if (mr.memberList.length <= MAX_REGISTER ) {
            System.out.println("* 1. 회원 정보 등록하기");
        }
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 회원 정보 복구하기");
        System.out.println("* 7. 프로그램 끝내기");
        System.out.println("=============================");
    }

    /**
     * 프로그램 화면 흐름을 제어하는 기능
     */
    void viewProcess() {
        while (true) {
            mainView();
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    if (mr.memberList.length <= MAX_REGISTER ) {
                        signUp();
                    } else {
                        System.out.println("기존 맴버가 10명 이상일 경우 신규등록을 할 수 없습니다");
                        stop();
                    }
                    break;
                case "2":
                    findMember();
                    stop();
                    break;
                case "3":
                    mr.showMembers();
                    stop();
                    break;
                case "4":
                    changePassword();
                    break;
                case "5":
                    deleteMember();
                    stop();
                    break;
                case "6":
                    restoreMamber();
                    break;
                case "7":
                    String answer = input("# 정말로 종료합니까? [y/n] : ");
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

    private void restoreMamber() {
        String email = input("# 복구대상 맴버의 이메일 : ");
        Member member = mr.findMemberByEmail(email,true);
        if (member != null){
            while (true) {
                String password = input("# 비밀번호를 입력 : ");
                if (mr.isMatchPassword(password, member.password)) {

                    System.out.println("# 복구에 성공하셨습니다");
                    break;
                } else {
                    System.out.println("# 비밀번호를 틀렸습니다");
                }
            }
        }else {
            System.out.println("# 복구대상 맴버를 탐색하지 못했습니다");
        }
    }

    private void deleteMember() {
        String email = input("# 삭제할 맴버의 이메일 : ");
        Member member = mr.findMemberByEmail(email,false);
        if (member != null){
            while (true) {
                String password = input("# 비밀번호를 입력 : ");
                if (mr.isMatchPassword(password, member.password)) {
                    mr.delMember(member.email,false);
                    System.out.println("# 삭제에 성공하셨습니다");
                    break;
                } else {
                    System.out.println("# 비밀번호를 틀렸습니다");
                }
            }
        }else {
            System.out.println("# 삭제할 맴버를 탐색하지 못했습니다");
        }
    }

    private void findMember() {
        String email = input("# 찾는 맴버의 이메일 : ");
        Member member = mr.findMemberByEmail(email,false);
        if (member != null) {
            System.out.println("Id : " + member.memberId);
            System.out.println("Password : " + member.password);
            System.out.println("email : " + member.email);
            System.out.println("name : " + member.memberName);
            System.out.println("age : " + member.age);
            System.out.println("Gander : " + member.gender);
            System.out.println("regDate : " + member.regDate);
        } else {
            System.out.println("# 일치하는 이메일이 없습니다");
        }
    }

    private void changePassword() {
        //이메일 받기
        String email = input("# 수정 대상의 이메일 : ");
        //수정 대상 탐색
        Member member = mr.findMemberByEmail(email,false);
        //회원 탐색 됨
        if (member != null) {
            System.out.printf("# %s님의 비밀번호를 변경합니다 \n", member.memberName);
            String newPassword = input("# 새로운 비밀번호 : ");
            //새 비밀번호가 기존 비밀번호와 같을 경우 pass
            if (member.password.equals(newPassword)) {
                System.out.println("#기존 비밀번호와 동일합니다 변경을 취소합니다");
                return;
            }
            mr.updatePassword(newPassword, email);
            System.out.println("# 비밀번호 변경이 완료되었습니다");
        } else {
            System.out.println("\n#조회 결과가 없습니다");
        }
        stop();

    }

    void signUp() {//회원가입 입출력을 처리하는 메서드
        String email = checkDuplicateEmailInput();
        String name = input("# 이름 : ");
        String pw = input("# 패스워드 : ");
        Gender gender = checkCorrectGenderInput();
        String age = input("# 나이 : ");

        int randomId = (int) (Math.random() * 9999999) + 1;//랜덤 아이디 생성
        Member newMember = new Member(randomId, email, pw, name, gender, Integer.parseInt(age));
        mr.addMember(newMember);
        System.out.println("# 회원가입 성공");
        stop();
    }

    private Gender checkCorrectGenderInput() {
        while (true) {
            String inputGender = input("# 성별[M/F] : ");
            switch (inputGender.toUpperCase()) {
                case "M":
                    return Gender.MALE;
                case "F":
                    return Gender.FEMALE;
                default:
                    System.out.println("# 성별을 M 또는 F로 입력하세요");
            }
        }
    }

    private String checkDuplicateEmailInput() {
        while (true) {
            String email = input("# 이메일: ");
            if (!mr.isDuplicatedEmail(email)) {
                return email;
            }
            System.out.println("# 이메일이 중복되었습니다.");
        }
    }


    public String input(String messge) {//입력처리를 간편하게 해주는 메서드
        System.out.print(messge);
        return sc.nextLine();
    }

    void stop() {
        System.out.println("\n======= 엔터를 눌러서 계속…======");
        sc.nextLine();
    }
}
