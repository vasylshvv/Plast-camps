package plast.org.ua.camps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import plast.org.ua.camps.pojo.CampHurtokTb;
import plast.org.ua.camps.pojo.CampOkruhaTb;

@Repository
public interface CampHurtokTbRepository extends JpaRepository<CampHurtokTb, Long>{
	@Query(" from CampHurtokTb where camps.id =?1")
	public List<CampHurtokTb> findCampHurtokTb(@Param("campsid") Long campsid);
	
	 	@Modifying
	    @Transactional
	    @Query("delete from CampHurtokTb where camps.id = ?1")
	  public  void deletCampHurtokTb(Long id);
}
