package com.masai.service;

import com.masai.exception.EventException;
import com.masai.model.Event;

public interface EventService {

	public Event addEvent(Event event)throws EventException;
	
	public Event updateEvent(Integer id,Event event)throws EventException;
	
	public Event deleteEvent(Integer id)throws EventException;
   
}
