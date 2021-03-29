package web_basic.jsp_07;

public class Student {
	private int stdNo;
	private String stdName;
	private int kor;
	private int math;
	private int eng;

	public Student() {
		this.stdNo = 10;
		this.stdName = "김상건";
		this.kor = 90;
	}

	public Student(int stdNo, String stdName, int kor) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.kor = kor;
	}

	public Student(int stdNo, String stdName, int kor, int math, int eng) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public int getAvg() {
		return (kor + eng + math) / 3;
	}

	@Override
	public String toString() {
		return "Student [stdNo=" + stdNo + ", stdName=" + stdName + ", kor=" + kor + ", math=" + math + ", eng=" + eng
				+ "]";
	}

}
