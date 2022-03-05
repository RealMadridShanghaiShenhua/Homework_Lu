package Chapter3;

public class Student {

	private int studentNumber;
	private int score;
	
	public Student() {
	}

	public Student(int studentNumber, int score) {
		super();
		this.studentNumber = studentNumber;
		this.score = score;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}


	
}
