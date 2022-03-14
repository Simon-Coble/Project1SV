package com.room3.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.room3.annotations.Column;
import com.room3.annotations.Entity;
import com.room3.annotations.Id;

@Entity(tableName = "super_prison")
public class SuperPrison {
	
	@Id(columnName = "super_prison_id")
	private int spId;
	
	@Column(columnName = "name")
	private String name;
	
	@Column(columnName = "location")
	private String location;
	
	List<SuperVillain> villList = new ArrayList<SuperVillain>();

	public SuperPrison() {
		super();
	}

	public SuperPrison(int spId, String name, String location, List<SuperVillain> villList) {
		super();
		this.spId = spId;
		this.name = name;
		this.location = location;
		this.villList = villList;
	}

	public SuperPrison(String name, String location, List<SuperVillain> villList) {
		super();
		this.name = name;
		this.location = location;
		this.villList = villList;
	}
	

	public SuperPrison(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public int getSpId() {
		return spId;
	}

	public void setSpId(int spId) {
		this.spId = spId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<SuperVillain> getVillList() {
		return villList;
	}

	public void setVillList(List<SuperVillain> villList) {
		this.villList = villList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, name, spId, villList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuperPrison other = (SuperPrison) obj;
		return Objects.equals(location, other.location) && Objects.equals(name, other.name) && spId == other.spId
				&& Objects.equals(villList, other.villList);
	}

	@Override
	public String toString() {
		return "SuperPrison [spId=" + spId + ", name=" + name + ", location=" + location + ", villList=" + villList
				+ "]";
	}
}
