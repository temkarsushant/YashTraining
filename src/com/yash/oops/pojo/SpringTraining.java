package com.yash.oops.pojo;

public class SpringTraining extends JavaTraining {
	private int chairNo;
	private String board;
	private static String projector = "test";
	private String trainer;
	private String studentName;
	private String monitor;
	private String cpu;
	private String springKnowledge;

	public void setAttribute(int chairNo, String board, String projector, String trainer, String studentName,
			String monitor, String cpu, String springKnowledge) {
		this.chairNo = chairNo;
		this.board = board;
		this.projector = projector;
		this.trainer = trainer;
		this.studentName = studentName;
		this.monitor = monitor;
		this.cpu = cpu;
		this.springKnowledge = springKnowledge;
		super.setAttribute(2, "Test", "Test", "Test", "Test");

	}

}
