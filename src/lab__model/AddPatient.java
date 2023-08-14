package lab__model;

import java.util.Date;

public class AddPatient {
	private int id;
	private String patientName;
	private byte age;
	Date d;
	private String gender;
	private String refference;
	private String collectBy;

	public AddPatient() {

	}
	
	
	public AddPatient(int id, String patientName, byte age, Date d, String gender, String refference,
			String collectBy) {
		this.id = id;
		this.patientName = patientName;
		this.age = age;
		this.d = d;
		this.gender = gender;
		this.refference = refference;
		collectBy = collectBy;
	}

	public AddPatient(String patientName, byte age,String refference,String CollectBy) {
		this.patientName=patientName;
		this.age=age;
		this.refference=refference;
		this.collectBy=CollectBy;
	}
	
	
	public AddPatient(String patientName, byte age, Date d, String gender, String refference, String collectBy) {
		this.patientName = patientName;
		this.age = age;
		this.d = d;
		this.gender = gender;
		this.refference = refference;
		this.collectBy = collectBy;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRefference() {
		return refference;
	}

	public void setRefference(String refference) {
		this.refference = refference;
	}

	public String getCollectBy() {
		return collectBy;
	}

	public void setCollectBy(String collectBy) {
		this.collectBy = collectBy;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getId() {
		return id;
	}
	

}
