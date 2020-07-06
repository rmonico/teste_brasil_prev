package testemonico.usecase.base.crud;

import testemonico.usecase.port.BaseRepository;

import java.util.Optional;

public abstract class AbstractFindEntityById<E, I, R extends BaseRepository<E, I>> {

    private final R repository;

    public AbstractFindEntityById(R repository) {
        this.repository = repository;
    }

    public Optional<E> findById(I id) {
        return repository.findById(id);
    }
}
