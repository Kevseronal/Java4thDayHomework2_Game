package java4thDayHomework2_Game.entities.concretes;

import java4thDayHomework2_Game.entities.abstracts.Entity;

public class Game implements Entity{

	private int id;
	private String name;
	private double unitPrice;
	private String details;
	
	public Game() {}

	public Game(int id, String name, double unitPrice, String details) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.details = details;
	}

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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	
}
