package testemonico.repository;

import testemonico.domain.entity.Entity;

import java.util.*;

public abstract class AbstractInMemoryRepository<E extends Entity<I>, I> {
    private final Map<I, E> database = new HashMap<>();

    public E create(E entity) {
        return database.put(entity.getId(), entity);
    }

    public E update(E entity) {
        final E old = database.get(entity.getId());

        create(entity);

        return old;
    }

    public E delete(E entity) {
        return database.remove(entity.getId());
    }

    public Optional<E> findById(I id) {
        return Optional.ofNullable(database.get(id));
    }

    public List<E> findAll() {
        return new ArrayList<>(database.values());
    }

}