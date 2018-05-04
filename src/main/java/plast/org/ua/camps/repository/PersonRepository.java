package plast.org.ua.camps.repository;

import java.util.Date;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import plast.org.ua.camps.model.CampMembers;
import plast.org.ua.camps.model.CampQualificationMember;
import plast.org.ua.camps.model.CampsFullMemebers;
import plast.org.ua.camps.model.CampsMemberKV;
import plast.org.ua.camps.model.CampsMembersKurin;
import plast.org.ua.camps.model.CampsMembersStanStupin;
import plast.org.ua.camps.model.CampsMembersTabir;
import plast.org.ua.camps.pojo.Persons;
@Repository
public interface PersonRepository extends JpaRepository<Persons, Long>{
	@Query("select new plast.org.ua.camps.model.CampMembers(p.id, concat(p.lastName, ' ', p.firstName) as name, s.nameStupin) "
			+ "from PersonStupinUlad psu "
			+ "JOIN psu.persons p "
			+ "JOIN psu.ulad u "
			+ "JOIN psu.stupin s "
			+ "where u.nameulad in ('УСП','УПС') ")
		public List<CampMembers> findMembers();
	
	@Query("select new plast.org.ua.camps.model.CampMembers(p.id, concat(p.lastName, ' ', p.firstName) as name, s.nameStupin) "
			+ "from PersonStupinUlad psu "
			+ "JOIN psu.persons p "
			+ "JOIN psu.ulad u "
			+ "JOIN psu.stupin s "
			+ "where u.nameulad in ('УСП','УПС') "
			+ "and (p.lastName like :name% or  p.firstName like :name%)")
	public List<CampMembers> findMembersName(@Param("name") String name);
	
	@Query("select new plast.org.ua.camps.model.CampsMembersStanStupin(s.nameStupin, "
										+ "concat(p.lastName, ' ', p.firstName) as name, "
										+ "p.datebirth, st.namestan, "
										+" p.email, p.phoneNumber) "
			+ "from PersonStupinUlad psu, "
			+ "PersonsStanytsya ps "
			+ "JOIN psu.persons p "
			+ "JOIN psu.ulad u "
			+ "JOIN psu.stupin s "
			+ "JOIN ps.persons pjoinst "
			+ "JOIN ps.stanytsya st "
			+ "where u.nameulad in ('УСП','УПС') "
			+ "and pjoinst.id = p.id "
			+ "and p.id =:memberID")
	public CampsMembersStanStupin findStanStupinMembers(@Param("memberID") Long memberID);
	
	
	@Query("select new plast.org.ua.camps.model.CampQualificationMember(v.namevyshkil) "
			+ "from PersonsVyshkil pv "					
			+ "RIGHT JOIN pv.persons p "										
			+ "LEFT JOIN pv.vyshkil v "
			+ "where p.id=:memberID")
	public List<CampQualificationMember> findMemeberQualification(@Param("memberID") Long memberID);
	
	
	@Query("select new plast.org.ua.camps.model.CampsMembersKurin(kusp.namekurin) "
			+ "from PersonKurinUSPUPS pkusp "					
			+ "RIGHT JOIN pkusp.persons p "										
			+ "LEFT JOIN pkusp.kurinUSPUPS kusp "					
			+ "where p.id=:memberID")
	public CampsMembersKurin findKurinMembers(@Param("memberID") Long memberID);
	
	
	@Query("select new plast.org.ua.camps.model.CampsMemberKV(k.name) "
			+ "from PersonsKV pkv "					
			+ "RIGHT JOIN pkv.persons p "										
			+ "LEFT JOIN pkv.kv k "					
			+ "where p.id=:memberID")
	public CampsMemberKV findKVMember(@Param("memberID") Long memberID);
	
	
	@Query("select new plast.org.ua.camps.model.CampsMembersTabir(vt.namevyshkiltabir) "
			+ "from PersonVyshkilTabir pvt "					
			+ "RIGHT JOIN pvt.persons p "										
			+ "LEFT JOIN pvt.vyshkilTabir vt "					
			+ "where p.id=:memberID")
	public CampsMembersTabir findMemberVyshkil(@Param("memberID") Long memberID);
	
	

}
