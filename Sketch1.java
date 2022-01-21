import processing.core.PApplet;
import processing.core.PFont;

public class Sketch1 extends PApplet {
  PFont text;
  PFont title;
  PFont subtitle;
  public String [] teams = {"Chicago Bulls", "Miami Heat", "Brooklyn Nets", "Cleveland Cavaliers", 
  "Milwaukee Bucks", "Philadelphia 76ers", "Charlotte Hornets", "Washington Wizards", "Toronto Raptors", "Boston Celtics", 
  "New York Knicks", "Atlanta Hawks", "Indiana Pacers", "Detroit Pistons", "Orlando Magic", "Phoenix Suns", "Golden State Warriors", "Memphis Grizzlies", "Utah Jazz", "Dallas Mavericks", 
  "Denver Nuggets", "Los Angeles Lakers", "Los Angeles Clippers", "Minnesota Timberwolves", "Portland Trail Blazers", 
  "Sacramento Kings", "San Antonio Spurs", "New Orleans Pelicans", "Oklahoma City Thunder", "Houston City Rockets"};
  public String[][] players = new String[29][5];
  public String playerTeam;
  public int playerTeamCount;
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
            playerTeamCount = teamArray;
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

    if(continueMove == true && mouseX >= 180 && mouseX <= 300 && mouseY >= 400 && mouseY <= 450)
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

    //bulls
    players[0][0] = "Lonzo Ball";
    players[0][1] = "Demar Derozan";
    players[0][2] = "Zach Lavine";
    players[0][3] = "Nikola Vucevic";
    players[0][4] = "Patrick Williams";

    //miami
    players[1][0] = "Kyle Lowry";
    players[1][1] = "Duncan Robinson";
    players[1][2] = "Jimmy Butler";
    players[1][3] = "PJ Tucker";
    players[1][4] = "Bam Adebayo";

    //nets
    players[2][0] = "Kyrie Irving";
    players[2][1] = "James Harden";
    players[2][2] = "Kevin Durant";
    players[2][3] = "Blake Griffin";
    players[2][4] = "Nic Claxton";

    //cavs
    players[3][0] = "Darius Garland";
    players[3][1] = "Collin Sexton";
    players[3][2] = "Isaac Okoro";
    players[3][3] = "Evan Mobley";
    players[3][4] = "Jarret Allen";

    //bucks
    players[4][0] = "Jrue Holiday";
    players[4][1] = "Grayson Allen";
    players[4][2] = "Khris Middleton";
    players[4][3] = "Giannis Antentokounmpo";
    players[4][4] = "Bobby Portis";

    //76ers
    players[5][0] = "Ben Simmons";
    players[5][1] = "Seth Curry";
    players[5][2] = "Tyrese Maxey";
    players[5][3] = "Tobias Harris";
    players[5][4] = "Joel Embiid";

    //hornets
    players[6][0] = "Lamelo Ball";
    players[6][1] = "Terry Rozier";
    players[6][2] = "Gordon Hayward";
    players[6][3] = "Miles Bridges";
    players[6][4] = "Mason Plumlee";

    //wizards
    players[7][0] = "Spencer Dinwiddie";
    players[7][1] = "Bradley Beal";
    players[7][2] = "Kentavious Caldwell Pope";
    players[7][3] = "Kyle Kuzma";
    players[7][4] = "Daniel Gafford";

    //raptors
    players[8][0] = "Fred Vanvleet";
    players[8][1] = "Gary Trent Jr";
    players[8][2] = "OG Anunoby";
    players[8][3] = "Scottie Barnes"; 
    players[8][4] = "Pascal Siakam";
    
    //celtics
    players[9][0] = "Marcus Smart";
    players[9][1] = "Jaylen Brown";
    players[9][2] = "Jason Tatum";
    players[9][3] = "Robert Williams";
    players[9][4] = "Enes Kanter";

    //knicks
    players[10][0] = "Kemba Walker";
    players[10][1] = "Evan Fournier";
    players[10][2] = "RJ Barrett";
    players[10][3] = "Julius Randle";
    players[10][4] = "Mitchell Robinson";

    //hawks
    players[11][0] = "Trae Young";
    players[11][1] = "Bogdan Bogdanovic";
    players[11][2] = "De'Andre Hunter";
    players[11][3] = "John Collins";
    players[11][4] = "Clint Capela";

    //pacers
    players[12][0] = "Malcolm Brogdon";
    players[12][1] = "Caris Levert";
    players[12][2] = "Jeremy Lamb";
    players[12][3] = "Domantas Sabonis";
    players[12][4] = "Myles Turner";

    //pistons
    players[13][0] = "Killian Hayes";
    players[13][1] = "Cade Cunningham";
    players[13][2] = "Hamidou Diallo";
    players[13][3] = "Jerami Grant";
    players[13][4] = "Isaiah Stewart";

    //magic
    players[14][0] = "Cole Anthony";
    players[14][1] = "Jalen Suggs";
    players[14][2] = "Franz Wagner";
    players[14][3] = "Wendell Carter Jr";
    players[14][4] = "Mo Bamba";

    //suns
    players[15][0] = "Chris Paul";
    players[15][1] = "Devin Booker";
    players[15][2] = "Mikal Bridges";
    players[15][3] = "Jae Crowder";
    players[15][4] = "Deandre Ayton";


    for (int p = 0; p <= 29; p++)
    {
      if (playerTeamCount == p)
      {
        textFont(text, 30);
        fill(18, 109, 128);
        text(players[p][0], 50, 100, 92, 225);

        textFont(text, 30);
        fill(18, 109, 128);
        text(players[p][1], 200, 100, 92, 225);

        textFont(text, 30);
        fill(18, 109, 128);
        text(players[p][2], 350, 100, 92, 225);

        textFont(text, 30);
        fill(18, 109, 128);
        text(players[p][3], 150, 250, 92, 225);

        textFont(text, 30);
        fill(18, 109, 128);
        text(players[p][4], 275, 250, 92, 225);
        
        // for (int o = 0; o <= 4; o++)
        // {
        //   textFont(text, 30);
        //   fill(18, 109, 128);
        //   text(players[p][o], 230, 200, 92, 225);
        // }
      }
    }
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
