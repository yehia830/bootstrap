package com.tiy;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by jessicatracy on 9/29/16.
 */
public interface UserEventRepository extends CrudRepository<UserEvent, Integer> {
    public Iterable<UserEvent> findAllByEventId(int eventId);
    List<UserEvent> findByUserIdAndEventId(int userId, int eventId);
}
