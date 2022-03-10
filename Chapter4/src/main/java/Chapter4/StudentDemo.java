package Chapter4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) throws AWTException, IOException {

		ArrayList<Student> studentList = new ArrayList<>();
		ArrayList<Teacher> teacherList = new ArrayList<>();

		Teacher Zhang = new Teacher();
		Zhang.setName("张三");
		Zhang.setAge(35);
		Zhang.setTeacherNumber(1);

		Teacher Li = new Teacher();
		Li.setName("李四");
		Li.setAge(40);
		Li.setTeacherNumber(2);

		Teacher Wang = new Teacher();
		Wang.setName("王五");
		Wang.setAge(45);
		Wang.setTeacherNumber(3);

		teacherList.add(Zhang);
		teacherList.add(Li);
		teacherList.add(Wang);

		Student Jia = new Student();
		Jia.setName("甲");
		Jia.setAge(15);
		Jia.setStudentNumber(1);
		Jia.setScore(100);

		Student Yi = new Student();
		Yi.setName("乙");
		Yi.setAge(15);
		Yi.setStudentNumber(2);
		Yi.setScore(90);

		Student Bing = new Student();
		Bing.setName("丙");
		Bing.setAge(15);
		Bing.setStudentNumber(3);
		Bing.setScore(80);

		Student.setSchool("东京大学");

		studentList.add(Jia);
		studentList.add(Yi);
		studentList.add(Bing);

		System.out.println("**********************************");
		System.out.println("您好，请选择您的身份");
		System.out.println("1. 老师");
		System.out.println("2. 学生");
		System.out.println("**********************************");
		Scanner sc = new Scanner(System.in);

		int id = sc.nextInt();
		while (id != 1 && id != 2) {
			System.out.println("选择有误，请输入1或2");
			id = sc.nextInt();
		}

		switch (id) {
		case 1:

			System.out.println("您好，请输入您的教师编号");
			int teacherID = sc.nextInt();
			while (teacherID != 1 && teacherID != 2 && teacherID != 3) {
				System.out.println("您的输入有误，请重新输入");
				teacherID = sc.nextInt();
			}
			Teacher tempT = new Teacher();
			for (int i = 0; i <= teacherList.size() - 1; i++) {
				Teacher t = teacherList.get(i);
				if (t.getTeacherNumber() == teacherID) {
					tempT = t;
					System.out.println("欢迎" + tempT.getName() + "老师使用学生管理系统");
					break;
				}

			}

			while (true) {
				System.out.println("**********************************");
				System.out.println("您的身份：" + tempT.getName() + "老师");
				System.out.println("请输入您想要使用的功能");
				System.out.println("1. 查看学生成绩");
				System.out.println("2. 登录学生成绩");
				System.out.println("3. 删除学生成绩");
				System.out.println("4. 修改学生成绩");
				System.out.println("5. 退出");
				System.out.println("**********************************");
				System.out.println("请输入您的选择");

				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					tempT.displayScore(studentList);
					System.out.println();
					System.out.println("请按回车键继续");
					System.in.read();
					clear();
					break;
				case 2:
					tempT.addStudent(studentList);
					System.out.println();
					System.out.println("请按回车键继续");
					System.in.read();
					clear();
					break;
				case 3:
					tempT.deleteStudent(studentList);
					System.out.println();
					System.out.println("请按回车键继续");
					System.in.read();
					clear();
					break;
				case 4:
					tempT.reviseStudent(studentList);
					System.out.println();
					System.out.println("请按回车键继续");
					System.in.read();
					clear();
					break;
				case 5:
					System.out.println("谢谢使用");
					System.exit(0);
				default:
					System.out.println("选择有误，请输入1-5之间的数");
				}
			}

		case 2:
			Student tempS = new Student();
			System.out.println("您好，请输入您的学生编号");
			int studentID = sc.nextInt();
			while (studentID != 1 && studentID != 2 && studentID != 3) {
				System.out.println("您的输入有误，请重新输入");
				studentID = sc.nextInt();
			}

			for (int i = 0; i <= studentList.size() - 1; i++) {
				Student s = studentList.get(i);
				if (s.getStudentNumber() == studentID) {
					tempS = s;
					System.out.println("欢迎" + s.getName() + "同学使用学生管理系统");
					break;
				}

			}

			while (true) {
				System.out.println("**********************************");
				System.out.println("您的身份：" + tempS.getName() + "同学");
				System.out.println("请输入您想要使用的功能");
				System.out.println("1. 查看成绩");
				System.out.println("2. 退出");
				System.out.println("**********************************");
				System.out.println("请输入您的选择");

				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					tempS.displayScore(studentList);
					System.out.println();
					System.out.println("请按回车键继续");
					System.in.read();
					clear();
					break;
				case 2:
					System.out.println("谢谢使用");
					System.exit(0);
				default:
					System.out.println("选择有误，请输入1-5之间的数");
				}
			}

		default:
			;
		}
	}

	public static void clear() throws AWTException {
		Robot r = new Robot();
		r.mousePress(InputEvent.BUTTON3_MASK); // 按下鼠标右键
		r.mouseRelease(InputEvent.BUTTON3_MASK); // 释放鼠标右键
		r.keyPress(KeyEvent.VK_R); // 按下R键
		r.keyRelease(KeyEvent.VK_R); // 释放R键
		r.keyRelease(KeyEvent.VK_CONTROL); // 释放Ctrl键
		r.delay(100);
	}
}
