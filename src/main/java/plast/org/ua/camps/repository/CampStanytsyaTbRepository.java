package plast.org.ua.camps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import plast.org.ua.camps.pojo.CampOkruhaTb;
import plast.org.ua.camps.pojo.CampStanytsyaTb;

@Repository
public interface CampStanytsyaTbRepository extends JpaRepository<CampStanytsyaTb, Long>{
	@Query(" from CampStanytsyaTb where camps.id =?1")
	public List<CampStanytsyaTb> findCampStanytsyaTb(@Param("campsid") Long campsid);
	
	 	@Modifying
	    @Transactional
	    @Query("delete from CampStanytsyaTb where camps.id = ?1")
	  public  void deletCampStanytsyaTb(Long id);
}
