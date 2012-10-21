package edu.lmu.cs.wutup.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.lmu.cs.wutup.ws.dao.VenueDao;
import edu.lmu.cs.wutup.ws.model.Comment;
import edu.lmu.cs.wutup.ws.model.Quadrangle;
import edu.lmu.cs.wutup.ws.model.Venue;
import edu.lmu.cs.wutup.ws.service.VenueService;

@Service
@Transactional
public class VenueServiceImpl implements VenueService {

    @Autowired
    VenueDao venueDao;

    @Override
    public void createVenue(Venue loc) {
        venueDao.createVenue(loc);
    }

    @Override
    public void updateVenue(Venue loc) {
        venueDao.updateVenue(loc);
    }

    @Override
    public Venue findVenueById(int id) {
        return venueDao.findVenueById(id);
    }



    @Override
    public List<Venue> findVenues(String name, Integer eventId, Quadrangle searchBox, int pageNumber, int pageSize) {
        return venueDao.findVenues(name, eventId, searchBox, pageNumber, pageSize);
    }

    @Override
    public void deleteVenue(int venueId) {
        venueDao.deleteVenue(venueId);
    }

    @Override
    public int findNumberOfVenues() {
        return venueDao.findNumberOfVenues();
    }

    @Override
    public void addComment(int venueId, Comment comment) {
        venueDao.addComment(venueId, comment);

    }

    @Override
    public void updateComment(int commentId, Comment comment) {
        venueDao.updateComment(commentId, comment);

    }

    @Override
    public List<Comment> findComments(int venueId, int page, int pageSize) {
        return venueDao.findComments(venueId, page, pageSize);
    }

    @Override
    public void deleteComment(int venueId, int commentId) {
        venueDao.deleteComment(venueId, commentId);

    }
}
