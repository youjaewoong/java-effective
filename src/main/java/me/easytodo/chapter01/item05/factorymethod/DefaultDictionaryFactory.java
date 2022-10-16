package me.easytodo.chapter01.item05.factorymethod;

import me.easytodo.chapter01.item05.DefaultDictionary;
import me.easytodo.chapter01.item05.Dictionary;

public class DefaultDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }
}
