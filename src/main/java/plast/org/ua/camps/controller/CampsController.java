package plast.org.ua.camps.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import plast.org.ua.camps.dao.CampGenderDAO;
import plast.org.ua.camps.dao.CampHurtokTbDAO;
import plast.org.ua.camps.dao.CampKurinTbDAO;
import plast.org.ua.camps.dao.CampOkruhaTbDAO;
import plast.org.ua.camps.dao.CampPersonsDAO;
import plast.org.ua.camps.dao.CampReferentCombainDAO;
import plast.org.ua.camps.dao.CampSMHurtokDAO;
import plast.org.ua.camps.dao.CampStanytsyaTbDAO;
import plast.org.ua.camps.dao.CampsDAO;
import plast.org.ua.camps.dao.CampsKurinStPlDAO;
import plast.org.ua.camps.dao.CampsLeadersDAO;
import plast.org.ua.camps.dao.CampsReferentsDAO;
import plast.org.ua.camps.dao.CampsStatusDAO;
import plast.org.ua.camps.dao.CampsUladDAO;
import plast.org.ua.camps.dao.HurtokDAO;
import plast.org.ua.camps.dao.KurinDAO;
import plast.org.ua.camps.dao.KurinUPSUPSDAO;
import plast.org.ua.camps.dao.LeadersDAO;
import plast.org.ua.camps.dao.OkruhaDAO;
import plast.org.ua.camps.dao.PositionCampDAO;
import plast.org.ua.camps.dao.SamHurtokDAO;
import plast.org.ua.camps.dao.StanytsyaDAO;
import plast.org.ua.camps.dao.UladDAO;
import plast.org.ua.camps.main.SendEmail;
import plast.org.ua.camps.model.CampLeader;
import plast.org.ua.camps.model.CampLeaderPut;
import plast.org.ua.camps.model.CampMembers;
import plast.org.ua.camps.model.CampName;
import plast.org.ua.camps.model.CampPosition;
import plast.org.ua.camps.model.CampRefers;
import plast.org.ua.camps.model.CampRegister;
import plast.org.ua.camps.model.CampRespAuth;
import plast.org.ua.camps.model.CampsAuthorization;
import plast.org.ua.camps.model.CampsHurtok;
import plast.org.ua.camps.model.CampsInformationFull;
import plast.org.ua.camps.model.CampsKurin;
import plast.org.ua.camps.model.CampsKurinUSPUPS;
import plast.org.ua.camps.model.CampsMembersStanStupin;
import plast.org.ua.camps.model.CampsOkruha;
import plast.org.ua.camps.model.CampsSamHurtok;
import plast.org.ua.camps.model.CampsStanytsya;
import plast.org.ua.camps.pojo.CampGender;
import plast.org.ua.camps.pojo.CampHurtokTb;
import plast.org.ua.camps.pojo.CampKurinTb;
import plast.org.ua.camps.pojo.CampOkruhaTb;
import plast.org.ua.camps.pojo.CampReferentCombain;
import plast.org.ua.camps.pojo.CampSMHurtok;
import plast.org.ua.camps.pojo.CampStanytsyaTb;
import plast.org.ua.camps.pojo.CampStatus;
import plast.org.ua.camps.pojo.Camps;
import plast.org.ua.camps.pojo.CampsKurinStPl;
import plast.org.ua.camps.pojo.CampsLeaders;
import plast.org.ua.camps.pojo.CampsReferents;
import plast.org.ua.camps.pojo.CampsUlad;
import plast.org.ua.camps.pojo.HurtokUPU;
import plast.org.ua.camps.pojo.KurinUPU;
import plast.org.ua.camps.pojo.KurinUSPUPS;
import plast.org.ua.camps.pojo.Leaders;
import plast.org.ua.camps.pojo.Okruha;
import plast.org.ua.camps.pojo.Persons;
import plast.org.ua.camps.pojo.PositionCamp;
import plast.org.ua.camps.pojo.SamHurtokUPU;
import plast.org.ua.camps.pojo.Stanytsya;
import plast.org.ua.camps.pojo.Ulad;


@RestController
@RequestMapping("/plastapi")
public class CampsController {

	private Ulad ulad;
	private CampStatus status;
	private CampRegister campRegister;
	private CampsUlad campsUlad;
	private String jwtToken = null;
	private CampGender campGender;
	private Camps camp;
	private CampsReferents campsReferents;
	private CampReferentCombain campReferentCombain;
	private KurinUSPUPS kurinSTPL;
	private Okruha okruha;
	private Stanytsya stanytsya;
	private KurinUPU kurinUPU;
	private HurtokUPU hurtokUPU;
	private SamHurtokUPU samHurtokUPU;
	private CampsKurinStPl campsKurinStPl;
	private CampOkruhaTb campOkruhaTb;
	private CampStanytsyaTb campStanytsyaTb;
	private CampKurinTb campKurinTb;
	private CampHurtokTb campHurtokTb;
	private CampSMHurtok campSMHurtok;
	private CampsInformationFull campsInformationFull = null;
	private List<CampsUlad> listCampsUlad;
	private List<CampLeader> provid;
	private List<CampLeaderPut> providPut;
	private List<CampsOkruha> listCampOkruha;
	private List<CampsStanytsya> listCampStanytsya;
	private List<CampsKurin> listCampKurin;
	private List<CampsHurtok> listCampHurtok;
	private List<CampsSamHurtok> listCampSamHurtok;
	private List<CampRefers> listCampRefers;
	private List<CampsKurinUSPUPS> listCampsKurinUSPUPS;
	private CampPosition campPosition;
	private PositionCamp position;
	private CampsLeaders campsLeadersTB;
	private Leaders leaders;
	private Persons member;
	private CampsOkruha campsOkruha;
	private CampsStanytsya campsStanytsya;
	private CampsKurin campsKurin;
	private CampsHurtok campsHurtok;
	private CampsSamHurtok campsSamHurtok;
	private CampLeader campLeader;
	private CampMembers members;
	private CampsMembersStanStupin csampsMembersStanStupin;
	private CampRefers campRefers;
	private CampsKurinUSPUPS campsKurinUSPUPS; 
	

	@Autowired
	CampsDAO campsDAO;

	@Autowired
	UladDAO uladDao;

	@Autowired
	CampsStatusDAO statusDao;

	@Autowired
	CampsUladDAO campsUladDao;

	@Autowired
	CampGenderDAO campGenderDAO;

	@Autowired
	CampsReferentsDAO campsReferentsDAO;

	@Autowired
	CampReferentCombainDAO campReferentCombainDAO;

	@Autowired
	CampsKurinStPlDAO campsKurinStPlDAO;

	@Autowired
	KurinUPSUPSDAO kurinUPSUPSDAO;

	@Autowired
	CampOkruhaTbDAO campOkruhaTbDAO;

	@Autowired
	CampStanytsyaTbDAO campStanytsyaTbDAO;

	@Autowired
	CampKurinTbDAO campKurinTbDAO;

	@Autowired
	CampHurtokTbDAO campHurtokTbDAO;

	@Autowired
	CampSMHurtokDAO campSMHurtokDAO;

	@Autowired
	OkruhaDAO okruhaDAO;

	@Autowired
	StanytsyaDAO stanytsyaDAO;

	@Autowired
	KurinDAO kurinDAO;

	@Autowired
	HurtokDAO hurtokDAO;

	@Autowired
	SamHurtokDAO samHurtokDAO;

	@Autowired
	PositionCampDAO positionDAO;

	@Autowired
	CampPersonsDAO membersDAO;

	@Autowired
	CampsLeadersDAO campsLeadersDAO;

	@Autowired
	LeadersDAO leadersDAO;
	@Autowired
	CampPersonsDAO campPersonsDAO;

	/* save employye */
	@CrossOrigin
	@PostMapping("/camps")
	public CampRegister createCamps(@Valid @RequestBody CampRegister cmp) throws UnsupportedEncodingException {
		
		System.out.println("datestartPOST = "+cmp.getDateStart());
		System.out.println("dateendPOST = "+cmp.getDateEnd());
		
		status = statusDao.findOneCampStatus(cmp.getStatusID());
		Camps camps = new Camps(cmp.getName(), cmp.getDateStart(), cmp.getDateEnd(), cmp.getEmail(), cmp.getPassword(),
				status);
		campsDAO.createCamp(camps);
	

		// List<Ulad> uladList = cmp.getUlad();
		List<Long> uladID = cmp.getUladID();

		for (Long l : uladID) {
			System.out.println("uladID = " + l);
			ulad = uladDao.findUladOne(l);
			campsUlad = new CampsUlad(camps, ulad);

			campsUladDao.creatCampUlad(campsUlad);
		}

		jwtToken = Jwts.builder().setSubject(cmp.getName()).setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS512, "camps").compact();

		campRegister = new CampRegister(camps.getId(), camps.getName(), camps.getDateStart(), camps.getDateEnd(),
				camps.getEmail(), camps.getPassword(), uladID, camps.getStatusID().getId(), jwtToken);
		cmp = campRegister;
		
		
		StringBuffer str = new StringBuffer();
		str.append("<h3>СКОБ!</h3>");
		str.append("<p>Тобою зареєстровано "+status.getNameCampStatus() +" табір " + camps.getName() +" </p>");
		str.append("<p>Найближчим часом КТК перегляне отриману інформацію і при першій нагоді зв'яжеться з Тобою.</p>");
		str.append("<p>У випадку будь-яких змін щодо проводу, дат, місця проведення, тощо будь ласка, внесіть зміни у форму.</p><br>");
		str.append("<p><b>Успішного планування та проведення табору!!!</b></p>");
		

		
		String text = str.toString();
		
		SendEmail sendEmail = new SendEmail("techniclsuport@gmail.com", "@ctiv@tion");
		sendEmail.send("Реєстрація табору", text, "vasylshvv@gmail.com", camps.getEmail());
		
		return cmp;
	}
	// public Camps createEmployee(@Valid @RequestBody Camps cmp) {
	// // ulad = uladDao.findUladOne(cmp.getUlad().getId());
	// status = statusDao.findOneCampStatus(cmp.getStatusID().getId());
	// Camps c = new Camps(cmp.getName(), cmp.getDateStart(), cmp.getDateEnd(),
	// cmp.getEmail(), cmp.getPassword(),
	// status);
	// return campsDAO.createCamp(c);
	// }

	@GetMapping("/test")
	public String test() {
		return "Hello World";
	}

	// @GetMapping("/camps/?statusID={statusID}")
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, value = "/camps")
	public ResponseEntity<List<CampName>> getCampsOne(@RequestParam(value = "statusID") Long statusID) {
		// CampName camp = null;
		List<CampName> campList = campsDAO.findSelectCamp(statusID);

		if (campList == null) {
			return ResponseEntity.notFound().build();

		}
		return ResponseEntity.ok().body(campList);
	}

	@CrossOrigin
	@PostMapping("/auth/camp")
	public ResponseEntity<CampRespAuth> authorization(@RequestBody CampsAuthorization authorization)
			throws ServletException {
		CampRespAuth campauth = null;
		Camps onecamp = campsDAO.findOneCamp(authorization.getCampID());
		if (onecamp.getEmail().equals(authorization.getEmail())
				&& onecamp.getPassword().equals(authorization.getPassword())) {
			jwtToken = Jwts.builder().setSubject(onecamp.getName()).setIssuedAt(new Date())
					.signWith(SignatureAlgorithm.HS512, "camps").compact();

			campauth = new CampRespAuth(onecamp.getId(), onecamp.getName(), jwtToken);

		} else {

			throw new ServletException("Invalid login. Please check your name and password.");
		}

		return ResponseEntity.ok().body(campauth);
	}

	// @CrossOrigin
	@PutMapping("/camp/{id}")
	public ResponseEntity<CampsInformationFull> updateCamps(@PathVariable(value = "id") Long campID,
			@RequestBody CampsInfoFull fullInfCamp) {

		System.out.println("datestartPUT = "+fullInfCamp.getDateStart());
		System.out.println("dateendPUT = "+fullInfCamp.getDateEnd());
		
		status = statusDao.findOneCampStatus(fullInfCamp.getStatusID());
		campGender = campGenderDAO.findOnrGender(fullInfCamp.getGender());

		List<Integer> age = fullInfCamp.getAge();
		List<Long> uladID = fullInfCamp.getUladID();

		camp = campsDAO.findOneCamp(campID);

		camp = new Camps(campID, fullInfCamp.getName(), fullInfCamp.getDateStart(), fullInfCamp.getDateEnd(),
				fullInfCamp.getEmail(), camp.getPassword(), status, fullInfCamp.getGoal(), fullInfCamp.getContinuity(),
				fullInfCamp.getPlace(), fullInfCamp.getPrice(), campGender, age.get(0), age.get(1),
				fullInfCamp.getCountMembers(), fullInfCamp.getReasonPrice(), fullInfCamp.getShare(), fullInfCamp.getEventaftercamp());
		campsDAO.createCamp(camp);

		campPosition = fullInfCamp.getPosition();
		positionDAO.deletePosition(campID);
		position = new PositionCamp();
		position.setLat(campPosition.getLat());
		position.setLng(campPosition.getLng());
		position.setCamps(camp);
		positionDAO.createPosition(position);
		campPosition = new CampPosition(campPosition.getLat(), campPosition.getLng());
		
		
		providPut = fullInfCamp.getProvid();
		campsLeadersDAO.deleteLeaders(campID);
		provid = new ArrayList<CampLeader>();
		for (CampLeaderPut cl : providPut) {

			leaders = leadersDAO.findOneLeader(cl.getProvidID());
			member = membersDAO.findOnePerson(cl.getMemberID());
			campsLeadersTB = new CampsLeaders();
			campsLeadersTB.setCamps(camp);
			campsLeadersTB.setCountсamp(cl.getCountcamp());
			campsLeadersTB.setEducation(cl.getEducation());
			campsLeadersTB.setLeaders(leaders);
			campsLeadersTB.setPersons(member);
			campsLeadersDAO.createCampsLeader(campsLeadersTB);
			csampsMembersStanStupin = campPersonsDAO.findStanStupinMembers(cl.getMemberID());
			members = new CampMembers(member.getId(), member.getLastName()+" "+member.getFirstName(), csampsMembersStanStupin.getStupin());
			
			campLeader = new CampLeader(cl.getProvidID(), cl.getEducation(), cl.getCountcamp(), members);
			provid.add(campLeader);
			
			
		}

		campsUladDao.deleteCampsUlad(campID);
		for (Long l : uladID) {

			ulad = uladDao.findUladOne(l);
			campsUlad = new CampsUlad(camp, ulad);
			campsUladDao.creatCampUlad(campsUlad);
		}

		campReferentCombainDAO.deleteCampsReferent(campID);
		campsKurinStPlDAO.deleteCampKurinUsp(campID);
		campOkruhaTbDAO.deleteCampOkruhaTb(campID);
		campStanytsyaTbDAO.deleteCampStanytsyaTb(campID);
		campKurinTbDAO.deleteCampKurinTb(campID);
		campHurtokTbDAO.deleteCampHurtokTb(campID);
		campSMHurtokDAO.deleteCampSMHurtok(campID);
		
		
		listCampRefers = new ArrayList<CampRefers>();
		listCampsKurinUSPUPS = new ArrayList<CampsKurinUSPUPS>();
		listCampOkruha = new ArrayList<CampsOkruha>();
		listCampStanytsya = new ArrayList<CampsStanytsya>();
		listCampKurin = new ArrayList<CampsKurin>();
		listCampHurtok = new ArrayList<CampsHurtok>();
		listCampStanytsya = new ArrayList<CampsStanytsya>();
		listCampSamHurtok = new ArrayList<CampsSamHurtok>();	
		
		switch (Integer.valueOf(fullInfCamp.getStatusID().intValue())) {
		case 15:
		case 14:
		case 13:
			if (fullInfCamp.getReferenturaID() != null && fullInfCamp.getKureniStPl() != null) {
				
				
				for (Long l : fullInfCamp.getReferenturaID()) {
					campsReferents = campsReferentsDAO.findOneReferents(l);
					campReferentCombain = new CampReferentCombain();
					campReferentCombain.setReferents(campsReferents);
					campReferentCombain.setCamps(camp);
					campReferentCombainDAO.greateCombCampRef(campReferentCombain);
					
					campRefers = new CampRefers(campsReferents.getId(), campsReferents.getName());
					listCampRefers.add(campRefers);
				}
				
				
				
				for (Long l : fullInfCamp.getKureniStPl()) {
					kurinSTPL = kurinUPSUPSDAO.findOneKurinUSP(l);
					campsKurinStPl = new CampsKurinStPl();
					campsKurinStPl.setCamps(camp);
					campsKurinStPl.setKurinUSPUPS(kurinSTPL);
					campsKurinStPlDAO.greateCampsKurinStPl(campsKurinStPl);
					
					campsKurinUSPUPS = new CampsKurinUSPUPS(kurinSTPL.getId(), kurinSTPL.getNamekurin());
					listCampsKurinUSPUPS.add(campsKurinUSPUPS);
				}

			} else if (fullInfCamp.getReferenturaID() != null) {

				
				
				for (Long l : fullInfCamp.getReferenturaID()) {
					campsReferents = campsReferentsDAO.findOneReferents(l);
					campReferentCombain = new CampReferentCombain();
					campReferentCombain.setReferents(campsReferents);
					campReferentCombain.setCamps(camp);
					campReferentCombainDAO.greateCombCampRef(campReferentCombain);
					campRefers = new CampRefers(campsReferents.getId(), campsReferents.getName());
					listCampRefers.add(campRefers);
				}

			} else if (fullInfCamp.getKureniStPl() != null) {
				
				
				for (Long l : fullInfCamp.getKureniStPl()) {
					kurinSTPL = kurinUPSUPSDAO.findOneKurinUSP(l);
					campsKurinStPl = new CampsKurinStPl();
					campsKurinStPl.setCamps(camp);
					campsKurinStPl.setKurinUSPUPS(kurinSTPL);
					campsKurinStPlDAO.greateCampsKurinStPl(campsKurinStPl);
					
					campsKurinUSPUPS = new CampsKurinUSPUPS(kurinSTPL.getId(), kurinSTPL.getNamekurin());
					listCampsKurinUSPUPS.add(campsKurinUSPUPS);
				}
			}
			break;

		case 12:
		case 11:
			if (fullInfCamp.getOkruhaID() != null) {

				
				
				
				
				for (Long co : fullInfCamp.getOkruhaID()) {
					okruha = okruhaDAO.findOneOkruha(co);
					
					campOkruhaTb = new CampOkruhaTb();
					campOkruhaTb.setCamps(camp);
					campOkruhaTb.setOkruha(okruha);
					campOkruhaTbDAO.greateCampOkruhaTb(campOkruhaTb);
					
					campsOkruha = new CampsOkruha(okruha.getId(), okruha.getNameokruha());
					listCampOkruha.add(campsOkruha);
				}
			}
			break;
		case 10:
		case 9:
			if (fullInfCamp.getStanytsyaID() != null && fullInfCamp.getOkruhaID() != null) {
				
				for (Long co : fullInfCamp.getOkruhaID()) {
					okruha = okruhaDAO.findOneOkruha(co);
					
					campOkruhaTb = new CampOkruhaTb();
					campOkruhaTb.setCamps(camp);
					campOkruhaTb.setOkruha(okruha);
					campOkruhaTbDAO.greateCampOkruhaTb(campOkruhaTb);
					
					campsOkruha = new CampsOkruha(okruha.getId(), okruha.getNameokruha());
					listCampOkruha.add(campsOkruha);
				}

				
				
				
				for (Long cs : fullInfCamp.getStanytsyaID()) {
					stanytsya = stanytsyaDAO.findOneStan(cs);
					campStanytsyaTb = new CampStanytsyaTb();
					campStanytsyaTb.setCamps(camp);
					campStanytsyaTb.setStanytsya(stanytsya);
					campStanytsyaTbDAO.greateCampStanytsyaTb(campStanytsyaTb);
					
					campsStanytsya = new CampsStanytsya(stanytsya.getId(), stanytsya.getNamestan());
					listCampStanytsya.add(campsStanytsya);
				}
			}
			break;
		case 8:
		case 7:
			if (fullInfCamp.getOkruhaID() != null && fullInfCamp.getStanytsyaID() != null && fullInfCamp.getKurinID() != null) {
				

				
				for (Long co : fullInfCamp.getOkruhaID()) {
					okruha = okruhaDAO.findOneOkruha(co);
					
					campOkruhaTb = new CampOkruhaTb();
					campOkruhaTb.setCamps(camp);
					campOkruhaTb.setOkruha(okruha);
					campOkruhaTbDAO.greateCampOkruhaTb(campOkruhaTb);
					
					campsOkruha = new CampsOkruha(okruha.getId(), okruha.getNameokruha());
					listCampOkruha.add(campsOkruha);
				}
				
				
				
				for (Long cs : fullInfCamp.getStanytsyaID()) {
					stanytsya = stanytsyaDAO.findOneStan(cs);
					campStanytsyaTb = new CampStanytsyaTb();
					campStanytsyaTb.setCamps(camp);
					campStanytsyaTb.setStanytsya(stanytsya);
					campStanytsyaTbDAO.greateCampStanytsyaTb(campStanytsyaTb);
					
					campsStanytsya = new CampsStanytsya(stanytsya.getId(), stanytsya.getNamestan());
					listCampStanytsya.add(campsStanytsya);
				}
				

				
				
				for (Long ck : fullInfCamp.getKurinID()) {
					kurinUPU = kurinDAO.findOneKurin(ck);
					campKurinTb = new CampKurinTb();
					campKurinTb.setCamps(camp);
					campKurinTb.setKurinUPU(kurinUPU);
					campKurinTbDAO.greateCampKurinTb(campKurinTb);
					
					campsKurin = new CampsKurin(kurinUPU.getId(), kurinUPU.getNumberKurin(), kurinUPU.getNameKurin());
					listCampKurin.add(campsKurin);
				}
			}
			break;
		case 6:
		case 5:
			if (fullInfCamp.getStanytsyaID() != null && fullInfCamp.getKurinID() != null
					&& fullInfCamp.getHurtokID() != null) {
				

				
				for (Long cs : fullInfCamp.getStanytsyaID()) {
					stanytsya = stanytsyaDAO.findOneStan(cs);
					campStanytsyaTb = new CampStanytsyaTb();
					campStanytsyaTb.setCamps(camp);
					campStanytsyaTb.setStanytsya(stanytsya);
					campStanytsyaTbDAO.greateCampStanytsyaTb(campStanytsyaTb);
					
					campsStanytsya = new CampsStanytsya(stanytsya.getId(), stanytsya.getNamestan());
					listCampStanytsya.add(campsStanytsya);
				}
				
				for (Long ck : fullInfCamp.getKurinID()) {
					kurinUPU = kurinDAO.findOneKurin(ck);
					campKurinTb = new CampKurinTb();
					campKurinTb.setCamps(camp);
					campKurinTb.setKurinUPU(kurinUPU);
					campKurinTbDAO.greateCampKurinTb(campKurinTb);
					
					campsKurin = new CampsKurin(kurinUPU.getId(), kurinUPU.getNumberKurin(), kurinUPU.getNameKurin());
					listCampKurin.add(campsKurin);
				}

				
			
				for (Long ch : fullInfCamp.getHurtokID()) {
					hurtokUPU = hurtokDAO.findOneHurtok(ch);
					campHurtokTb = new CampHurtokTb();
					campHurtokTb.setCamps(camp);
					campHurtokTb.setHurtokUPU(hurtokUPU);
					campHurtokTbDAO.greateCampHurtokTb(campHurtokTb);
					
					campsHurtok = new CampsHurtok(hurtokUPU.getId(), hurtokUPU.getNameHurtok());
					listCampHurtok.add(campsHurtok);
				}
			
			} else if (fullInfCamp.getStanytsyaID() != null && fullInfCamp.getSamhurtokID() != null) {

				
				
				for (Long cs : fullInfCamp.getStanytsyaID()) {
					stanytsya = stanytsyaDAO.findOneStan(cs);
					campStanytsyaTb = new CampStanytsyaTb();
					campStanytsyaTb.setCamps(camp);
					campStanytsyaTb.setStanytsya(stanytsya);
					campStanytsyaTbDAO.greateCampStanytsyaTb(campStanytsyaTb);
					
					campsStanytsya = new CampsStanytsya(stanytsya.getId(), stanytsya.getNamestan());
					listCampStanytsya.add(campsStanytsya);
				}
				
				
				for (Long csh : fullInfCamp.getSamhurtokID()) {
					samHurtokUPU = samHurtokDAO.findOneSMHurtok(csh);
					campSMHurtok = new CampSMHurtok();
					campSMHurtok.setCamps(camp);
					campSMHurtok.setSamHurtok(samHurtokUPU);
					campSMHurtokDAO.greateCampSMHurtok(campSMHurtok);
					
					campsSamHurtok = new CampsSamHurtok(samHurtokUPU.getId(), samHurtokUPU.getNameSamHurtok());
					listCampSamHurtok.add(campsSamHurtok);
				}
			}

			break;
		case 4:
		case 3:

			break;
		case 2:
		case 1:

			break;

		default:
			break;
		}

		CampsInformationFull fullcamps = new CampsInformationFull(campID, camp.getName(), uladID, status.getId(),
				fullInfCamp.getDateStart(), fullInfCamp.getDateEnd(), fullInfCamp.getEmail(), fullInfCamp.getGoal(),
				fullInfCamp.getContinuity(), fullInfCamp.getPlace(), campPosition, fullInfCamp.getPrice(),
				campGender.getId(), age, fullInfCamp.getCountMembers(), listCampRefers,
				listCampsKurinUSPUPS, listCampOkruha, listCampStanytsya,
				listCampKurin, listCampHurtok, listCampSamHurtok, provid,fullInfCamp.getReasonPrice(), fullInfCamp.getShare(), fullInfCamp.getEventaftercamp());

		return ResponseEntity.ok().body(fullcamps);
	}

	@CrossOrigin
	@GetMapping("/camp/{id}")
	public ResponseEntity<CampsInformationFull> viewInfoCamps(@PathVariable("id") Long id) {

		camp = campsDAO.findOneCamp(id);

		listCampsUlad = campsUladDao.findCampUlad(id);
		List<Long> uladID = new ArrayList<Long>();
		for (CampsUlad campsUlad : listCampsUlad) {
			uladID.add(campsUlad.getUlad().getId());
		}
		List<Integer> age = null;
		if (camp.getFromAge() != null) {
			age = new ArrayList<Integer>();
			age.add(camp.getFromAge());
			age.add(camp.getToAge());
		} else {
			age = null;
		}
		List<CampReferentCombain> refcamp = campReferentCombainDAO.findCampReferents(id);
		List<CampRefers> referenturaID  = null;
		if (refcamp.size() != 0) {
			referenturaID = new ArrayList<CampRefers>();
			for (CampReferentCombain crc : refcamp) {
				
				campsReferents	 = campsReferentsDAO.findOneReferents(crc.getReferents().getId());
				
				campRefers = new CampRefers(campsReferents.getId(), campsReferents.getName());
				
				referenturaID.add(campRefers);
				
			}
			
			
		}

		List<CampsKurinStPl> kurstpl = campsKurinStPlDAO.findKurinstpl(id);
		List<CampsKurinUSPUPS> kureniStPl = null;
		if (kurstpl.size() != 0) {
			kureniStPl = new ArrayList<CampsKurinUSPUPS>();
			for (CampsKurinStPl campstpl : kurstpl) {
				kurinSTPL =	kurinUPSUPSDAO.findOneKurinUSP(campstpl.getKurinUSPUPS().getId());
				
				campsKurinUSPUPS = new CampsKurinUSPUPS(kurinSTPL.getId(), kurinSTPL.getNamekurin());
				kureniStPl.add(campsKurinUSPUPS);
			}
		}

		Long gender = null;
		if (camp.getGenderid() != null) {
			gender = camp.getGenderid().getId();
		}

		List<CampOkruhaTb> campokruha = campOkruhaTbDAO.findCampOkruhaTb(id);
		List<CampsOkruha> okruhaID = null;
		if (campokruha.size() != 0) {
			okruhaID = new ArrayList<CampsOkruha>();
			for (CampOkruhaTb campOkruhaTb : campokruha) {
				okruha = okruhaDAO.findOneOkruha(campOkruhaTb.getOkruha().getId());
				campsOkruha = new CampsOkruha(okruha.getId(), okruha.getNameokruha());
				okruhaID.add(campsOkruha);

			}
		}

		List<CampStanytsyaTb> stan = campStanytsyaTbDAO.findCampStanytsyaTb(id);
		List<CampsStanytsya> stanytsyaID = null;
		if (stan.size() != 0) {
			stanytsyaID = new ArrayList<CampsStanytsya>();
			for (CampStanytsyaTb campStanytsyaTb : stan) {
				stanytsya = stanytsyaDAO.findOneStan(campStanytsyaTb.getStanytsya().getId());
				campsStanytsya = new CampsStanytsya(stanytsya.getId(), stanytsya.getNamestan());
				stanytsyaID.add(campsStanytsya);
			}
		}

		List<CampKurinTb> kurin = campKurinTbDAO.findCampKurinTb(id);
		List<CampsKurin> kurinID = null;
		if (kurin.size() != 0) {
			kurinID = new ArrayList<CampsKurin>();
			for (CampKurinTb campKurinTb : kurin) {
				kurinUPU = kurinDAO.findOneKurin(campKurinTb.getKurinUPU().getId());
				campsKurin = new CampsKurin(kurinUPU.getId(), kurinUPU.getNumberKurin(), kurinUPU.getNameKurin());
				kurinID.add(campsKurin);
			}
		}

		List<CampHurtokTb> hurtok = campHurtokTbDAO.findCampHurtokTb(id);
		List<CampsHurtok> hurtokID = null;
		if (hurtok.size() != 0) {
			hurtokID = new ArrayList<CampsHurtok>();
			for (CampHurtokTb сampHurtokTb : hurtok) {
				hurtokUPU = hurtokDAO.findOneHurtok(сampHurtokTb.getHurtokUPU().getId());
				campsHurtok = new CampsHurtok(hurtokUPU.getId(), hurtokUPU.getNameHurtok());
				hurtokID.add(campsHurtok);
			}
		}

		List<CampSMHurtok> smhurtok = campSMHurtokDAO.findCampSMHurtok(id);
		List<CampsSamHurtok> samhurtokID = null;
		if (smhurtok.size() != 0) {
			samhurtokID = new ArrayList<CampsSamHurtok>();
			for (CampSMHurtok campSMHurtok : smhurtok) {
				samHurtokUPU = samHurtokDAO.findOneSMHurtok(campSMHurtok.getSamHurtok().getId());
				campsSamHurtok = new CampsSamHurtok(samHurtokUPU.getId(), samHurtokUPU.getNameSamHurtok());
				samhurtokID.add(campsSamHurtok);
			}
		}
		
		position = positionDAO.findOnePosition(id);
		if(position!=null){
			campPosition = new CampPosition(position.getLat(), position.getLng());
		} else {
			campPosition = null;
		}
		 provid = new ArrayList<CampLeader>();
		 
		
		 
		 List<CampsLeaders> camlead = campsLeadersDAO.findCampsLeader(id);
		 for (CampsLeaders cl : camlead) {
			 member =  campPersonsDAO.findOnePerson(cl.getPersons().getId());
			 
			 csampsMembersStanStupin = campPersonsDAO.findStanStupinMembers(cl.getPersons().getId());
			 
			 members = new CampMembers(member.getId(), member.getLastName()+" "+member.getFirstName(), csampsMembersStanStupin.getStupin());
			 
			 campLeader = new CampLeader(cl.getLeaders().getId(), cl.getEducation(), cl.getCountсamp(), members);
			 provid.add(campLeader);	
		}
		 
		
		// POSITION ZAMIST NULL POSTAVYTY!!!!!!!!!!!!!!!!!!!
		// campsInformationFull = new CampsInformationFull(camp.getName(),
		// uladID, camp.getStatusID().getId(),
		// camp.getDateStart(), camp.getDateEnd(), camp.getEmail(),
		// camp.getGoal(), camp.getContinuity(),
		// camp.getPlace(), position, camp.getPrice(), gender, age,
		// camp.getCountMembers(), referenturaID, kureniStPl, okruhaID,
		// stanytsyaID,kurinID,hurtokID,samhurtokID,provid);

		campsInformationFull = new CampsInformationFull(camp.getName(), uladID, camp.getStatusID().getId(),
				camp.getDateStart(), camp.getDateEnd(), camp.getEmail(), camp.getGoal(), camp.getContinuity(),
				camp.getPlace(), campPosition, camp.getPrice(), gender, age, camp.getCountMembers(), referenturaID,
				kureniStPl, okruhaID, stanytsyaID, kurinID, hurtokID, samhurtokID, provid,camp.getReasonPrice(), camp.getShare(), camp.getEventaftercamp());

		return ResponseEntity.ok().body(campsInformationFull);
	}

}
