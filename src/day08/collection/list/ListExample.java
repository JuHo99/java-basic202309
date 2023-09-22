package day08.collection.list;

import day08.generic.Apple;
import util.Utility;

import java.util.*;//collection이 모여있는 패키지

public class ListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList();

        // add(E e) : 맨 끝에 데이터 추가 (push,append)
        list.add("짜장면");
        list.add("짬뽕");
        list.add("파스타");
        list.add("리조또");
        list.add("치킨");

        System.out.println(list);

        Utility.makeLine();
        //add(index, E) : 중간삽입
        list.add(2, "족발");
        System.out.println(list);

        //size() : 배열의 길이
        int size = list.size();
        System.out.println("size = " + size);

        //indexOf(E e) : 해당 데이터의 인덱스를 처음부터 찾아서 반환
        int index = list.indexOf("파스타");
        System.out.println("index : " + index);

        //contains(E e) : 해당 데이터의 저장 유무 반환 ( T , F )
        System.out.println(list.contains("짜장면"));
        System.out.println(list.contains("마파두부"));

        //remove(index), remove(object) : 삭제
        list.remove(0);
        System.out.println(list);

        //set(index, newElement) : 수정
        list.set(0, "동파육");
        System.out.println(list);

        //get(index) : 리스트에 저장된 index 데이터 참조
        String s = list.get(1);
        System.out.println("s = " + s);

        Utility.makeLine();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            ;
        }

        Utility.makeLine();
        for (String ss : list) {
            System.out.println("SS = " + ss);
        }

        Utility.makeLine();
        //clear() : 전체삭제
        //isEmpty() : 리스트의 데이터 여부 확인

        System.out.println(list.isEmpty()); //false
        list.clear();
        System.out.println(list.isEmpty()); //true

        //리스트에 초기값 넣고 시작하기
        List<Integer> numbers = new ArrayList<>(
                List.of(5,30,7,99,3,41)
        );

        Utility.makeLine();
        System.out.println(numbers);

        //sort(Integer::compareTo) : 숫자형의 오름차 정렬(퀵 정렬)
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        //내림차 정렬

        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);

       /*           탐색속도        삽입/삭제
       배열리스트      빠름            느림
       연결리스트      느림            빠름
        */
        List<Apple> appleList = new ArrayList<>();
        List<Apple> appleList1 = new LinkedList<>();



    }
}
