package com.epam.mapsexample.service;

import com.epam.mapsexample.model.Location;

public interface CurrentLocationService {

	Location getCurrentLocation(boolean mock);
	Location getCurrentLocation();
}
