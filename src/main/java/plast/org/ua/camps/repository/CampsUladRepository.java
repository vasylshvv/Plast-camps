package plast.org.ua.camps.repository;

import java.util.List;

import javax.persistence.NamedNativeQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import plast.org.ua.camps.pojo.Camps;
import plast.org.ua.camps.pojo.CampsUlad;
@Repository
public interface CampsUladRepository extends JpaRepository<CampsUlad, Long>{

	@Query(" from CampsUlad where camps.id =?1")
	public List<CampsUlad> findCampUlad(@Param("campsid") Long campsid);
	
	 	@Modifying
	    @Transactional
	    @Query("delete from CampsUlad where campsid = ?1")
	  public  void deletCampsUlad(Long id);
	
}
