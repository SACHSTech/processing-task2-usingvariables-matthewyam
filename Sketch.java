import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  public void settings() {
    size(1000, 300);
  }

  public void setup() {
    background(0, 0, 0);
  }


  public void draw() {
	  
    
    //The Body
    stroke(152, 251, 152);
    line(width/4, height/2, width/4, height);
    line((float) (width/1.33), (float)(height/2), (float)(width/1.33), (float)(height));  
    line(width/4, height/2, (float)(width/1.33), height/2);
    
    //Door
    stroke(255, 0, 0);
    fill(255, 0, 0);
    rect((float)(width/2.38), (float)(height/1.25), (float)(width/6.25), (float)(height/1.02));
    
    //The Roof
    stroke(21, 244, 238);
    line((float)(width/1.33), height/2, width/2, (float)(height/3.33));
    line(width/4, height/2, width/2, (float)(height/3.33));

    //The Doorknob
    stroke(255, 247, 0);
    fill(255, 247, 0);
    ellipse((float)(width/1.785), (float)(height/1.098), width/50, height/50);

    //The Moon
    stroke(255);
    fill(255);
    ellipse(width*0, height*0, width/2, height/2);
    
    
  }
  

}