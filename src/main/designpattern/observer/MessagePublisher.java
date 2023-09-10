/**
 * 
 */
package com.prashant.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pkpandey
 *
 */
public class MessagePublisher implements Subject {
	private List<Observer> alObserver = new ArrayList<>();

	/* (non-Javadoc)
	 * @see com.prashant.designpattern.observer.Subject#attach(com.prashant.designpattern.observer.Observer)
	 */
	@Override
	public void attachObserver(Observer observer) {
		alObserver.add(observer);
	}

	/* (non-Javadoc)
	 * @see com.prashant.designpattern.observer.Subject#detach(com.prashant.designpattern.observer.Observer)
	 */
	@Override
	public void detachObserver(Observer observer) {
		alObserver.remove(observer);
	}

	/* (non-Javadoc)
	 * @see com.prashant.designpattern.observer.Subject#notifyUpdate(com.prashant.designpattern.observer.Message)
	 */
	@Override
	public void publish(Message message) {
		alObserver.forEach(ob -> ob.getUpdate(message));
	}
}