package day03.member;

public class test {
    public static void main(String[] args) {
        MemberRepository mr = new MemberRepository();
        Member thief = new Member(4,"ttt@yyy.com","4321","잠만보",Gender.MALE,22);
    String email = "ttt@yyy.com";
    boolean flag1 = mr.isDuplicatedEmail(email);
        System.out.println("flag1 = "+flag1);


        Member foundMember = mr.findMemberByEmail(email,false);
        System.out.println("foundMember =" +foundMember);
        // 2번 메뉴를 선택하면 이메일을 입력받아서 일치하는 회원이 발견되면
        // 패스워드를 포함한 모든 정보를 세로로 출력

        //가입 회원이 10명이 넘으면 1번 메뉴를 숨김처리

        // 3-1 회원 탈퇴 기능 구현, 5번을 누르면 이메일과 패스워드를 입력받고
        // 입력된 값이 일치하면 회원 배열에서 제거

        //3-2 탈퇴 처리를 한 후 탈퇴 대기 배열에 추가

        //추가 메뉴 번호를 활성화 ( 7. 회원 복구하기)
        // 이메일과 패스워드를 입력 받아서 복구 시키고 기존 회원이 10명 이상일 경우 복구 불가능

        mr.delMember(email,false);

        mr.showMembers();
        mr.printRemoveMembers();


    }
}
