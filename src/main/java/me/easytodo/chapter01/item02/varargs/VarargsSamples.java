package me.easytodo.chapter01.item02.varargs;

import java.util.Arrays;

/**
 * 여러 인자를 받을 수 있는 가변적인 argument (Var+args)
 * 가변인수는 메소드에 오직 하나만 선언할 수 있다.
 * 가변인수는 메소드의 가장 마지막 매개변수가 되어야 한다.
 */
public class VarargsSamples {

    public void printNumbers(int... numbers) {
        System.out.println(numbers.getClass().getCanonicalName());
        System.out.println(numbers.getClass().getComponentType());
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static void main(String[] args) {
        VarargsSamples samples = new VarargsSamples();
        samples.printNumbers(1, 20, 20, 39, 59);
    }
}
