package com.training.model;

public class Student {

	private int regno;
	private String name;
	private int webScore;
	private int sqlScore;
	private int javaScore;
	private int totalScore;

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWebScore() {
		return webScore;
	}

	public void setWebScore(int webScore) {
		this.webScore = webScore;
	}

	public int getSqlScore() {
		return sqlScore;
	}

	public void setSqlScore(int sqlScore) {
		this.sqlScore = sqlScore;
	}

	public int getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

//	public double getAverageScore() {
//		return averageScore;
//	}
//	public void setAverageScore(double averageScore) {
//		this.averageScore = averageScore;
//	}

	@Override
	public String toString() {
		return String.format("Student [regno=%s, name=%s, webScore=%s, sqlScore=%s, javaScore=%s,totalScore=%s]", regno,
				name, webScore, sqlScore, javaScore, totalScore);
	}

	/*
	 * public void calculateAverageScore (int score [ ]){ double average=0; for(int
	 * i=0;i<score.length;i++) { average+=score[i]; } average/=3;
	 * this.averageScore=average; }
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + regno;

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;

		if (regno != other.regno)
			return false;

		return true;
	}

}
