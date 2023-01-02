package me.easytodo.chapter05.item28.erasure;

import java.util.ArrayList;
import java.util.List;

public class IntegerToString {

    public static void main(String[] args) {
        // 공변: 상위타입으로 하위 타입을 받을 수 있다.
        Object[] anything = new String[10];
        anything[0] = 1; // 런타임시 에러;

        // 불공변: 상위타입으로 하위 타입을 받을 수 없다.
        List<String> names = new ArrayList<>();
//        List<Object> objects = names; //컴파일 에러


//        // 제네릭과 배열을 같이 사용할 수 있다면...
//        List<String>[] stringLists = new ArrayList<String>[1];
//        List<Integer> intList = List.of(42);
//        Object[] objects = stringLists;
//        objects[0] = intList;
//        String s = stringLists[0].get(0);
//        System.out.println(s);
    }
}
