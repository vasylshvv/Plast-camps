package plast.org.ua.camps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import plast.org.ua.camps.model.CampsHurtok;
import plast.org.ua.camps.pojo.HurtokUPU;
@Repository
public interface HurtokRepository extends JpaRepository<HurtokUPU, Long>{
	@Query("select new plast.org.ua.camps.model.CampsHurtok(h.id, h.nameHurtok) "
			+ "from HurtokUPU h "
			+ "JOIN h.kurinUPU k "
			+ "where k.id =:kurinID")
	public List<CampsHurtok> findAllHurtokKurin(@Param("kurinID") Long kurinID);
}
