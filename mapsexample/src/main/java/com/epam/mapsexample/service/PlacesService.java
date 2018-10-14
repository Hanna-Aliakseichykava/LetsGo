package com.epam.mapsexample.service;

import java.util.List;

import com.epam.mapsexample.model.Location;
import com.epam.mapsexample.model.PlaceType;

import se.walkercrou.places.Place;

public interface PlacesService {

	List<Place> getPlaces(Location location, PlaceType type);

}
