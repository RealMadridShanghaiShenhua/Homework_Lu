package Chapter4;

import java.util.ArrayList;

public class Student extends Human implements displayScore {

	private int studentNumber;
	private int score;
	private static String school;

	public Student() {
	}

	public Student(int studentNumber, int score) {
		super();
		this.studentNumber = studentNumber;
		this.score = score;
	}

	public static String getSchool() {
		return school;
	}

	public static void setSchool(String school) {
		Student.school = school;
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

	@Override
	// 显示功能（只显示自己）
	public void displayScore(ArrayList<Student> studentList) {
		if (studentList.size() == 0) {
			System.out.println("暂无已登录学生");
			return;
		}
		for (int i = 0; i <= studentList.size() - 1; i++) {
			Student s = studentList.get(i);
			if (s.getStudentNumber() == this.getStudentNumber()) {
				System.out.println("姓名：" + s.getName() + "\t学校：" + Student.getSchool() + "\t学号: " + s.getStudentNumber()
						+ "\t分数: " + s.getScore());
			} else {
				continue;
			}
		}
	}

}
