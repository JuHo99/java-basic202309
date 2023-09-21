package day07.exception;

public class LoginFailException extends Exception{
    //커스텀 에러 클래스 : 기본 생성자 + 에러메시지를 담는 생성자 구현


    public LoginFailException() {
    }

    public LoginFailException(String message) {
        super(message);
    }
}
