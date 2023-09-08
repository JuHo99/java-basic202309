package day02.array;

import java.util.Arrays;

public class StringList {
    String[] sArr;
    //생성자를 통해 배열을 초기화
    StringList(){
        sArr = new String[0];
    }

    public StringList(String... initData) {
        sArr = new String[initData.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = initData[i];
        }
    }
    void pop(){
        String[]temp = new String[sArr.length-1];
        for (int i = 0; i <temp.length ; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
    }
    void push(String newName){
        String[] temp = new String[sArr.length +1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        temp[temp.length-1] = newName;
        sArr = temp;
    }
    int size(){
        return sArr.length;
    }
    boolean isEmpty(){
        return sArr.length ==0;
    }
    void clear(){
        sArr = new String[0];
    }

    public int indexOf(String target) {
        for (int i = 0; i < sArr.length; i++) {
            if (target.equals(sArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean includes(String target) {
        return indexOf(target) != -1;
    }

    public String remove(int index) {
        if (index < 0 || index > sArr.length - 1) return null;

        String targetData = sArr[index];
        for (int i = index; i < sArr.length - 1; i++) {
            sArr[i] = sArr[i + 1];
        }
        pop();
        return targetData;
    }
    public String remove(String target) {
        return remove(indexOf(target));
    }
    public void insert(int index, String newData) {

        if (index < 0 || index > sArr.length - 1) return;
        if (index == sArr.length - 1) push(newData);

        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i-1];
        }
        temp[index] = newData;
        sArr = temp;
    }

    void printArray() {
        System.out.println(Arrays.toString(sArr));
    }
}
