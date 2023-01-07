package me.easytodo.chapter05.item33.type_token;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Slf4j
public class Favorites {

    private Map<Class<?>, Object> map = new HashMap<>();

    //제네릭 타입의 value를 받겠다
    public <T> void put(Class<T> clazz, T value) {
        this.map.put(Objects.requireNonNull(clazz), clazz.cast(value));
    }

    public <T> T get(Class<T> clazz) {
        // cast 는 자신의 타입인지 검사한다.
        return clazz.cast(this.map.get(clazz));
    }

    public static void main(String[] args) {
        Favorites favorites = new Favorites();
        favorites.put(String.class, "gos1004");
        favorites.put(Integer.class, 2);
        log.info(favorites.get(String.class));

//        슈퍼타입토큰이 해결할수 있다.!!!
//        favorites.put(List<Integer>.class, List.of(1, 2, 3));
//        favorites.put(List<String>.class, List.of("a", "b", "c"));

//        List list = favorites.get(List.class);
//        list.forEach(System.out::println);
    }

}
