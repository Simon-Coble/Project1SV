package com.room3.models;

import java.util.Objects;

import com.room3.annotations.Column;
import com.room3.annotations.Entity;
import com.room3.annotations.Id;



@Entity(tableName = "crimes")
public class Crime {

	@Id(columnName = "crime_id")
	private int crimeId;
	
	@Column(columnName = "crime_name")
	private String crimeName;
	private String description;
	
	public Crime() {
		
	}

	public Crime(String crimeName, String description) {
		super();
		this.crimeName = crimeName;
		this.description = description;
	}
	
	public Crime(int crimeId, String crimeName, String description) {
		super();
		this.crimeId = crimeId;
		this.crimeName = crimeName;
		this.description = description;
	}

	public int getCrimeId() {
		return crimeId;
	}

	public void setCrimeId(int crimeId) {
		this.crimeId = crimeId;
	}

	public String getCrimeName() {
		return crimeName;
	}

	public void setCrimeName(String crimeName) {
		this.crimeName = crimeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Crime [crimeId=" + crimeId + ", crimeName=" + crimeName + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(crimeId, crimeName, description);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Crime other = (Crime) obj;
		return crimeId == other.crimeId && Objects.equals(crimeName, other.crimeName)
				&& Objects.equals(description, other.description);
	}
	
}
