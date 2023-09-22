package day08.collection.set;
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // HashSet<>() : 빠른 저장속도 , 중복 자동제거, 순서 X
        // index, key 를 사용하지 않기 때문에 개별 탐색에 불리함
        Set<String> foodSet = new HashSet<>();

        //add(E e) : 데이터 추가
        boolean f1 = foodSet.add("김말이");
        foodSet.add("닭꼬치");
        foodSet.add("단무지");
        foodSet.add("김밥");
        boolean f2 = foodSet.add("김말이");

        System.out.println(foodSet.size());
        System.out.println(foodSet);

        System.out.println("f2 = " + f2);
        System.out.println("f1 = " + f1);

        foodSet.remove("단무지");
        System.out.println(foodSet);

        List<Integer> numbers = new ArrayList<>(
                List.of(1,1,1,3,3,5,7,7,7,9,9,9,9)
        );
        System.out.println(numbers);
        
        //set으로 변환
        Set<Integer>numberSet = new HashSet<>(numbers);
        System.out.println("numberSet = " + numberSet);

    }
}
