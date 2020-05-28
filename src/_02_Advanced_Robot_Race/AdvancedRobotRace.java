package _02_Advanced_Robot_Race;


import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
	


		static //1. make a main method
		Random rand=new Random();
		static Robot finished=null;
		public static void main(String[] args) {
			//2. create an array of 5 robots.
			Robot[] robots=new Robot[5];
			Thread[] threads=new Thread[5];
					//3. use a for loop to initialize the robots.
	for (int i = 0; i < robots.length; i++) {
		robots[i]=new Robot("mini");
		Robot robot=robots[i];
		robot.setX(100+100*i);
		robot.setSpeed(55);
		robot.setY(500);
		robot.setAngle(0);
		threads[i]=new Thread(()->{
			int move=0;
			while(move<360 && finished==null) {
				int random=rand.nextInt(40);
				move+=random;
				robot.move(random);
				robot.turn(10);
			}
			if(move>=360 && finished==null) {
				finished=robot;
				System.out.println(finished+" won!!!!");
			}
		});
	}
	for(int i=0; i<threads.length; i++) {
		threads[i].start();
	}
	
						//4. make each robot start at the bottom of the screen, side by side, facing up
				
					//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

					//7. declare that robot the winner and throw it a party!
	
			    	
					//8. try different races with different amounts of robots.
			    	
				    //9. make the robots race around a circular track.
		}
			

		
	}
	


