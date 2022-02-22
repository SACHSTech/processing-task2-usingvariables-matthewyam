import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  public void settings() {
    size(500, 500);
  }

  public void setup() {
    background(0, 0, 0);
  }


  public void draw() {
	  
    
    //The Roof
    stroke(152, 251, 152);
    line(width/4, height/2, width/4, height);
    line((float) (width/1.33), (float)(height/2), (float)(width/1.33), (float)(height));  
    line(width/4, height/2, (float)(width/1.33), height/2);
    
    //The body of the house
    stroke(255, 0, 0);
    fill(0, 0, 0);
    rect((float)(width/2.38), (float)(height/1.25), (float)(width/6.25), (float)(height/1.02));
    
    //The Door
    stroke(21, 244, 238);
    line(375, 250, 250, 150);
    line(125, 250, 250, 150);

    //The Doorknob
    stroke(255, 247, 0);
    ellipse(280, 455, 10, 10);

    //The Moon
    stroke(255);
    fill(255);
    ellipse(0, 0, 250, 250);
    
    
  }
  

}