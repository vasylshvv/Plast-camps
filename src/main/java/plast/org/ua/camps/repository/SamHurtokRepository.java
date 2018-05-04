package plast.org.ua.camps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import plast.org.ua.camps.model.CampsSamHurtok;
import plast.org.ua.camps.pojo.SamHurtokUPU;
@Repository
public interface SamHurtokRepository extends JpaRepository<SamHurtokUPU, Long>{
	@Query("select new plast.org.ua.camps.model.CampsSamHurtok(sh.id, sh.nameSamHurtok) "
			+ "from SamHurtokUPU sh "
			+ "JOIN sh.stanytsya as s "
			+ "where s.id = :stanytsyaID")
	public List<CampsSamHurtok> findAllSamHurtokStan(@Param("stanytsyaID") Long stanytsyaID);
}
