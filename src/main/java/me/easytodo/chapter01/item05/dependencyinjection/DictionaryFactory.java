package me.easytodo.chapter01.item05.dependencyinjection;

import me.easytodo.chapter01.item05.DefaultDictionary;

public class DictionaryFactory {
    public static DefaultDictionary get() {
        return new DefaultDictionary();
    }
}
