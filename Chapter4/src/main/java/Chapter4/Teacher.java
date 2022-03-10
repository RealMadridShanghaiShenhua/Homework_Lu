package Chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Human implements displayScore {

	private int teacherNumber;

	public Teacher() {
	}

	public Teacher(int teacherNumber) {
		super();
		this.teacherNumber = teacherNumber;
	}

	public int getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(int teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	@Override
	// 显示功能（显示所有人）
	public void displayScore(ArrayList<Student> studentList) {
		if (studentList.size() == 0) {
			System.out.println("暂无已登录学生");
			return;
		}
		for (int i = 0; i <= studentList.size() - 1; i++) {
			Student s = studentList.get(i);
			System.out.println((i + 1) + ". " + "姓名：" + s.getName() + "\t学校：" + Student.getSchool() + "\t学号: "
					+ s.getStudentNumber() + "\t分数: " + s.getScore());
		}
	}

	// 添加功能
	public void addStudent(ArrayList<Student> studentList) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生学号");
		int studentNumber = sc.nextInt();
		for (int i = 0; i <= studentList.size() - 1; i++) {
			if (studentList.get(i).getStudentNumber() == studentNumber) {
				System.out.println("已存在该学生，请使用修改功能");
				return;
			}
		}
		s.setStudentNumber(studentNumber);
		System.out.println("请输入学生成绩");
		s.setScore(sc.nextInt());
		studentList.add(s);
		System.out.println("成绩登录成功");
	}

	// 删除功能
	public void deleteStudent(ArrayList<Student> studentList) {
		if (studentList.size() == 0) {
			System.out.println("暂无已登录学生");
			return;
		}
		for (int i = 0; i <= studentList.size() - 1; i++) {
			Student s = studentList.get(i);
			System.out.println((i + 1) + ". " + "姓名：" + s.getName() + "\t学校：" + Student.getSchool() + "\t学号: "
					+ s.getStudentNumber() + "\t分数: " + s.getScore());
		}
		System.out.println("请输入要删除的学生学号");
		while (true) {
			Scanner sc = new Scanner(System.in);
			int deleteNumber = sc.nextInt();
			for (int i = 0; i <= studentList.size() - 1; i++) {
				if (studentList.get(i).getStudentNumber() == deleteNumber) {
					studentList.remove(i);
					System.out.println("删除成功");
					return;
				}
			}
			System.out.println("查无此人，请重新输入");
		}
	}

	// 修改功能
	public void reviseStudent(ArrayList<Student> studentList) {
		if (studentList.size() == 0) {
			System.out.println("暂无已登录学生");
			return;
		}
		for (int i = 0; i <= studentList.size() - 1; i++) {
			Student s = studentList.get(i);
			System.out.println((i + 1) + ". " + "姓名：" + s.getName() + "\t学校：" + Student.getSchool() + "\t学号: "
					+ s.getStudentNumber() + "\t分数: " + s.getScore());
		}
		System.out.println("请输入要修改的学生学号");
		while (true) {
			Scanner sc = new Scanner(System.in);
			int deleteNumber = sc.nextInt();
			for (int i = 0; i <= studentList.size() - 1; i++) {
				if (studentList.get(i).getStudentNumber() == deleteNumber) {
					System.out.println("请输入学生成绩");
					studentList.get(i).setScore(sc.nextInt());
					System.out.println("修改成功");
					return;
				}
			}
			System.out.println("查无此人，请重新输入");
		}
	}
}
