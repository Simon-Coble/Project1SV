package com.room3.models;

import java.util.List;
import java.util.Objects;

import javax.persistence.JoinColumn;

import com.room3.annotations.Column;
import com.room3.annotations.Entity;
import com.room3.annotations.Id;
import com.room3.annotations.JoinCol;

@Entity(tableName = "super_villain")
public class SuperVillain {

	@Id(columnName = "svill_id")
	private int svillId;
	
	@Column(columnName = "name")
	private String name;
	
	@Column(columnName = "superpower")
	private String Superpower;
	
	@Column(columnName = "bounty")
	private double bounty;
	
	List<Crime> crimes;
	@JoinCol(columnName = "prison_fk", foreignKey = 1)
	private SuperPrison superPrisonHolder;
	
	
	public SuperVillain() {
		
	}


	public SuperVillain(int svillId, String name, String superpower, double bounty, List<Crime> crimes,
			SuperPrison superPrisonHolder) {
		super();
		this.svillId = svillId;
		this.name = name;
		Superpower = superpower;
		this.bounty = bounty;
		this.crimes = crimes;
		this.superPrisonHolder = superPrisonHolder;
	}


	public SuperVillain(String name, String superpower, double bounty, List<Crime> crimes,
			SuperPrison superPrisonHolder) {
		super();
		this.name = name;
		Superpower = superpower;
		this.bounty = bounty;
		this.crimes = crimes;
		this.superPrisonHolder = superPrisonHolder;
	}


	public int getSvillId() {
		return svillId;
	}


	public void setSvillId(int svillId) {
		this.svillId = svillId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSuperpower() {
		return Superpower;
	}


	public void setSuperpower(String superpower) {
		Superpower = superpower;
	}


	public double getBounty() {
		return bounty;
	}


	public void setBounty(double bounty) {
		this.bounty = bounty;
	}


	public List<Crime> getCrimes() {
		return crimes;
	}


	public void setCrimes(List<Crime> crimes) {
		this.crimes = crimes;
	}


	public SuperPrison getSuperPrisonHolder() {
		return superPrisonHolder;
	}


	public void setSuperPrisonHolder(SuperPrison superPrisonHolder) {
		this.superPrisonHolder = superPrisonHolder;
	}


	@Override
	public String toString() {
		return "SuperVillain [svillId=" + svillId + ", name=" + name + ", Superpower=" + Superpower + ", bounty="
				+ bounty + ", crimes=" + crimes + ", superPrisonHolder=" + superPrisonHolder + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(Superpower, bounty, crimes, name, superPrisonHolder, svillId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuperVillain other = (SuperVillain) obj;
		return Objects.equals(Superpower, other.Superpower)
				&& Double.doubleToLongBits(bounty) == Double.doubleToLongBits(other.bounty)
				&& Objects.equals(crimes, other.crimes) && Objects.equals(name, other.name)
				&& Objects.equals(superPrisonHolder, other.superPrisonHolder) && svillId == other.svillId;
	}
	
	
	
}
