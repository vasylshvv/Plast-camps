package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.model.CampMembers;
import plast.org.ua.camps.model.CampQualificationMember;
import plast.org.ua.camps.model.CampsFullMemebers;
import plast.org.ua.camps.model.CampsMemberKV;
import plast.org.ua.camps.model.CampsMembersKurin;
import plast.org.ua.camps.model.CampsMembersStanStupin;
import plast.org.ua.camps.model.CampsMembersTabir;
import plast.org.ua.camps.pojo.Persons;
import plast.org.ua.camps.repository.PersonRepository;

@Service
public class CampPersonsDAO {

		@Autowired
		PersonRepository personRepository;
		
		public List<CampMembers> findMembers(){
			return personRepository.findMembers();
		}
		
		public List<CampMembers> findMembersName(String name){
			return personRepository.findMembersName(name);
		}
		
		public CampsMembersStanStupin findStanStupinMembers(Long memberID){
			return personRepository.findStanStupinMembers(memberID);
		}
		
		public List<CampQualificationMember> findOneQualificationMember(Long memberId){
			return personRepository.findMemeberQualification(memberId);
		}
		public CampsMembersKurin findKurinMembers(Long memberId){
			return personRepository.findKurinMembers(memberId);
		}
		
		public CampsMemberKV findKVMember(Long memberID){
			return personRepository.findKVMember(memberID);
		}
		
		public CampsMembersTabir findMemberVyshkil(Long memberID){
			return personRepository.findMemberVyshkil(memberID);
		}
		
		public Persons addNewPerson(Persons persons){
			return personRepository.save(persons);
		}
		
		public Persons findOnePerson(Long id){
			return personRepository.getOne(id);
		}
}
