package plast.org.ua.camps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import plast.org.ua.camps.pojo.CampOkruhaTb;


@Repository
public interface CampOkruhaTbRepository extends JpaRepository<CampOkruhaTb, Long>{
	@Query(" from CampOkruhaTb where camps.id =?1")
	public List<CampOkruhaTb> findCampOkruhaTb(@Param("campsid") Long campsid);
	
	 	@Modifying
	    @Transactional
	    @Query("delete from CampOkruhaTb where camps.id = ?1")
	  public  void deletCampOkruhaTb(Long id);
}
