package me.easytodo.chapter01.item05.singleton;

import java.util.List;

import me.easytodo.chapter01.item05.DefaultDictionary;
import me.easytodo.chapter01.item05.Dictionary;

public class SpellChecker {

    private final Dictionary dictionary = new DefaultDictionary();

    private SpellChecker() {}

    public static final SpellChecker INSTANCE = new SpellChecker();

    public boolean isValid(String word) {
        // TODO 여기 SpellChecker 코드
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        // TODO 여기 SpellChecker 코드
        return dictionary.closeWordsTo(typo);
    }
}
