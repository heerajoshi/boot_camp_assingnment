package ballinbag;

import java.util.*;

class Bag {

  Map<BallColor, List<Ball>> balls;

  Bag() {
    this.balls = new HashMap<>();
  }

  Integer getTotalBallCount(){
    Integer totalBalls  = 0;
    for (BallColor ballColor : balls.keySet()) {
      totalBalls += balls.get(ballColor).size();
    }
    return totalBalls;
  }

  boolean validateRedBalls(){
    Integer redBallCount = this.balls.get(BallColor.RED).size();
    Integer greenBallCount = this.balls.get(BallColor.GREEN).size();
    return  redBallCount < greenBallCount*2;
  }

  boolean validateGreenBalls(){
    Integer greenBallCount = this.balls.get(BallColor.GREEN).size();
    return greenBallCount < 3;
  }

  boolean validateYellowBalls(){
    Integer yellowBallCount = this.balls.get(BallColor.YELLOW).size();
    return yellowBallCount < 5;
  }


//  static void create(){
//    Bag bag = new Bag();
//    bag.balls.put("Red",new ArrayList<>());
//    bag.balls.put("Green",new ArrayList<>());
//    bag.balls.put("Yellow",new ArrayList<>());
//    bag.balls.put("Blue",new ArrayList<>());
//  }
////  boolean addRedBall(){
////    balls.put("Red",new ArrayList<>());
////  }
//
//  public static void main(String[] args) {
//
//  }

}
