package plast.org.ua.camps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import plast.org.ua.camps.model.CampsKurinUSPUPS;
import plast.org.ua.camps.pojo.KurinUSPUPS;

@Repository
public interface CampsKurinUSPUPSRepository extends JpaRepository<KurinUSPUPS, Long>{

		@Query("select new plast.org.ua.camps.model.CampsKurinUSPUPS(k.id, k.namekurin) "
				+ "from KurinUSPUPS k")
		public List<CampsKurinUSPUPS> findAllKurinUSPUPS();
}
