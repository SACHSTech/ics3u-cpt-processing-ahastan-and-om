import processing.core.PApplet;
import processing.core.PFont;

public class Sketch2 extends PApplet {
  PFont text;
  PFont title;
  PFont subtitle;
  public boolean introductionMove = false;
  public String [] teams = {"Chicago Bulls", "Miami Heat", "Brooklyn Nets", "Cleveland Cavaliers", 
    "Milwaukee Bucks", "Philadelphia 76ers", "Charlotte Hornets", "Washington Wizards", "Toronto Raptors", "Boston Celtics", 
    "New York Knicks", "Atlanta Hawks", "Indiana Pacers", "Detroit Pistons", "Orlando Magic", "Phoenix Suns", "Golden State Warriors", "Memphis Grizzlies", "Utah Jazz", "Dallas Mavericks", 
    "Denver Nuggets", "Los Angeles Lakers", "Los Angeles Clippers", "Minnesota Timberwolves", "Portland Trail Blazers", 
    "Sacramento Kings", "San Antonio Spurs", "New Orleans Pelicans", "Oklahoma City Thunder", "Houston City Rockets"};
  public String playerTeam;

	
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
    
  }
  

  public void mouseClicked()
  {
    if(mouseX > 20 && mouseX < 460 && mouseY > 175 && mouseY < 460)
    {
      int teamArray = 0;
      for (int h = 20; h < 460; h = h + 92)
      {
        for (int v = 175; v < 460; v = v + 50)
        {
          if (mouseX >= h && mouseX <= (h+92) && mouseY >= v && mouseY <= (v+50))
          {
            playerTeam = teams[teamArray];
            introductionMove = true;
          }
          teamArray++;
        }
      }
    }
  }

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

    if (introductionMove == true)
    {
      background(92, 150, 242);
      text(playerTeam, 110, 150);
    }
  }

  
  // players
  public String [] ChicagoBulls = {"Lonzo Ball", "Demar Derozan", "Zach Lavine", "Nikola Vucevic", "Patrick Williams"};
  public String [] MiamiHeat = {"Kyle Lowry", "Duncan Robinson", "Jimmy Butler", "PJ Tucker", "Bam Adebayo"};
  public String [] BrooklynNets = {"Kyrie Irving", "James Harden", "Kevin Durant", "Blake Griffin", "Nic Claxton"};
  public String [] ClevelandCavaliers = {"Darius Garland", "Collin Sexton", "Isaac Okoro", "Evan Mobley", "Jarret Allen"};
  public String [] MilwaukeeBucks = {"Jrue Holiday", "Grayson Allen", "Khris Middleton", "Giannis Antentokounmpo", "Bobby Portis"};
  public String [] Philadelphia76ers = {"Ben Simmons", "Seth Curry", "Tyrese Maxey", "Tobias Harris", "Joel Embiid"};
  public String [] CharlotteHornets = {"Lamelo Ball", "Terry Rozier", "Gordon Hayward", "Miles Bridges", "Mason Plumlee"};
  public String [] WashingtonWizards = {"Spencer Dinwiddie", "Bradley Beal", "Kentavious Caldwell Pope", "Kyle Kuzma", "Daniel Gafford"};
  public String [] TorontoRaptors = {"Fred Vanvleet", "Gary Trent Jr", "OG Anunoby", "Scottie Barnes", "Pascal Siakam"};
  public String [] BostonCeltics = {"Marcus Smart", "Jaylen Brown", "Jason Tatum", "Robert Williams", "Enes Kanter"};
  public String [] NewYorkKnicks = {"Kemba Walker", "Evan Fournier", "RJ Barrett", "Julius Randle", "Mitchell Robinson"};
  public String [] AtlantaHawks = {"Trae Young", "Bogdan Bogdanovic", "De'Andre Hunter", "John Collins", "Clint Capela"};
  public String [] IndianaPacers = {"Malcolm Brogdon", "Caris Levert", "Jeremy Lamb", "Domantas Sabonis", "Myles Turner"};
  public String [] DetroitPistons = {"Killian Hayes", "Cade Cunningham", "Hamidou Diallo", "Jerami Grant", "Isaiah Stewart"};
  public String [] OrlandoMagic = {"Cole Anthony", "Jalen Suggs", "Franz Wagner", "Wendell Carter Jr", "Mo Bamba"};
  public String [] PhoenixSuns = {"Chris Paul", "Devin Booker", "Mikal Bridges", "Jae Crowder", "Deandre Ayton"};

 

}
 
