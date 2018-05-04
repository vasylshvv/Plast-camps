package plast.org.ua.camps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import plast.org.ua.camps.pojo.Ulad;
@Repository
public interface UladRepository extends JpaRepository<Ulad, Long>{

}
