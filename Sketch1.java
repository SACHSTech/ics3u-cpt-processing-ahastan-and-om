import processing.core.PApplet;
import processing.core.PFont;

public class Sketch1 extends PApplet {
  PFont f;
  PFont title;
  public boolean contnue = false;
	
  public void settings() {
    size(500, 500);
  }


  public void setup() {
    background(92, 150, 242);
    f = createFont("Arial", 16, true);
    title = createFont("Times New Roman", 75);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    textFont(f, 20);
    fill(0);
    text("Welcome to", 200, 20);
    textFont(title, 27);
    fill(0);
    text("NBA ULTIMATE TEAM SIMULATOR", 40, 60);
    textFont(f, 16);
    fill(18, 109, 128);
    text("CHOOSE YOUR FAVORITE TEAM", 120, 200);
    
    stroke(225);
    fill(225);
    rect(50,100, 70, 70);

    if (contnue == true)
    {
      background(92, 150, 242);
      rect(5, 100, 20, 40);
    }
  }

  public void mouseClicked()
  {
    if(mouseX > 50 && mouseX < 120 && mouseY > 100 && mouseY < 170)
    {
      contnue = true;
    }
  }

  
  // define other methods down here.
}
