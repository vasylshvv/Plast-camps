package plast.org.ua.camps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import plast.org.ua.camps.model.CampsKurin;
import plast.org.ua.camps.pojo.KurinUPU;

@Repository
public interface KurinRepository extends JpaRepository<KurinUPU, Long>{
	@Query("select new plast.org.ua.camps.model.CampsKurin(k.id, k.numberKurin, k.nameKurin) "
			+ "from KurinUPU k "
			+ "JOIN k.stanytsya as s "
			+ "where s.id = :stanytsyaID "
			+ "order by k.numberKurin asc")
	public List<CampsKurin> findAllKurinStanytsya(@Param("stanytsyaID") Long stanytsyaID);
	
	@Query("select new plast.org.ua.camps.model.CampsKurin(k.id, k.numberKurin, k.nameKurin) "
			+ "from KurinUPU k "
			+ "order by k.numberKurin asc")
	public List<CampsKurin> findAllKurin();
}
