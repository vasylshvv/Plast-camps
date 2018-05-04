package plast.org.ua.camps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import plast.org.ua.camps.pojo.VyshkilTabir;

@Repository
public interface VyshkilTabirRepository extends JpaRepository<VyshkilTabir, Long>{

}
