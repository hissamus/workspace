package com.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.ballquiz.Ball;

public class Tester {

	public static void main(String[] args) {

		List<Ball> balls = new ArrayList<>();
		balls = generateBalls();
		//balls=generateStaticWeightBalls();
		int j=0;
		for (Ball b : balls) {
			System.out.println("Ball " + ++j +"  :  "+ b.getWeight());
		}

		do {
			int grpOneWeight = balls.get(0).getWeight()
					+ balls.get(1).getWeight() + balls.get(2).getWeight();
			int grpTwoWeight = balls.get(3).getWeight()
					+ balls.get(4).getWeight() + balls.get(5).getWeight();

			if (grpOneWeight == grpTwoWeight) {
				if (balls.get(6).getWeight() > balls.get(7).getWeight()) {
					System.out.println("7th ball is Heavy.");
					break;
				} else {
					System.out.println("8th ball is Heavy.");
					break;
				}
			}else if (grpOneWeight> grpTwoWeight){
				if(balls.get(0).getWeight()==balls.get(1).getWeight()){
					System.out.println("3rd ball is Heavy.");
					break;
				}else if(balls.get(0).getWeight()>balls.get(1).getWeight()){
					System.out.println("1st ball is Heavy.");
					break;
				}else{
					System.out.println("2nd ball is Heavy.");
					break;
				}
			}else if (grpOneWeight< grpTwoWeight){
				if(balls.get(3).getWeight()==balls.get(4).getWeight()){
					System.out.println("6th ball is Heavy.");
					break;
				}else if(balls.get(3).getWeight()>balls.get(4).getWeight()){
					System.out.println("4th ball is Heavy.");
					break;
				}else{
					System.out.println("5th ball is Heavy.");
					break;
				}
			}
		} while (true);

	}

	private static ArrayList<Ball> generateBalls() {
		int weight;
		int count = 0;
		int ballsCount = 0;
		Random rand = new Random();
		ArrayList<Ball> balls = new ArrayList<>();
		do {
			weight = rand.nextInt(100);//10 - 9 + 1) + 9;
			if (count == 1 && weight == 10) {
				continue;
			} else if (count == 0 && weight == 10) {
				count = 1;
				++ballsCount;
				balls.add(new Ball(weight));
			} else {
				++ballsCount;
				balls.add(new Ball(weight));
			}
		} while (ballsCount != 8);

		return balls;
	}
	
	private static ArrayList<Ball> generateStaticWeightBalls(){
		ArrayList<Ball> balls = new ArrayList<>();
		balls.add(new Ball(9));
		balls.add(new Ball(9));
		balls.add(new Ball(9));
		balls.add(new Ball(9));
		balls.add(new Ball(9));
		balls.add(new Ball(9));
		balls.add(new Ball(9));
		balls.add(new Ball(10));
		
		return balls;
	}

}
