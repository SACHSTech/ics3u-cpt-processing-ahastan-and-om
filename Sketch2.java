import processing.core.PApplet;
import processing.core.PFont;

public class Sketch2 extends PApplet {
  PFont text;
  PFont title;
  PFont subtitle;
  public String [] teams = {"Chicago Bulls", "Miami Heat", "Brooklyn Nets", "Cleveland Cavaliers", 
    "Milwaukee Bucks", "Philadelphia 76ers", "Charlotte Hornets", "Washington Wizards", "Toronto Raptors", "Boston Celtics", 
    "New York Knicks", "Atlanta Hawks", "Indiana Pacers", "Detroit Pistons", "Orlando Magic", "Phoenix Suns", "Golden State Warriors", "Memphis Grizzlies", "Utah Jazz", "Dallas Mavericks", 
    "Denver Nuggets", "Los Angeles Lakers", "Los Angeles Clippers", "Minnesota Timberwolves", "Portland Trail Blazers", 
    "Sacramento Kings", "San Antonio Spurs", "New Orleans Pelicans", "Oklahoma City Thunder", "Houston City Rockets"};
  public String[][] players = new String[29][4];
  public String playerTeam;
  public boolean screen1Move = false;
  public boolean rosterScreenMove = false;
  public boolean continueMove = false;

	
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

  public void rosterScreen()
  {
    background(92, 150, 242);
    stroke(255);
    noFill();
    rect (180, 400, 120, 50);
    textFont(text, 30);
    fill(18, 109, 128);
    text("BACK", 200, 410, 92, 225);
  }

  public void continueScreen()
  {
    background(92, 150, 242);
    background(92, 150, 242);
    stroke(255);
    noFill();
    rect (180, 400, 120, 50);
    textFont(text, 30);
    fill(18, 109, 128);
    text("BACK", 200, 410, 92, 225);
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
  public String [] GoldenStateWarriors = {"Steph Curry", "Klay Thompson", "Andrew Wiggins", "Draymond Green", "James Wiseman"};
  public String [] MemphisGrizzlies = {"Ja Morant", "Desmond Bane", "Kyle Anderson", "Jaren Jackson Jr", "Steven Adams"};
  public String [] UtahJazz = {"Mike Conley", "Donovan Mitchell", "Bojan Bogdanovic", "Eric Paschall", "Rudy Gobert"};
  public String [] DallasMavericks = {"Luka Doncic", "Jalen Brunson", "Dorian Finney Smith", "Kristaps Porzingis", "Maxi Kleber"};
  public String [] DenverNuggets = {"Jamal Murray", "Will Barton", "Michael Porter Jr", "Aaron Gordon", "Nikola Jokic"};
  public String [] LosAngelesLakers = {"Russell Westbrook", "Malik Monk", "Lebron James", "Stanley Johnson", "Anthony Davis"};
  public String [] LosAngelesClippers = {"Reggie Jackson", "Paul George", "Kawhi Leonard", "Serge Ibaka", "Ivica Zubac"};
  public String [] MinnesotaTimberwolves = {"D'Angelo Russell", "Malik Beasley", "Anthony Edwards", "Jarred Vanderbilt", "Karl - Anthony Towns"};
  public String [] PortlandTrailBlazers = {"Damian Lillard", "CJ Mccollum", "Norman Powell" ,"Larry Nance Jr" , "Jusuf Nurkic"};
  public String [] SacramentoKings = {"De'Aaron Fox", "Buddy Hield", "Tyrese Haliburton", "Harrison Barnes", "Marvin Bagley Jr"};
  public String [] SanAntonioSpurs = {"Dejounte Murray", "Derrick White", "Doug McDermott", "Keldon Johnson", "Jakob Poeltl"};
  public String [] NewOrleansPelicans = {"Devonte Graham", "Brandon Ingram", "Josh Hart", "Zion Williamson", "Jonas Valancunias"};
  public String [] OklahomaCityThunder = {"Shai Gilgeous Alexander", "Josh Giddey", "Lugentz Dort", "Darius Bazley", "Derrick Favors"};
  public String [] HoustonCityRockets = {"Kevin Porter Jr", "Jalen Green", "Eric Gordon", "Ja'Sean Tate", "Christian Wood"};
 
{
  // Suns
  players[15][0] = "Chris Paul";
  players[15][1] = "Devin Booker";
  players[15][2] = "Mikal Bridges";
  players[15][3] = "Jae Crowder";
  players[15][4] = "Deandre Ayton";
  // Warriors
  players[16][0] = "Steph Curry";
  players[16][1] = "Klay Thompson";
  players[16][2] = "Andrew Wiggins";
  players[16][3] = "Draymond Green";
  players[16][4] = "James Wiseman";
  // Grizzlies
  players[17][0] = "Ja Morant";
  players[17][1] = "Desmond Bane";
  players[17][2] = "Kyle Anderson";
  players[17][3] = "Jaren Jackson Jr";
  players[17][4] = "Steven Adams";
  // Jazz
  players[17][0] = "Mike Conley"; 
  players[17][1] = "Donovan Mitchell";
  players[17][2] = "Bojan Bogdanovic";
  players[17][3] = "Eric Paschall";
  players[17][4] = "Rudy Gobert";
  // Mavs
  players[17][0] = "Luka Doncic";
  players[17][1] = "Jalen Brunson";
  players[17][2] = "Dorian Finney Smith"; 
  players[17][3] = "Kristaps Porzingis";
  players[17][4] = "Maxi Kleber";
  // Nuggets
  players[17][0] = "Jamal Murray";
  players[17][1] = "Will Barton";
  players[17][2] = "Michael Porter Jr"; 
  players[17][3] = "Aaron Gordon";
  players[17][4] = "Nikola Jokic";
  // Lakers
  players[17][0] = "Russell Westbrook";
  players[17][1] = "Malik Monk";
  players[17][2] = "Lebron James"; 
  players[17][3] = "Stanley Johnson";
  players[17][4] = "Anthony Davis";
  // Clippers
  players[17][0] = "Reggie Jackson";
  players[17][1] = "Paul George";
  players[17][2] = "Kawhi Leonard"; 
  players[17][3] = "Serge Ibaka";
  players[17][4] = "Ivica Zubac";
  // Timberwolves
  players[17][0] = "D'Angelo Russell";
  players[17][1] = "Malik Beasley";
  players[17][2] = "Anthony Edwards"; 
  players[17][3] = "Jarred Vanderbilt";
  players[17][4] = "Karl - Anthony Towns";
  // Blazers
  players[17][0] = "Damian Lillard";
  players[17][1] = "CJ Mccollum";
  players[17][2] = "Norman Powell"; 
  players[17][3] = "Larry Nance Jr";
  players[17][4] = "Jusuf Nurkic";
  // Kings
  players[17][0] = "De'Aaron Fox";
  players[17][1] = "Buddy Hield";
  players[17][2] = "Tyrese Haliburton"; 
  players[17][3] = "Harrison Barnes";
  players[17][4] = "Marvin Bagley Jr";
  // Spurs
  players[17][0] = "Dejounte Murray";
  players[17][1] = "Derrick White";
  players[17][2] = "Keldon Johnson"; 
  players[17][3] = "Keldon Johnson";    
  players[17][4] = "Jakob Poeltl";
  // Pelicans
  players[17][0] = "Devonte Graham";
  players[17][1] = "Brandon Ingram";
  players[17][2] = "Michael Porter Jr"; 
  players[17][3] = "Josh Hart";
  players[17][4] = "Jonas Valancunias"; 
  // Thunder
  players[17][0] = "Shai Gilgeous Alexander";
  players[17][1] = "Josh Giddey";
  players[17][2] = "Lugentz Dort"; 
  players[17][3] = "Darius Bazley";
  players[17][4] = "Derrick Favors";
  // Rockets
  players[17][0] = "Kevin Porter Jr";
  players[17][1] = "Jalen Green";
  players[17][2] = "Eric Gordon"; 
  players[17][3] = "Ja'Sean Tate";
  players[17][4] = "Christian Wood";
}
}
 