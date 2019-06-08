package com.baizhi.day14;

public class Student {
	private int id;
	private String name;
	private int age;
	private boolean sex;
	private double score;
	private double height;
	private double weight;
	private String hobby;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Student() {
		super();
	}
	
	
	public Student(int id, String name, int age, boolean sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Student(boolean sex, double score, double height, double weight,
			String hobby) {
		super();
		this.sex = sex;
		this.score = score;
		this.height = height;
		this.weight = weight;
		this.hobby = hobby;
	}
	public Student(int id, String name, int age, boolean sex, double score,
			double height, double weight, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.score = score;
		this.height = height;
		this.weight = weight;
		this.hobby = hobby;
	}
}
