package Chapter4;

import java.util.ArrayList;

public class Human {
	public Human() {
	}

	public Human(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayScore(ArrayList<Student> studentList, int ID) {
	}
}
