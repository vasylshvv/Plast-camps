package plast.org.ua.camps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import plast.org.ua.camps.pojo.CampOkruhaTb;
import plast.org.ua.camps.pojo.CampSMHurtok;

@Repository
public interface CampSMHurtokRepository extends JpaRepository<CampSMHurtok, Long>{
	@Query(" from CampSMHurtok where camps.id =?1")
	public List<CampSMHurtok> findCampSMHurtok(@Param("campsid") Long campsid);
	
	 	@Modifying
	    @Transactional
	    @Query("delete from CampSMHurtok where camps.id = ?1")
	  public  void deletCampSMHurtok(Long id);
}
