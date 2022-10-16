package me.easytodo.chapter01.item05.factorymethod;

import me.easytodo.chapter01.item05.DefaultDictionary;
import me.easytodo.chapter01.item05.Dictionary;
import me.easytodo.chapter01.item05.MockDictionary;

public class MockDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new MockDictionary();
    }
}
