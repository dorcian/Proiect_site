package com.dorciboss.service;

import com.dorciboss.repositories.TripRepository;
import com.dorciboss.model.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {

    private final TripRepository tripRepository;

    @Autowired
    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<Trip> findTrips(String destination) {
        return tripRepository.getFlightsByDetails(destination);
    }
}
