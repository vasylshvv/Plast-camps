package plast.org.ua.camps.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import plast.org.ua.camps.model.CampName;
import plast.org.ua.camps.pojo.Camps;
@Repository
public interface CampsRepository extends JpaRepository<Camps, Long>{
	@Query("select new plast.org.ua.camps.model.CampName (c.id, c.name) from Camps c "
			+ "JOIN c.statusID as s "
			+ "where s.id = :idStatus")
	List<CampName> findSelectCamps(@Param("idStatus") Long idStatus);
	
	@Query("from Camps c where c.id = :campid")
	public Camps findOneCamp(@Param("campid") Long campid);


}
