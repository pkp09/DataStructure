/**
 * 
 */
package com.prashant.designpattern.observer;

/**
 * @author pkpandey
 *
 */
public interface Subject {
	public void attachObserver(Observer observer);

	public void detachObserver(Observer observer);

	public void publish(Message message);
}
