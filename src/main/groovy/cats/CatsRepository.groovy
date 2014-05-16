package cats;

import org.springframework.data.repository.CrudRepository;

public interface CatsRepository extends CrudRepository<Cat, Long> {
}
