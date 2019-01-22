public class SubjectRecord {
	private String codeSubject;
	private String name;
	private float unit;
	private String grade;
	private String ID;
	
	public SubjectRecord left;
	public SubjectRecord right;
	
	public SubjectRecord() {
		
	}
	public String getCode() {
		return codeSubject;
	}
	public void setCode(String code) {
		this.codeSubject = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getUnit() {
		return unit;
	}
	public void setUnit(float unit) {
		this.unit = unit;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}	
}
