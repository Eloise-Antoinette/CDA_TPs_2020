package TP5;

public class TP5 {

	public static void main(String[] args) {
		Robot myRobot = new Robot();
		myRobot.showAttributes();
		
		myRobot.setSpeed(12);
		myRobot.setStatus("ok");
		myRobot.setTemperature(123);
		myRobot.showAttributes();
	}

}
