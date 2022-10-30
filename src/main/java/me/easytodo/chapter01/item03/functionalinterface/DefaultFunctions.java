package me.easytodo.chapter01.item03.functionalinterface;


import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import me.easytodo.chapter01.item03.methodreference.Person;

public class DefaultFunctions {

    public static void main(String[] args) {
    	
    	// input : Integer 받고, output : String 리턴
        Function<Integer, String> intToString = Object::toString;
        
        // 인자가없는 return
        Supplier<Person> personSupplier = Person::new;
        Function<LocalDate, Person> personFunction = Person::new;

        // 받아서 출력만
        Consumer<Integer> integerConsumer = System.out::println;

        // boolean return
        Predicate<Person> predicate;
    }
}
