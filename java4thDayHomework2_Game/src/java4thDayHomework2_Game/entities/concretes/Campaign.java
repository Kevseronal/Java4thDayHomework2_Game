package java4thDayHomework2_Game.entities.concretes;

import java4thDayHomework2_Game.entities.abstracts.Entity;

public class Campaign implements Entity{

	private int id;
	private String campanyName;
	private double percentAgeDiscount;
	
	public Campaign() {}

	public Campaign(int id, String campanyName, double percentAgeDiscount) {
		super();
		this.id = id;
		this.campanyName = campanyName;
		this.percentAgeDiscount = percentAgeDiscount;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampanyName() {
		return campanyName;
	}

	public void setCampanyName(String campanyName) {
		this.campanyName = campanyName;
	}

	public double getPercentAgeDiscount() {
		return percentAgeDiscount;
	}

	public void setPercentAgeDiscount(double percentAgeDiscount) {
		this.percentAgeDiscount = percentAgeDiscount;
	}
	
	
	
}
