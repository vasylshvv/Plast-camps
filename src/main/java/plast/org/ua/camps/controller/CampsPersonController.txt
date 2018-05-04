package plast.org.ua.camps.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import plast.org.ua.camps.dao.CampPersonsDAO;
import plast.org.ua.camps.dao.KVDAO;
import plast.org.ua.camps.dao.KurinUPSUPSDAO;
import plast.org.ua.camps.dao.PersonKurinUSPUPSDAO;
import plast.org.ua.camps.dao.PersonStanytsyaDAO;
import plast.org.ua.camps.dao.PersonStupinDAO;
import plast.org.ua.camps.dao.PersonVyshkilTabirDAO;
import plast.org.ua.camps.dao.PersonsKVDAO;
import plast.org.ua.camps.dao.PersonsVyshkilDAO;
import plast.org.ua.camps.dao.StanytsyaDAO;
import plast.org.ua.camps.dao.StupinDAO;
import plast.org.ua.camps.dao.UladDAO;
import plast.org.ua.camps.dao.VyshkilDAO;
import plast.org.ua.camps.dao.VyshkilTabirDAO;
import plast.org.ua.camps.model.CampMemberRegistration;
import plast.org.ua.camps.model.CampMembers;
import plast.org.ua.camps.model.CampQualificationMember;
import plast.org.ua.camps.model.CampsFullInfoMember;
import plast.org.ua.camps.model.CampsFullMemebers;
import plast.org.ua.camps.model.CampsMemberKV;
import plast.org.ua.camps.model.CampsMembersKurin;
import plast.org.ua.camps.model.CampsMembersStanStupin;
import plast.org.ua.camps.model.CampsMembersTabir;
import plast.org.ua.camps.model.CampsOkruha;
import plast.org.ua.camps.pojo.KV;
import plast.org.ua.camps.pojo.KurinUSPUPS;
import plast.org.ua.camps.pojo.Okruha;
import plast.org.ua.camps.pojo.PersonKurinUSPUPS;
import plast.org.ua.camps.pojo.PersonStupinUlad;
import plast.org.ua.camps.pojo.PersonVyshkilTabir;
import plast.org.ua.camps.pojo.Persons;
import plast.org.ua.camps.pojo.PersonsKV;
import plast.org.ua.camps.pojo.PersonsStanytsya;
import plast.org.ua.camps.pojo.PersonsVyshkil;
import plast.org.ua.camps.pojo.Stanytsya;
import plast.org.ua.camps.pojo.Stupin;
import plast.org.ua.camps.pojo.Ulad;
import plast.org.ua.camps.pojo.Vyshkil;
import plast.org.ua.camps.pojo.VyshkilTabir;

@RestController
@RequestMapping("/plastapi")
public class CampsPersonController {
	private Date datebirth, datesworn, datereg;
	private PersonsStanytsya personsStanytsya;
	private Stanytsya stanytsya;
	private PersonStupinUlad personStupinUlad;
	private Stupin stupin;
	private Ulad ulad;
	private PersonKurinUSPUPS personKurinUSPUPS;
	private KurinUSPUPS kurinUSPUPS;
	private PersonsKV personsKV;
	private KV kv;
	private PersonsVyshkil personsVyshkil;
	private Vyshkil vyshkil;
	private PersonVyshkilTabir personVyshkilTabir;
	private VyshkilTabir vyshkilTabir;
	private List<CampQualificationMember> listQualificMemb;

	@Autowired
	CampPersonsDAO campPersonsDAO;

	@Autowired
	StanytsyaDAO stanDao;

	@Autowired
	PersonStanytsyaDAO perStanDao;

	@Autowired
	UladDAO uladDao;

	@Autowired
	StupinDAO stupinDao;

	@Autowired
	PersonStupinDAO persStupDao;

	@Autowired
	KurinUPSUPSDAO kurinuspdao;

	@Autowired
	PersonKurinUSPUPSDAO perkurDao;

	@Autowired
	KVDAO kvDao;

	@Autowired
	PersonsKVDAO perskvDao;

	@Autowired
	VyshkilDAO vyshkilDao;

	@Autowired
	PersonsVyshkilDAO persVyshDao;

	@Autowired
	VyshkilTabirDAO vyshkilTabirDAO;

	@Autowired
	PersonVyshkilTabirDAO personVyshkilTabirDAO;

	@CrossOrigin
	@GetMapping("/members")
	public ResponseEntity<List<CampMembers>> findPersonsUSP() {

		List<CampMembers> listCampMembers = null;

		listCampMembers = campPersonsDAO.findMembers().subList(0, 20);

		if (listCampMembers == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok().body(listCampMembers);
		}

	}

	@CrossOrigin
	@GetMapping("/member/{memberID}")
	public ResponseEntity<CampsFullInfoMember> findFullInformation(@PathVariable(value = "memberID") Long id) {

		CampsMembersStanStupin campmembstanstupin = campPersonsDAO.findStanStupinMembers(id);
		CampsMembersKurin campsMembersKurin = campPersonsDAO.findKurinMembers(id);
		CampsMemberKV campsMembersKv = campPersonsDAO.findKVMember(id);
		CampsMembersTabir campsVyshkilTabir = campPersonsDAO.findMemberVyshkil(id);

		listQualificMemb = campPersonsDAO.findOneQualificationMember(id);
		String nameauqlific = null;

		for (CampQualificationMember campQualificationMember : listQualificMemb) {			
			nameauqlific = campQualificationMember.getName();
		}

		if (nameauqlific == null) {
			listQualificMemb = null;
		}

		CampsFullInfoMember fullInfoMember = new CampsFullInfoMember(campmembstanstupin.getStupin(),
				campmembstanstupin.getName(), campsMembersKurin.getKurin(), campmembstanstupin.getBirthday(),
				campmembstanstupin.getStanytsya(), campsMembersKv.getKvstupin(), listQualificMemb,
				campsVyshkilTabir.getVyshkolycamp(), campmembstanstupin.getEmail(), campmembstanstupin.getPhone());

		return ResponseEntity.ok().body(fullInfoMember);

	}

	@CrossOrigin
	@GetMapping("/members/")
	public ResponseEntity<List<CampMembers>> findPersonsNameUSP(@RequestParam(value = "search") String search) {

		List<CampMembers> listCampMembers = campPersonsDAO.findMembersName(search);

		if (listCampMembers == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok().body(listCampMembers);
		}

	}

	@CrossOrigin
	@PostMapping("/member")
	public CampMemberRegistration addNewMember(@Valid @RequestBody CampMemberRegistration memberReg) {
		Persons member = new Persons();
		member.setLastName(memberReg.getLastName());
		member.setFirstName(memberReg.getFirstName());
		member.setDatebirth(memberReg.getBirthday());
		member.setPhoneNumber(memberReg.getPhone());
		member.setEmail(memberReg.getEmail());

		// if(memberReg.getDataSword()!=""){
		// datesworn = new Date(dateFormat.parse(dateswornstr).getTime());
		// persons.setDateSworn(datesworn);
		// }
		//
		member.setDateSworn(memberReg.getDataSword());
		member.setAddress(memberReg.getAddress());
		member.setJobeducation(memberReg.getWork());
		campPersonsDAO.addNewPerson(member);

		/** add stanytsya persons data */

		stanytsya = stanDao.findOneStan(memberReg.getStanytsyaID());
		personsStanytsya = new PersonsStanytsya();
		personsStanytsya.setStanytsya(stanytsya);
		personsStanytsya.setPersons(member);
		perStanDao.addPersonStan(personsStanytsya);

		/** add new ulad and stupin data */
		

		ulad = uladDao.findUladOne(memberReg.getUladId());
		stupin = stupinDao.findOneStupin(memberReg.getStupinID());
		datereg = memberReg.getDataVstup();
		personStupinUlad = new PersonStupinUlad();
		personStupinUlad.setDatefrom(datereg);
		personStupinUlad.setPersons(member);
		personStupinUlad.setStupin(stupin);
		personStupinUlad.setUlad(ulad);
		persStupDao.saveStupinUlad(personStupinUlad);

		// add kurin
		if (memberReg.getKurinUSPID() != null) {
			kurinUSPUPS = kurinuspdao.findOneKurinUSP(memberReg.getKurinUSPID());
			personKurinUSPUPS = new PersonKurinUSPUPS();
			personKurinUSPUPS.setKurinUSPUPS(kurinUSPUPS);
			personKurinUSPUPS.setPersons(member);
			perkurDao.savePersonKurinUSP(personKurinUSPUPS);
		}

		if (memberReg.getStupinKV() != null) {
			kv = kvDao.findOneKv(memberReg.getStupinKV());
			personsKV = new PersonsKV();
			personsKV.setKv(kv);
			personsKV.setPersons(member);
			perskvDao.savePersonsKV(personsKV);
		}

		if (memberReg.getVyshkil() != null) {

			List<Long> listVyshkil = memberReg.getVyshkil();
			for (Long vysh : listVyshkil) {

				vyshkil = vyshkilDao.findOneVyshkil(vysh);
				personsVyshkil = new PersonsVyshkil();
				personsVyshkil.setVyshkil(vyshkil);
				personsVyshkil.setPersons(member);
				persVyshDao.savePersonVyshkil(personsVyshkil);
			}
		}
		if (memberReg.getVyshkilCamp() != null) {

			vyshkilTabir = vyshkilTabirDAO.findOneVyshkilTabir(memberReg.getVyshkilCamp());
			personVyshkilTabir = new PersonVyshkilTabir();
			personVyshkilTabir.setVyshkilTabir(vyshkilTabir);
			personVyshkilTabir.setPersons(member);
			personVyshkilTabirDAO.savePersonVyshkilTabir(personVyshkilTabir);
		}

		CampMemberRegistration campregmember = new CampMemberRegistration(member.getId(), member.getAddress(),
				member.getDatebirth(), member.getDateSworn(), memberReg.getDataVstup(), member.getEmail(),
				member.getFirstName(), member.getLastName(), memberReg.getKurinUSPID(), member.getPhoneNumber(),
				memberReg.getStanytsyaID(), memberReg.getStupinID(), memberReg.getStupinKV(), memberReg.getUladId(),
				memberReg.getVyshkil(), memberReg.getVyshkilCamp(), member.getJobeducation());
		return campregmember;

	}
}
