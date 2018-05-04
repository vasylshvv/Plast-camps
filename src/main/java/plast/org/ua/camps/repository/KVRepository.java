package plast.org.ua.camps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import plast.org.ua.camps.pojo.KV;
@Repository
public interface KVRepository extends JpaRepository<KV, Long>{

}
