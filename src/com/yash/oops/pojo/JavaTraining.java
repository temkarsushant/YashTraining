package com.yash.oops.pojo;
//Sushant Temkar

//This is pojo class for specifying training attributes.
public class JavaTraining implements Comparable<JavaTraining>, Cloneable {

	private int chairNo;
	private String board;
	private static String projector = "test";
	private String trainer;
	private String studentName;
	private String monitor;
	private String cpu;

	public JavaTraining() {
		super();
	}

	public JavaTraining(int chairNo, String board, String projector, String trainer, String studentName) {
		super();
		this.chairNo = chairNo;
		this.board = board;
		this.projector = projector;
		this.trainer = trainer;
		this.studentName = studentName;
	}

	public JavaTraining(int chairNo, String board, String projector, String trainer, String studentName, String monitor,
			String cpu) {
		super();
		this.chairNo = chairNo;
		this.board = board;
		this.projector = projector;
		this.trainer = trainer;
		this.studentName = studentName;
		this.monitor = monitor;
		this.cpu = cpu;
	}

	public void setChairNo(int chairNo) {
		this.chairNo = chairNo;
	}

	public int getChairNo() {
		return this.chairNo;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public String getprojector() {
		return this.board;
	}

	public void setProjector(String projector) {
		this.projector = projector;
	}

	public String getProjector() {
		return this.projector;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getTrainer() {
		return this.trainer;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setAttribute(int chairNo, String board, String projector, String trainer, String studentName) {
		this.chairNo = chairNo;
		this.board = board;
		this.projector = projector;
		this.trainer = trainer;
		this.studentName = studentName;

	}

	public void setAttribute(int chairNo, String board, String projector, String trainer, String studentName,
			String monitor, String cpu) {
		this.chairNo = chairNo;
		this.board = board;
		this.projector = projector;
		this.trainer = trainer;
		this.studentName = studentName;
		this.monitor = monitor;
		this.cpu = cpu;

	}

	@Override
	public String toString() {
		return "JavaTraining [chairNo=" + chairNo + ", board=" + board + ", projector=" + projector + ", trainer="
				+ trainer + ", studentName=" + studentName + "]";
	}

	@Override
	public int compareTo(JavaTraining o) {
		// TODO Auto-generated method stub
		return this.chairNo - o.chairNo;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
