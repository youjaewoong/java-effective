package me.easytodo.chapter01.item05.dependencyinjection;

import java.util.List;
import java.util.function.Supplier;

import me.easytodo.chapter01.item05.Dictionary;

/**
 * 자원을 직접 명시하지 말고 의존 객체 주입을 사용하라 
 */
public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    /**
     * 팩토리메소드패턴
     * {@link me.easytodo.chapter01.item05.dependencyinjection.SpellCheckerTest}
     * @param dictionarySupplier
     */
    public SpellChecker(Supplier<Dictionary> dictionarySupplier) {
        this.dictionary = dictionarySupplier.get();
    }

    public boolean isValid(String word) {
        // TODO 여기 SpellChecker 코드
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        // TODO 여기 SpellChecker 코드
        return dictionary.closeWordsTo(typo);
    }
}
