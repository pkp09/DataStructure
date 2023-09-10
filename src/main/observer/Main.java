package com.prashant.designpattern.observer;

public class Main {

	public static void main(String[] args) {
		MessageSubscriberOne one = new MessageSubscriberOne();
		MessageSubscriberTwo two = new MessageSubscriberTwo();
		MessageSubscriberThree three = new MessageSubscriberThree();

		MessagePublisher publisher = new MessagePublisher();
		publisher.attachObserver(one);
		publisher.attachObserver(two);
		publisher.attachObserver(three);

		Message m1 = new Message("Message");
		publisher.publish(m1);

		publisher.detachObserver(two);
		m1.setMessage("Updated Message");
		publisher.publish(m1);
	}
}