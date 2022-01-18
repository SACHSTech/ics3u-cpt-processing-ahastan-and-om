import processing.core.PApplet;

public class Sketch1 extends PApplet {
  public boolean contnue = false;
	
  public void settings() {
    size(500, 500);
  }


  public void setup() {
    background(92, 150, 242);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
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
