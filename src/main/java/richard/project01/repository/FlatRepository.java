package richard.project01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import richard.project01.domain.Flat;

@Repository
public interface FlatRepository extends JpaRepository<Flat,Long> {
}
