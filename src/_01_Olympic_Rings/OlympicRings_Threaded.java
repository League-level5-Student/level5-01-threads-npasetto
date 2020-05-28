package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Thread[] threads=new Thread[5];
		Robot[] robots=new Robot[5];
		for(int j=0; j<threads.length; j++) {
			robots[j]=new Robot("mini");
			Robot robot=robots[j];
			robot.setX(250+50*j);
			robot.setY(200+35*j);
			robot.setPenColor(j*51, 255-j*51, j*j*10);
			threads[j]=new Thread(()->{
				robot.penDown();
				robot.setSpeed(100000);
				for(int i=0; i<18; i++) {
					robot.move(20);
					robot.turn(20);
				}
				});
		}
		for(int j=0; j<threads.length; j++) {
			threads[j].start();
		}
	}
}

