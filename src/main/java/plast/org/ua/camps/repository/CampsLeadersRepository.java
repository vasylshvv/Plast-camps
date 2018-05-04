package plast.org.ua.camps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import plast.org.ua.camps.pojo.CampsLeaders;

@Repository
public interface CampsLeadersRepository extends JpaRepository<CampsLeaders, Long>{
	@Modifying
    @Transactional
	@Query("delete from CampsLeaders where campsid = ?1")
	public void deleteLeaders(Long id);
	
	@Query("from CampsLeaders where campsid = ?1")
	public List<CampsLeaders> findCampLeaders(Long id);
}
