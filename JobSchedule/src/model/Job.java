package model;

import java.util.Date;

public class Job {
	private int id;
	private String description;
	private Date dateMaxFinish;
	private double timeEstipulate;
	
	public Job() {
	}
	
	public Job(int id, String description, Date dateMaxFinish, double timeEstipulate) {
		super();
		this.id = id;
		this.description = description;
		this.dateMaxFinish = dateMaxFinish;
		this.timeEstipulate = timeEstipulate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateMaxFinish() {
		return dateMaxFinish;
	}
	public void setDateMaxFinish(Date dateMaxFinish) {
		this.dateMaxFinish = dateMaxFinish;
	}
	public double getTimeEstipulate() {
		return timeEstipulate;
	}
	public void setTimeEstipulate(double timeEstipulate) {
		this.timeEstipulate = timeEstipulate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Job other = (Job) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Job [id=" + id + ", description=" + description + ", dateMaxFinish=" + dateMaxFinish
				+ ", timeEstipulate=" + timeEstipulate + "]";
	}
}
