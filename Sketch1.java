import processing.core.PApplet;
import processing.core.PFont;

public class Sketch1 extends PApplet {
  PFont text;
  PFont title;
  PFont subtitle;
  public String [] teams = {"ChicagoBulls", "Miami Heat", "Brooklyn Nets", "Cleveland Cavaliers", 
  "Milwaukee Bucks", "Philadelphia 76ers", "Charlotte Hornets", "Washington Wizards", "Toronto Raptors", "Boston Celtics", 
  "New York Knicks", "Atlanta Hawks", "Indiana Pacers", "Detroit Pistons", "Orlando Magic", "Phoenix Suns", "Golden State Warriors", "Memphis Grizzlies", "Utah Jazz", "Dallas Mavericks", 
  "Denver Nuggets", "Los Angeles Lakers", "Los Angeles Clippers", "Minnesota Timberwolves", "Portland Trail Blazers", 
  "Sacramento Kings", "San Antonio Spurs", "New Orleans Pelicans", "Oklahoma City Thunder", "Houston City Rockets"};
  public String [] ChicagoBulls = {"Lonzo Ball", "Demar Derozan", "Zach Lavine", "Nikola Vucevic", "Patrick Williams"};
  public String playerTeam;
  public boolean screen1Move = false;
  public boolean rosterScreenMove = false;
  public boolean continueMove = false;
  public int gameCycle = 0;

	
  public void settings() {
    size(500, 500);
    String[] fontList = PFont.list();
    printArray(fontList);
  }


  public void setup() {
    background(92, 150, 242);
    subtitle = createFont("DialogInput.italic", 16, true);
    title = createFont("DialogInput.bolditalic", 75);
    text = createFont("Playbill", 75);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Introduction Screen
    screen1();
    // Home Screen
    if (screen1Move == true){
      screen2();
      if (rosterScreenMove == true)
      {
        rosterScreen();
      }
      if(continueMove == true)
      {
        continueScreen();
      }
    } 
  }

  public void mouseClicked()
  {
    //Introduction Page Commands
    if(screen1Move == false)
    {
      int teamArray = 0;
      for (int h = 20; h < 460; h = h + 92)
      {
        for (int v = 175; v < 460; v = v + 50)
        {
          if (mouseX >= h && mouseX <= (h+92) && mouseY >= v && mouseY <= (v+50))
          {
            playerTeam = teams[teamArray];
            screen1Move = true;
          }
          teamArray++;
        }
      }
    }

    //Homepage commands
    if(rosterScreenMove == false && mouseX >= 50 && mouseX <= 170 && mouseY >= 400 && mouseY <= 450)
    {
      rosterScreenMove = true;
    }

    if(rosterScreenMove == true && mouseX >= 180 && mouseX <= 300 && mouseY >= 400 && mouseY <= 450)
      {
        rosterScreenMove = false;
      }

    if(continueMove == false && mouseX >= 300 && mouseX <= 420 && mouseY >= 400 && mouseY <= 450)
    {
      continueMove = true;
    }

    if(mouseX >= 180 && mouseX <= 300 && mouseY >= 400 && mouseY <= 450)
      {
        continueMove = false;
      }

  }

  //Introduction Screen
  public void screen1()
  {
    textFont(subtitle, 20);
    fill(0);
    text("Welcome to", 200, 30);
    textFont(title, 27);
    fill(0);
    text("NBA ULTIMATE TEAM SIMULATOR", 40, 60);
    textFont(text, 35);
    fill(18, 109, 128);
    text("CHOOSE YOUR FAVORITE TEAM", 110, 150);

    
    int count = 0;
    // Team grid
    for (int i = 20; i < 460; i = i + 92)
    {
      for (int j = 175; j < 460; j = j + 50)
      {
        stroke(0);
        fill(225);
        rect(i,j,92,50);
        
        textFont(text, 22);
        fill(18, 109, 128);
        text(teams[count], i, j, 92, 225);

        count++;
      }
    }
  }

  //Homepage
  public void screen2()
  {
    background(92, 150, 242);
    textFont(title, 25);
    fill(255,204,203);
    text("NBA ULTIMATE", 150, 30);

    // Game schedule
    stroke(208, 224, 29);
    fill(208, 224, 29);
    rect(50, 50, 400, 100);

    stroke(255);
    fill(255);
    line(50, 100, 450, 100);

    for(int gameDisplay = 75; gameDisplay < 450; gameDisplay = gameDisplay + 170)
    {
      ellipse(gameDisplay, 100, 40, 20);
    }

    //Standings Preview
    stroke(255);
    noFill();
    rect(50, 200, 150, 170);

    //continue and roster buttons
    stroke(255);
    noFill();
    rect(50, 400, 120, 50);
    textFont(text, 30);
    fill(18, 109, 128);
    text("ROSTER", 80, 410, 92, 225);

    stroke(255);
    noFill();
    rect (300, 400, 120, 50);
    textFont(text, 30);
    fill(18, 109, 128);
    text("CONTINUE", 320, 410, 92, 225);
  }

  //Roster Screen
  public void rosterScreen()
  {
    background(92, 150, 242);
    stroke(255);
    noFill();
    rect (180, 400, 120, 50);
    textFont(text, 30);
    fill(18, 109, 128);
    text("BACK", 230, 410, 92, 225);
  }

  //Continue Screen
  public void continueScreen()
  {
    background(92, 150, 242);
    background(92, 150, 242);
    stroke(255);
    noFill();
    rect (180, 400, 120, 50);
    textFont(text, 30);
    fill(18, 109, 128);
    text("BACK", 230, 410, 92, 225);
  }

}
