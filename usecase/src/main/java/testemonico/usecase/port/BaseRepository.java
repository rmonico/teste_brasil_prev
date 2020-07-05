package testemonico.usecase.port;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<E, I> {

    E create(E entity);

    E update(E entity);

    E delete(E entity);

    Optional<E> findById(I id);

    List<E> findAll();
}
