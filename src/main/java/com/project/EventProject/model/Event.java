package com.project.EventProject.model;
import java.util.Set;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

	@Entity
	public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String eventname,location,fees;

	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(name="event_images",joinColumns= {
			@JoinColumn(name="event_id")
	},
	inverseJoinColumns= {
			@JoinColumn(name="image_id")
	}
	)
	private Set<ImageModel> eventImages;
	


	public Set<ImageModel> getEventImages() {
		return eventImages;
	}
	public void setEventImages(Set<ImageModel> eventImages) {
		this.eventImages = eventImages;
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Event(String eventname, String location, String fees) {
		super();
		this.eventname = eventname;
		this.location = location;
		this.fees = fees;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
}
