Cannonball ball = new Cannonball();
private static final float TIME_STEP = 0.00001;

void setup(){
  size(1200,800);
  
  smooth();
  ball.shoot(90,70);
  frameRate(100);
}

void draw(){
  background(255,255,255);
  
  for(int i = 0; i < 10000; i++)
    ball.move(TIME_STEP);
    fill(255,0,0);
    ellipse(ball.getX(),755-ball.getY(),30,30);
}
