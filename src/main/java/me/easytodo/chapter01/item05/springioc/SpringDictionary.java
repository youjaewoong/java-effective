package me.easytodo.chapter01.item05.springioc;

import org.springframework.stereotype.Component;

import me.easytodo.chapter01.item05.Dictionary;

import java.util.List;

@Component
public class SpringDictionary implements Dictionary {

    @Override
    public boolean contains(String word) {
        System.out.println("contains " + word);
        return false;
    }

    @Override
    public List<String> closeWordsTo(String typo) {
        return null;
    }
}
