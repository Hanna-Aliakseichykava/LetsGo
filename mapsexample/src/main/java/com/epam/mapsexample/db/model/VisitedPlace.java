package com.epam.mapsexample.db.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.epam.mapsexample.model.PlaceType;

@Entity
@Table(name = "visited_place")

public class VisitedPlace {

	public VisitedPlace() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "owner_id")
	private AppUser owner;

	@Column(name = "place_type")
	private PlaceType placeType;

	@Column(name = "weather")
	private double weather;

	@Column(name = "mark")
	private float mark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AppUser getOwner() {
		return owner;
	}

	public void setOwner(AppUser owner) {
		this.owner = owner;
	}

	public PlaceType getPlaceType() {
		return placeType;
	}

	public void setPlaceType(PlaceType placeType) {
		this.placeType = placeType;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

	public double getWeather() {
		return weather;
	}

	public void setWeather(double weather) {
		this.weather = weather;
	}

}
