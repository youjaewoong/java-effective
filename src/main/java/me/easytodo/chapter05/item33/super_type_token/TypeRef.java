package me.easytodo.chapter05.item33.super_type_token;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 타입정보를 알아낼 수있다.
 * @param <T>
 */
public abstract class TypeRef<T> {

    /**
     * type을 알아낼수 있다.
     */
    private final Type type;

    protected TypeRef() {
        ParameterizedType superclass = (ParameterizedType) getClass().getGenericSuperclass();
        type = superclass.getActualTypeArguments()[0];
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof TypeRef && ((TypeRef)o).type.equals(type);
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }

    public Type getType() {
        return type;
    }
}
