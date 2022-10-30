package me.easytodo.chapter01.item05.dependencyinjection;

import org.junit.jupiter.api.Test;

import me.easytodo.chapter01.item05.MockDictionary;
import me.easytodo.chapter01.item05.dependencyinjection.SpellChecker;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker = new SpellChecker(MockDictionary::new);
        spellChecker.isValid("test");
    }

}