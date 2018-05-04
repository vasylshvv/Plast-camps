package plast.org.ua.camps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import plast.org.ua.camps.pojo.CampOkruhaTb;
import plast.org.ua.camps.pojo.PositionCamp;

@Repository
public interface PositionCampRepository extends JpaRepository<PositionCamp, Long>{
	@Modifying
    @Transactional
	@Query("delete from PositionCamp where campsid = ?1")
	public void deletePosition(Long id);
	
	@Query(" from PositionCamp where camps.id =?1")
	public PositionCamp findPositionCamp(@Param("campsid") Long campsid);
	
}
