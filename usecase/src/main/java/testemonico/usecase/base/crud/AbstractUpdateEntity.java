package testemonico.usecase.base.crud;

import testemonico.usecase.port.BaseRepository;

public abstract class AbstractUpdateEntity<E, I, R extends BaseRepository<E, I>> {

    private final R repository;

    public AbstractUpdateEntity(R repository) {
        this.repository = repository;
    }

    public E update(E entity) {
        return repository.update(entity);
    }
}
