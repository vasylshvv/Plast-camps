package plast.org.ua.camps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import plast.org.ua.camps.pojo.CampsKurinStPl;

@Repository
public interface CampsKurinStPlRepository extends JpaRepository<CampsKurinStPl, Long>{
	
	@Transactional
	@Modifying
	@Query("delete CampsKurinStPl where campsid = ?1")
	public void deleteCampsKurinStPl(Long id);
	
	
	@Transactional
	@Modifying
	@Query("from CampsKurinStPl where campsid = ?1")
	public List<CampsKurinStPl> findCampsKurinStPl(Long id);
}
