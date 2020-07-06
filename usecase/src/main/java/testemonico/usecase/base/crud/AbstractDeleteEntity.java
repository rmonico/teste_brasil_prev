package testemonico.usecase.base.crud;

import testemonico.usecase.port.BaseRepository;

public abstract class AbstractDeleteEntity<E, I, R extends BaseRepository<E, I>> {

    private final R repository;

    public AbstractDeleteEntity(R repository) {
        this.repository = repository;
    }

    public E delete(I id) {
        return repository.delete(id);
    }


}
