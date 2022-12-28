package me.easytodo.chapter05.item26.genericdao;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class GenericRepository<E extends Entity> {
    private Set<E> accounts;

    public GenericRepository() {
        this.accounts = new HashSet<>();
    }

    public Optional<E> findById(Long id) {
        return accounts.stream().filter(a -> a.getId().equals(id)).findAny();
    }

    public void add(E account) {
        this.accounts.add(account);
    }
}
