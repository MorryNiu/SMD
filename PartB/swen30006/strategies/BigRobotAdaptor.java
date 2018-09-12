package strategies;

import automail.BigRobot;
import automail.IMailDelivery;

/** Adaptor for big robots **/
public class BigRobotAdaptor implements RobotAdaptor {
	
	@Override
	public BigRobot create(IMailPool mailPool, IMailDelivery delivery) {
		return new BigRobot(delivery, mailPool);
	}

}
