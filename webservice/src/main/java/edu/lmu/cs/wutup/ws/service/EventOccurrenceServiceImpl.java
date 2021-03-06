package edu.lmu.cs.wutup.ws.service;

import java.sql.Timestamp;
import java.util.List;

import org.joda.time.Interval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.lmu.cs.wutup.ws.dao.EventOccurrenceDao;
import edu.lmu.cs.wutup.ws.model.Circle;
import edu.lmu.cs.wutup.ws.model.Comment;
import edu.lmu.cs.wutup.ws.model.EventOccurrence;
import edu.lmu.cs.wutup.ws.model.PaginationData;
import edu.lmu.cs.wutup.ws.model.User;

@Service
@Transactional
public class EventOccurrenceServiceImpl implements EventOccurrenceService {

    @Autowired
    EventOccurrenceDao eventOccurrenceDao;

    @Override
    public int createEventOccurrence(EventOccurrence e) {
        return eventOccurrenceDao.createEventOccurrence(e);
    }

    @Override
    public void updateEventOccurrence(EventOccurrence e) {
        eventOccurrenceDao.updateEventOccurrence(e);
    }

    @Override
    public void deleteEventOccurrence(int id) {
        eventOccurrenceDao.deleteEventOccurrence(id);
    }

    @Override
    public List<User> findAttendeesByEventOccurrenceId(int id, PaginationData pagination) {
        return eventOccurrenceDao.findAttendeesByEventOccurrenceId(id, pagination);
    }

    @Override
    public EventOccurrence findEventOccurrenceById(int id) {
        return eventOccurrenceDao.findEventOccurrenceById(id);
    }

    // TODO: Test this
    @Override
    public List<EventOccurrence> findEventOccurrenceByProperties(Integer parentEventId, Integer venueId, Timestamp start, Timestamp end){
        return eventOccurrenceDao.findEventOccurrenceByProperties(parentEventId, venueId, start, end);
    }

    @Override
    public List<EventOccurrence> findEventOccurrences(Integer attendee, Circle circle, Interval interval,
            List<Integer> eventId, Integer venueId, PaginationData pagination) {
        return eventOccurrenceDao.findEventOccurrences(attendee, circle, interval, eventId, venueId, pagination);
    }

    @Override
    public void registerAttendeeForEventOccurrence(int eventOccurrenceId, int attendeeId) {
        eventOccurrenceDao.registerAttendeeForEventOccurrence(eventOccurrenceId, attendeeId);
    }

    @Override
    public void unregisterAttendeeForEventOccurrence(int eventOccurrenceId, int attendeeId) {
        eventOccurrenceDao.unregisterAttendeeForEventOccurrence(eventOccurrenceId, attendeeId);
    }

    @Override
    public Integer addComment(int eventId, Comment comment) {
        return eventOccurrenceDao.addComment(eventId, comment);
    }

    @Override
    public void updateComment(int commentId, Comment comment) {
        eventOccurrenceDao.updateComment(commentId, comment);

    }

    @Override
    public List<Comment> findComments(int eventId, PaginationData pagination) {
        return eventOccurrenceDao.findComments(eventId, pagination);
    }

    @Override
    public void deleteComment(int eventId, int commentId) {
        eventOccurrenceDao.deleteComment(eventId, commentId);
    }
}
