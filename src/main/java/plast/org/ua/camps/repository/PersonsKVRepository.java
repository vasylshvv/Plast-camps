package plast.org.ua.camps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import plast.org.ua.camps.pojo.PersonsKV;

@Repository
public interface PersonsKVRepository extends JpaRepository<PersonsKV, Long>{

}
