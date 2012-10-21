package edu.lmu.cs.wutup.ws.service;

import java.util.List;

import edu.lmu.cs.wutup.ws.model.Quadrangle;
import edu.lmu.cs.wutup.ws.model.Venue;

public interface VenueService extends CommentService {

    void createVenue(Venue loc);

    Venue findVenueById(int id);

    List<Venue> findVenues(String name, Integer eventId, Quadrangle searchBox, int pageNumber, int pageSize);

    void updateVenue(Venue loc);

    void deleteVenue(int venueId);

    int findNumberOfVenues();

}
