package com.tts.MapsApp.service;

import com.tts.MapsApp.model.Location;

public interface MapsService {

    void addCoordinates(Location location);
    void setRandomCoordinates(Location location);
}


