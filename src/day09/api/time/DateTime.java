package day09.api.time;

import util.Utility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        
//        Date date = new Date();
//        System.out.println(date.getMonth());
        //Calendar c = Calendar.getInstance();
        
        //현재 날짜ㅣ 정보 얻기
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);

        //현재 시간 정보 얻기
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime = " + nowDateTime);

        int year = nowDateTime.getYear();
        int MonthValue = nowDateTime.getMonthValue();
        int dayOfMonth = nowDateTime.getDayOfMonth();
        int hour = nowDateTime.getHour();
        int minute = nowDateTime.getMinute();
        System.out.println("year = " + year);
        System.out.println("MonthValue = " + MonthValue);
        System.out.println("dayOfMonth = " + dayOfMonth);
        System.out.println("hour = " + hour);
        System.out.println("minute = " + minute);

        Utility.makeLine();

        //원하는 날짜 만들기
        LocalDateTime targetTime = LocalDateTime.of(2023, 11, 25, 0, 0, 0);
        System.out.println("targetTime = " + targetTime);

        Utility.makeLine();

        // 날짜 연산
        LocalDateTime rentalDate = LocalDateTime.now();
        LocalDateTime returnDate = rentalDate.plusDays(17);
        System.out.println("returnDate = " + returnDate);

        Utility.makeLine();

        LocalDateTime targetDate = returnDate
                .plusYears(1)
                .plusMonths(6)
                .plusDays(30);
        System.out.println("targetDate = " + targetDate);

        Utility.makeLine();

        //사이 날짜 구하기
        LocalDate b = LocalDate.of(2019, 12, 28);
        LocalDate d = LocalDate.of(2023, 9, 25);

        boolean after = nowDate.isAfter(b);
        System.out.println("after = " + after);

        long between = ChronoUnit.DAYS.between(b, d );
        System.out.println("between = " + between);
        Utility.makeLine();

        //날짜 포맷 바꾸기
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분");
        String deteString = nowDateTime.format(pattern);
        System.out.println("deteString = " + deteString);


    }
}
