import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
      size(600, 400);
    }
  
    /** 
     * Called once at the beginning of execution.  Add initial set up
     * values here i.e background, stroke, fill etc.
     */
    public void setup() {
  
      background(25, 25, 112);
  
      //generate stars
      fill(255, 255, 0); 
      float ellipseX = random(300, 400);
      float ellipseY = random(0, 200);
      float ellipseWidth = random(10, 50);
      float ellipseHeight = random(10, 50);
      ellipse(ellipseX, ellipseY, ellipseWidth, ellipseHeight);
  
      float ellipseX1 = random(400, 400);
      float ellipseY1 = random(150, 200);
      float ellipseWidth1 = random(10, 50);
      float ellipseHeight1 = random(10, 50);
      ellipse(ellipseX1, ellipseY1, ellipseWidth1, ellipseHeight1);
  
      float ellipseX2 = random(100, 400);
      float ellipseY2 = random(250, 100);
      float ellipseWidth2 = random(10, 50);
      float ellipseHeight2 = random(10, 50);
      ellipse(ellipseX2, ellipseY2, ellipseWidth2, ellipseHeight2);
  
      float randomX = random(200, 600);
      float randomY = random(200, 600);
      if (randomX < 150 && randomY < 150)
        ellipse(randomX, randomY, ellipseWidth, ellipseHeight);
  
    }
  
    /**
     * Called repeatedly, anything drawn to the screen goes here
     */
    public void draw() {
      
    //House Roof
      fill(255,0, 0);
      triangle((float)(width/30), (float)(height*0.7375), (float)(width*0.15), (float)(height*0.4875), (float)(width*0.24166667), (float)(height*0.7375));
  
      //garage
      stroke(100);
      line((float)(width/6), (float)(height*0.7375), (float)(width*0.375), (float)(height*0.75));
      line((float)(width*0.375), (float)(height*0.75), (float)(width*0.41666667), (float)(height/1));
  
      //Moon
      fill(	240, 196, 32);
      ellipse((float)(width/1), (float)(height*0), (float)(width/2), (float)(height*0.75));
  
      //House Walls
      fill(124, 252, 0);
      size(600, 400);
      rect((float)(width/30), (float)(height*0.7375), (float)(width*0.20833333), (float)(height*0.2625));
  
      //Flowers
      fill(0, 128, 0);
      ellipse((float)(width*0.58333333), (float)(height/1), (float)(width/120), (float)(height/4));
      ellipse((float)(width*0.45), (float)(height/1), (float)(width/120), (float)(height/4));
      ellipse((float)(width*0.75), (float)(height/1), (float)(width/120), (float)(height/4));
  
      // Flowers
      fill(255, 255, 0);
      ellipse((float)(width*0.58333333), (float)(height*0.9), (float)(width/15), (float)(height*0.075));
      ellipse((float)(width*0.45), (float)(height*0.9), (float)(width/15), (float)(height*0.075));
      ellipse((float)(width*0.75), (float)(height*0.9), (float)(width/15), (float)(height*0.075));
  
    }
    
    // define other methods down here.
  }