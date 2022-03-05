package Chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();

		while (true) {
			System.out.println("**********************************");
			System.out.println("欢迎使用学生成绩管理系统");
			System.out.println("请输入您想要使用的功能");
			System.out.println("1. 查看学生成绩");
			System.out.println("2. 登录学生成绩");
			System.out.println("3. 删除学生成绩");
			System.out.println("4. 修改学生成绩");
			System.out.println("5. 退出");
			System.out.println("**********************************");
			System.out.println("请输入您的选择");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				showStudent(studentList);
				break;
			case 2:
				addStudent(studentList);
				break;
			case 3:
				deleteStudent(studentList);
				break;
			case 4:
				reviseStudent(studentList);
				break;
			case 5:
				System.out.println("谢谢使用");
				System.exit(0);
			default:
				System.out.println("选择有误，请输入1-5之间的数");
			}
		}
	}

//显示功能
	public static void showStudent(ArrayList<Student> studentList) {
		if (studentList.size() == 0) {
			System.out.println("暂无已登录学生");
			return;
		}
		for (int i = 0; i <= studentList.size() - 1; i++) {
			Student s = studentList.get(i);
			System.out.println((i + 1) + ". " + "学号: " + s.getStudentNumber() + "\t分数: " + s.getScore());
		}
	}

//添加功能
	public static void addStudent(ArrayList<Student> studentList) {
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

//删除功能
	public static void deleteStudent(ArrayList<Student> studentList) {
		if (studentList.size() == 0) {
			System.out.println("暂无已登录学生");
			return;
		}
		for (int i = 0; i <= studentList.size() - 1; i++) {
			Student s = studentList.get(i);
			System.out.println((i + 1) + ". " + "学号: " + s.getStudentNumber() + "\t分数: " + s.getScore());
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

//修改功能
	public static void reviseStudent(ArrayList<Student> studentList) {
		if (studentList.size() == 0) {
			System.out.println("暂无已登录学生");
			return;
		}
		for (int i = 0; i <= studentList.size() - 1; i++) {
			Student s = studentList.get(i);
			System.out.println((i + 1) + ". " + "学号: " + s.getStudentNumber() + "\t分数: " + s.getScore());
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
