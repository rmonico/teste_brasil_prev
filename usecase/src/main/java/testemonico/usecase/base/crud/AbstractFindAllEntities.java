package testemonico.usecase.base.crud;

import testemonico.usecase.port.BaseRepository;

import java.util.List;

public class AbstractFindAllEntities<E, I, R extends BaseRepository<E, I>> {

    private final R repository;

    public AbstractFindAllEntities(R repository) {
        this.repository = repository;
    }

    public List<E> findAll() {
        return repository.findAll();
    }
}
