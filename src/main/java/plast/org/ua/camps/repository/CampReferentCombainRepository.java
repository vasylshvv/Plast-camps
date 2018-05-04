package plast.org.ua.camps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import plast.org.ua.camps.pojo.CampReferentCombain;

@Repository
public interface CampReferentCombainRepository extends JpaRepository<CampReferentCombain, Long>{
	
	@Modifying
    @Transactional
	@Query("delete from CampReferentCombain where campsid = ?1")
	public void deleteRefCampCombain(Long id);
	
	@Modifying
    @Transactional
	@Query(" from CampReferentCombain where campsid = ?1")
	public List<CampReferentCombain> findReferent(Long id);
	
}
