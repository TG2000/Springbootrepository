package com.capg64;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cities {
	private int id;
	private String name;
	private int population;
	public Cities(int id, String name, int population) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
	}
	@Override
	public String toString() {
		return "Cities [id=" + id + ", name=" + name + ", population=" + population + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
}
