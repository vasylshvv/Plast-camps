package plast.org.ua.camps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import plast.org.ua.camps.model.CampsStanytsya;
import plast.org.ua.camps.pojo.Stanytsya;
@Repository
public interface StanytsyaRepository extends JpaRepository<Stanytsya, Long>{
	
	@Query("select new plast.org.ua.camps.model.CampsStanytsya(s.id, s.namestan) "
			+ "from Stanytsya s "
			+ "JOIN s.okruha as st "
			+ "where st.id = :idOkruha order by s.namestan asc")
	public List<CampsStanytsya> findStanytsyaOkruha(@Param("idOkruha") Long idOkruha);
	
	@Query("select new plast.org.ua.camps.model.CampsStanytsya(s.id, s.namestan) "
			+ "from Stanytsya s order by s.namestan asc")
	public List<CampsStanytsya> findAllStanytsya();

}
