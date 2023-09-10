/**
 * 
 */
package com.prashant.designpattern.observer;

/**
 * @author pkpandey
 *
 */
public class MessageSubscriberTwo implements Observer {

	/* (non-Javadoc)
	 * @see com.prashant.designpattern.observer.Observer#update(com.prashant.designpattern.observer.Message)
	 */
	@Override
	public void getUpdate(Message message) {
		System.out.println("TWO : " + message.getMessage());
	}
}