package com.pack;

public class Character {
	String name;
	int sing=3;
	int dance=3;
	int rap=3;
	int attractive=3;
	int physical=3;
	String grade;
	int fan=0;
	int reputation=0;

	public int getSing() {
		return sing;
	}

	public void setSing(int sing) {
		this.sing = sing;
	}

	public int getDance() {
		return dance;
	}

	public void setDance(int dance) {
		this.dance = dance;
	}

	public int getRap() {
		return rap;
	}

	public void setRap(int rap) {
		this.rap = rap;
	}
	
	public int getAttractive() {
		return attractive;
	}

	public void setAttractive(int attractive) {
		this.attractive = attractive;
	}

	public int getPhysical() {
		return physical;
	}

	public void setPhysical(int physical) {
		this.physical = physical;
	}

	public int getFan() {
		return fan;
	}

	public void setFan(int fan) {
		this.fan = fan;
	}
	
	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public String getGrade(int score) {
		if(score>80) {
			grade="S";
		}
		else if(score>50) {
			grade="A";
		}
		else if(score>40) {
			grade="B";
		}
		else if(score>30) {
			grade="C";
		}
		else if(score>20) {
			grade="D";
		}
		else {
			grade="F";
		}
		
		return grade;
	}
	
	public void info() {
		System.out.println("======================");
		System.out.println("\t상태창");
		System.out.println("======================");
		System.out.println("보컬: "+ sing + " (" + getGrade(sing) + "등급)");
		System.out.println("춤: "+ dance + " (" + getGrade(dance) + "등급)");
		System.out.println("랩: "+ rap + " (" + getGrade(rap) + "등급)");
		System.out.println("매력: "+ attractive + " (" + getGrade(attractive) + "등급)");
		System.out.println("체력: "+ physical + " (" + getGrade(physical) + "등급)");
		System.out.println("팬: "+ fan + "명");
	}
	
	
}
