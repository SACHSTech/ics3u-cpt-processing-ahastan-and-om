import processing.core.PApplet;
import processing.core.PFont;

public class Sketch2 extends PApplet {
  PFont text;
  PFont title;
  PFont subtitle;
  PFont adviceText;
  public String [] teams = {"Chicago Bulls", "Miami Heat", "Brooklyn Nets", "Cleveland Cavaliers", 
  "Milwaukee Bucks", "Philadelphia 76ers", "Charlotte Hornets", "Washington Wizards", "Toronto Raptors", "Boston Celtics", 
  "New York Knicks", "Atlanta Hawks", "Indiana Pacers", "Detroit Pistons", "Orlando Magic", "Phoenix Suns", "Golden State Warriors", "Memphis Grizzlies", "Utah Jazz", "Dallas Mavericks", 
  "Denver Nuggets", "Los Angeles Lakers", "Los Angeles Clippers", "Minnesota Timberwolves", "Portland Trail Blazers", 
  "Sacramento Kings", "San Antonio Spurs", "New Orleans Pelicans", "Oklahoma City Thunder", "Houston City Rockets"};
  public String[][] players = new String[30][5];
  public String[][] stats = new String[30][5];
  public String[][] advice = new String[30][1];
  public String playerTeam;
  public int playerTeamCount;
  public boolean screen1Move = false;
  public boolean playerMove1 = false;
  public boolean playerMove2 = false;
  public boolean playerMove3 = false;
  public boolean playerMove4 = false;
  public boolean playerMove5 = false;

	
  public void settings() {
    // size
    size(500, 500);
    // String[] fontList = PFont.list();
    // printArray(fontList);
  }


  public void setup() {
    // text and background setup
    background(92, 150, 242);
    subtitle = createFont("DialogInput.italic", 16, true);
    title = createFont("DialogInput.bolditalic", 75);
    text = createFont("Playbill", 75);
    adviceText = createFont("Modern No. 20", 14);
  }

  /**
   * Draw function which contains intro and home screen, 
   * as well as the screens for when the user clicks the individual players or teams
   */
  public void draw() {

    // Introduction Screen
    screen1();
    // Home Screen
    if (screen1Move == true)
    {
      rosterScreen();
      if (playerMove1 == true)
      {
        background(92, 150, 242);
        for (int i = 0; i <= 29; i++)
        {
          if (playerTeamCount == i)
          {
            textFont(text, 25);
            fill(18, 109, 128);
            text(stats[i][0], 200, 150, 100, 250);
            text("BACK", 350, 435);
            stroke(255);
            noFill();
            rect(310, 400, 120, 50);
          }
        }
      }
      if (playerMove2 == true)
      {
        background(92, 150, 242);
        for (int i = 0; i <= 29; i++)
        {
          if (playerTeamCount == i)
          {
            textFont(text, 25);
            fill(18, 109, 128);
            text(stats[i][2], 200, 150, 100, 250);
            text("BACK", 350, 435);
            stroke(255);
            noFill();
            rect(310, 400, 120, 50);
          }
        }
      }
      if (playerMove3 == true)
      {
        background(92, 150, 242);
        for (int i = 0; i <= 29; i++)
        {
          if (playerTeamCount == i)
          {
            textFont(text, 25);
            fill(18, 109, 128);
            text(stats[i][2], 200, 150, 100, 250);
            text("BACK", 350, 435);
            stroke(255);
            noFill();
            rect(310, 400, 120, 50);
          }
        }
      }
      if (playerMove4 == true)
      {
        background(92, 150, 242);
        for (int i = 0; i <= 29; i++)
        {
          if (playerTeamCount == i)
          {
            textFont(text, 25);
            fill(18, 109, 128);
            text(stats[i][3], 200, 150, 100, 250);
            text("BACK", 350, 435);
            stroke(255);
            noFill();
            rect(310, 400, 120, 50);
          }
        }
      }
      if (playerMove5 == true)
      {
        background(92, 150, 242);
        for (int i = 0; i <= 29; i++)
        {
          if (playerTeamCount == i)
          {
            textFont(text, 25);
            fill(18, 109, 128);
            text(stats[i][4], 200, 150, 100, 250);
            text("BACK", 350, 435);
            stroke(255);
            noFill();
            rect(310, 400, 120, 50);
          }
        }
      }
      System.out.println(screen1Move);
      System.out.println(playerMove1);
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
    
    if(screen1Move == true)
    {
      if(mouseX >= 360 && mouseX <= 460 && mouseY >= 430 && mouseY <= 470)
      {
        screen1Move = false;
      }
      if(playerMove1 == false && mouseX >= 20 && mouseX <= 170 && mouseY >= 15 && mouseY <= 65)
      {
        playerMove1 = true;
      }
      if(playerMove1 == true && mouseX >= 310 && mouseX <= 420 && mouseY >= 400 && mouseY <= 450)
      {
        playerMove1 = false;
      }
      if(playerMove2 == false && mouseX >= 190 && mouseX <= 290 && mouseY >= 100 && mouseY <= 150)
      {
        playerMove2 = true;
      }
      if(playerMove2 == true && mouseX >= 310 && mouseX <= 420 && mouseY >= 400 && mouseY <= 450)
      {
        playerMove2 = false;
      }
      if(playerMove3 == false && mouseX >= 330 && mouseX <= 480 && mouseY >= 15 && mouseY <= 65)
      {
        playerMove3 = true;
      }
      if(playerMove3 == true && mouseX >= 310 && mouseX <= 420 && mouseY >= 400 && mouseY <= 450)
      {
        playerMove3 = false;
      }
      if(playerMove4 == false && mouseX >= 20 && mouseX <= 170 && mouseY >= 160 && mouseY <= 210)
      {
        playerMove4 = true;
      }
      if(playerMove4 == true && mouseX >= 310 && mouseX <= 420 && mouseY >= 400 && mouseY <= 450)
      {
        playerMove4 = false;
      }
      if(playerMove5 == false && mouseX >= 330 && mouseX <= 480 && mouseY >= 160 && mouseY <= 210)
      {
        playerMove5 = true;
      }
      if(playerMove5 == true && mouseX >= 310 && mouseX <= 420 && mouseY >= 400 && mouseY <= 450)
      {
        playerMove5 = false;
      }
    }

    if(screen1Move == true && mouseX >= 180 && mouseX <= 300 && mouseY >= 400 && mouseY <= 450)
      {
        screen1Move = false;
      }
  }

  //Introduction Screen
  public void screen1()
  {
    strokeWeight(2);
    background(92, 150, 242);
    textFont(subtitle, 20);
    fill(0);
    text("Welcome to", 200, 30);
    textFont(title, 27);
    fill(0);
    text("NBA ULTIMATE TEAM SIMULATOR", 40, 60);
    textFont(text, 35);
    fill(18, 109, 128);
    text("CHOOSE A TEAM", 170, 150);
    
    // Team grid
    int count = 0;
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

  //Roster Screen
  public void rosterScreen()
  {
    background(92, 150, 242);
    stroke(255);
    noFill();
    rect (360, 430, 100, 40);
    textFont(text, 30);
    fill(18, 109, 128);
    text("BACK", 375, 435, 92, 225);

    // Player Teams
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
    players[6][0] = "LaMelo Ball";
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
    players[18][0] = "Mike Conley"; 
    players[18][1] = "Donovan Mitchell";
    players[18][2] = "Bojan Bogdanovic";
    players[18][3] = "Eric Paschall";
    players[18][4] = "Rudy Gobert";
    
    // Mavs
    players[19][0] = "Luka Doncic";
    players[19][1] = "Jalen Brunson";
    players[19][2] = "Dorian Finney Smith"; 
    players[19][3] = "Kristaps Porzingis";
    players[19][4] = "Maxi Kleber";
    
    // Nuggets
    players[20][0] = "Jamal Murray";
    players[20][1] = "Will Barton";
    players[20][2] = "Michael Porter Jr"; 
    players[20][3] = "Aaron Gordon";
    players[20][4] = "Nikola Jokic";
    
    // Lakers
    players[21][0] = "Russell Westbrook";
    players[21][1] = "Malik Monk";
    players[21][2] = "Lebron James"; 
    players[21][3] = "Stanley Johnson";
    players[21][4] = "Anthony Davis";
    
    // Clippers
    players[22][0] = "Reggie Jackson";
    players[22][1] = "Paul George";
    players[22][2] = "Kawhi Leonard"; 
    players[22][3] = "Serge Ibaka";
    players[22][4] = "Ivica Zubac";
    
    // Timberwolves
    players[23][0] = "D'Angelo Russell";
    players[23][1] = "Malik Beasley";
    players[23][2] = "Anthony Edwards"; 
    players[23][3] = "Jarred Vanderbilt";
    players[23][4] = "Karl - Anthony Towns";
    
    // Blazers
    players[24][0] = "Damian Lillard";
    players[24][1] = "CJ Mccollum";
    players[24][2] = "Norman Powell"; 
    players[24][3] = "Larry Nance Jr";
    players[24][4] = "Jusuf Nurkic";
    
    // Kings
    players[25][0] = "De'Aaron Fox";
    players[25][1] = "Buddy Hield";
    players[25][2] = "Tyrese Haliburton"; 
    players[25][3] = "Harrison Barnes";
    players[25][4] = "Marvin Bagley Jr";
    
    // Spurs
    players[26][0] = "Dejounte Murray";
    players[26][1] = "Derrick White";
    players[26][2] = "Keldon Johnson"; 
    players[26][3] = "Keldon Johnson";    
    players[26][4] = "Jakob Poeltl";
    
    // Pelicans
    players[27][0] = "Devonte Graham";
    players[27][1] = "Brandon Ingram";
    players[27][2] = "Michael Porter Jr"; 
    players[27][3] = "Josh Hart";
    players[27][4] = "Jonas Valancunias"; 
    
    // Thunder
    players[28][0] = "Shai Gilgeous Alexander";
    players[28][1] = "Josh Giddey";
    players[28][2] = "Lugentz Dort"; 
    players[28][3] = "Darius Bazley";
    players[28][4] = "Derrick Favors";
    
    // Rockets
    players[29][0] = "Kevin Porter Jr";
    players[29][1] = "Jalen Green";
    players[29][2] = "Eric Gordon"; 
    players[29][3] = "Ja'Sean Tate";
    players[29][4] = "Christian Wood";

    // Stats
    //bulls
    stats[0][0] = "PPG: 13.0, RPG: 5.4, AST: 5.1, FG%: 42.3%, FT%: 75.0%, FG3%: 42.3%" ;
    stats[0][1] = "PPG: 26.3, RPG: 5.0, AST: 4.8, FG%: 49.5%, FT%: 85.5%, FG3%: 33.3%";
    stats[0][2] = "PPG: 24.9, RPG: 4.8, AST: 4.2, FG%: 48.7%, FT%: 86.8%, FG3%: 40.8% ";
    stats[0][3] = "PPG: 16.5, RPG: 11.3, AST: 3.5, FG%: 43.4%, FT%: 74.1%, FG3%: 33.2%";
    stats[0][4] = "PPG: 6,6, RPG: 2.2, AST: 0.6, FG%: 56.5%, FT%: 100.0%, FG3%: 50.0%" ;

    //heat
    stats[1][0] = "PPG: 13.4, RPG: 4.5, AST: 8.3, FG%: 41.2%, FT%: 84.7%, FG3%: 32.7%";
    stats[1][1] = "PPG: 11.8, RPG: 3.2, AST: 1.5, FG%: 39.3%, FT%: 80.0%, FG3%: 35.8% ";
    stats[1][2] = "PPG: 21.4, RPG: 6.0, AST: 6.1, FG%: 47.7%, FT%: 88.1%, FG3%: 24.1%";
    stats[1][3] = "PPG: 8.1, RPG: 5.6, AST: 2.2, FG%: 49.2%, FT%: 69.2%, FG3%: 45.9%";
    stats[1][4] = "PPG: 18.5, RPG: 9.9, AST: 3.3, FG%: 52.1%, FT%: 77.0%, FG3%: 0.0%";

    //nets
    stats[2][0] = "PPG: 23.4, RPG: 4.9, AST: 5.1, FG%: 50.4%, FT%: 100.0%, FG3%: 36.6%";
    stats[2][1] = "PPG: 22.7, RPG: 8.0, AST: 10.1, FG%: 41.9%, FT%: 41.9%, FG3%: 33.8% ";
    stats[2][2] = "PPG: 29.3, RPG: 7.4, AST: 5.8, FG%: 52.0%, FT%: 89.4%, FG3%: 37.2%";
    stats[2][3] = "PPG: 6.0, RPG: 4.4, AST: 2.1, FG%: 37.9%, FT%: 72.7%, FG3%: 20.8%";
    stats[2][4] = "PPG: 9.2, RPG: 5.5, AST: 1.0, FG%: 65.6%, FT%: 61.5%, FG3%: N/A";
    
    //cavs
    stats[3][0] = "PPG: 19.7, RPG: 3.3, AST: 8.2, FG%: 46.4%, FT%: 91.3%, FG3%: 36.0%";
    stats[3][1] = "PPG: 16.0, RPG: 3.3, AST: 2.1, FG%: 45.0%, FT%: 74.4%, FG3%: 24.4% ";
    stats[3][2] = "PPG: 9.2, RPG: 3.4, AST: 1.8, FG%: 45.4%, FT%: 73.4%, FG3%: 28.3%";
    stats[3][3] = "PPG: 15.0, RPG: 8.2, AST: 2.7, FG%: 51.0%, FT%: 67.4%, FG3%: 30.4%";
    stats[3][4] = "PPG: 16.3, RPG: 11.0, AST: 1.9, FG%: 69.5%, FT%: 68.4%, FG3%: 12.5%";

    //bucks
    stats[4][0] = "PPG: 18.2, RPG: 4.6, AST: 6.4, FG%: 49.3%, FT%: 74.2%, FG3%: 38.6%";
    stats[4][1] = "PPG: 11.8, RPG: 3.4, AST: 1.3, FG%: 42.3%, FT%: 85.7%, FG3%: 39.1% ";
    stats[4][2] = "PPG: 20.1, RPG: 5.7, AST: 5.3, FG%: 44.2%, FT%: 88.6%, FG3%: 39.1%";
    stats[4][3] = "PPG: 28.6, RPG: 11.3, AST: 6.0, FG%: 53.1%, FT%: 71.4%, FG3%: 28.2%";
    stats[4][4] = "PPG: 15.0, RPG: 9.5, AST: 1.3, FG%: 47.3%, FT%: 76.9%, FG3%: 41.4%";

    //76ers
    stats[5][0] = "PPG: 15.9, RPG: 8.1, AST: 7.7, FG%: 56.0%, FT%: 59.7%, FG3%: 14.7%";
    stats[5][1] = "PPG: 15.8, RPG: 3.4, AST: 4.0, FG%: 50.9%, FT%: 87.7%, FG3%: 41.7% ";
    stats[5][2] = "PPG: 16.6, RPG: 3.4, AST: 4.5, FG%: 46.5%, FT%: 87.9%, FG3%: 41.0%";
    stats[5][3] = "PPG: 18.6, RPG: 7.5, AST: 3.8, FG%: 46.9%, FT%: 85.5%, FG3%: 32.8%";
    stats[5][4] = "PPG: 29.0, RPG: 10.8, AST: 4.3, FG%: 49.9%, FT%: 81.9%, FG3%: 38.0%";

    //hornets
    stats[6][0] = "PPG: 19.1, RPG: 7.2, AST: 7.6, FG%: 41.8%, FT%: 89.0%, FG3%: 35.8%";
    stats[6][1] = "PPG: 18.3, RPG: 4.1, AST: 4.1, FG%: 43.2%, FT%: 80.0%, FG3%: 37.0% ";
    stats[6][2] = "PPG: 17.0, RPG: 4.7, AST: 3.7, FG%: 47.1%, FT%: 84.6%, FG3%: 39.7%";
    stats[6][3] = "PPG: 20.1, RPG: 7.3, AST: 3.5, FG%: 48.6%, FT%: 78.0%, FG3%: 32.2%";
    stats[6][4] = "PPG: 6.7, RPG: 7.2, AST: 2.7, FG%: 63.2%, FT%: 34.1%, FG3%: 0.0%";

    //wizards
    stats[7][0] = "PPG: 13.3, RPG: 4.6, AST: 5.7, FG%: 38.8%, FT%: 81.4%, FG3%: 31.4%";
    stats[7][1] = "PPG: 23.6, RPG: 4.8, AST: 6.5, FG%: 45.5%, FT%: 83.7%, FG3%: 30.1% ";
    stats[7][2] = "PPG: 11.4, RPG: 3.6, AST: 1.8, FG%: 41.2%, FT%: 87.7%, FG3%: 37.2%";
    stats[7][3] = "PPG: 15.7, RPG: 8.9, AST: 2.9, FG%: 45.1%, FT%: 68.8%, FG3%: 32.5%";
    stats[7][4] = "PPG: 9.2, RPG: 6.1, AST: 1.0, FG%: 68.9%, FT%: 75.0%, FG3%: N/A";

    //raptors
    stats[8][0] = "PPG: 21.7, RPG: 4.7, AST: 7.0, FG%: 42.1%, FT%: 87.0%, FG3%: 39.3%";
    stats[8][1] = "PPG: 16.6, RPG: 2.7, AST: 2.0, FG%: 41.9%, FT%: 83.8%, FG3%: 37.4% ";
    stats[8][2] = "PPG: 18.8, RPG: 5.4, AST: 2.4, FG%: 43.3%, FT%: 77.3%, FG3%: 34.2%";
    stats[8][3] = "PPG: 14.6, RPG: 7.8, AST: 3.4, FG%: 46.9%, FT%: 72.0%, FG3%: 30.6%";
    stats[8][4] = "PPG: 21.3, RPG: 8.3, AST: 5.1, FG%: 48.3%, FT%: 72.8%, FG3%: 33.3%";

    //celtics
    stats[9][0] = "PPG: 11.3, RPG: 4.0, AST: 5.4, FG%: 39.2%, FT%: 79.2%, FG3%: 30.3%";
    stats[9][1] = "PPG: 24.0, RPG: 6.6, AST: 3.0, FG%: 45.4%, FT%: 78.7%, FG3%: 36.4% ";
    stats[9][2] = "PPG: 26.0, RPG: 8.5, AST: 3.9, FG%: 42.7%, FT%: 84.2%, FG3%: 33.1%";
    stats[9][3] = "PPG: 9.9, RPG: 9.4, AST: 1.9, FG%: 73.8%, FT%: 69.4%, FG3%: N/A";
    stats[9][4] = "PPG: 3.7, RPG: 4.6, AST: 0.2, FG%: 53.3%, FT%: 84.6%, FG3%: 25.0%";

    //knicks
    stats[10][0] = "PPG: 13.3, RPG: 3.3, AST: 3.5, FG%: 41.5%, FT%: 81.4%, FG3%: 39.2%";
    stats[10][1] = "PPG: 13.5, RPG: 2.8, AST: 1.8, FG%: 41.8%, FT%: 73.4%, FG3%: 38.9% ";
    stats[10][2] = "PPG: 17.4, RPG: 5.9, AST: 2.6, FG%: 41.9%, FT%: 68.7%, FG3%: 35.4%";
    stats[10][3] = "PPG: 18.9, RPG: 9.9, AST: 5.1, FG%: 41.2%, FT%: 75.7%, FG3%: 31.1%";
    stats[10][4] = "PPG: 8.4, RPG: 8.3, AST: 0.4, FG%: 77.9%, FT%: 54.8%, FG3%: N/A";

    //hawks
    stats[11][0] = "PPG: 28.0, RPG: 4.0, AST: 9.3, FG%: 45.5%, FT%: 90.0%, FG3%: 38.0%";
    stats[11][1] = "PPG: 12.0, RPG: 3.8, AST: 2.6, FG%: 41.2%, FT%: 77.1%, FG3%: 35.4% ";
    stats[11][2] = "PPG: 13.2, RPG: 3.3, AST: 1.0, FG%: 45.9%, FT%: 39.2%, FG3%: 39.2%";
    stats[11][3] = "PPG: 17.0, RPG: 7.9, AST: 2.0, FG%: 53.7%, FT%: 79.7%, FG3%: 42.6%";
    stats[11][4] = "PPG: 11.5, RPG: 12.8, AST: 1.4, FG%: 57.0%, FT%: 46.5%, FG3%: 0.0%";

    //pacers
    stats[12][0] = "PPG: 18.5, RPG: 5.1, AST: 5.9, FG%: 44.8%, FT%: 86.1%, FG3%: 30.7%";
    stats[12][1] = "PPG: 18.5, RPG: 3.7, AST: 4.2, FG%: 44.5%, FT%: 78.6%, FG3%: 33.1% ";
    stats[12][2] = "PPG: 7.2, RPG: 2.5, AST: 1.3, FG%: 37.1%, FT%: 88.2%, FG3%: 32.0%";
    stats[12][3] = "PPG: 19.0, RPG: 11.9, AST: 4.9, FG%: 57.7%, FT%: 74.4%, FG3%: 32.7%";
    stats[12][4] = "PPG: 12.9, RPG: 7.1, AST: 1.0, FG%: 50.9%, FT%: 75.2%, FG3%: 33.3%";

    //pistons
    stats[13][0] = "PPG: 6.2, RPG: 3.0, AST: 3.8, FG%: 34.5%, FT%: 85.7%, FG3%: 29.9%";
    stats[13][1] = "PPG: 16.2, RPG: 5.4, AST: 5.3, FG%: 40.8%, FT%: 84.8%, FG3%: 33.5% ";
    stats[13][2] = "PPG: 10.8, RPG: 4.6, AST: 1.3, FG%: 50.7%, FT%: 64.0%, FG3%: 24.6%";
    stats[13][3] = "PPG: 20.1, RPG: 4.8, AST: 2.6, FG%: 41.4%, FT%: 84.9%, FG3%: 33.1%";
    stats[13][4] = "PPG: 7.8, RPG: 7.8, AST: 1.1, FG%: 52.8%, FT%: 67.2%, FG3%: 13.6%";

    //magic
    stats[14][0] = "PPG: 18.0, RPG: 6.0, AST: 5.8, FG%: 39.4%, FT%: 83.1%, FG3%: 32.9%";
    stats[14][1] = "PPG: 12.9, RPG: 3.9, AST: 4.0, FG%: 36.5%, FT%: 76.2%, FG3%: 24.8% ";
    stats[14][2] = "PPG: 15.4, RPG: 4.8, AST: 2.9, FG%: 45.3%, FT%: 84.7%, FG3%: 33.5%";
    stats[14][3] = "PPG: 13.4, RPG: 10.1, AST: 2.6, FG%: 49.7%, FT%: 69.9%, FG3%: 34.2%";
    stats[14][4] = "PPG: 10.2, RPG: 8.1, AST: 1.5, FG%: 46.0%, FT%: 77.8%, FG3%: 35.5%";

    // Suns
    stats[15][0] = "PPG: 14.4, RPG : 4.4, APG : 10.2, FG : 48.7%, FT : 84.2%, FG3 : 32.9% ";
    stats[15][1] = "PPG: 24.5, RPG : 5.4, APG : 4.4, FG : 43.8%, FT : 86.3%, FG3 : 37.8% ";
    stats[15][2] = "PPG: 12.1, RPG : 4.1, APG : 2, FG : 50.6%, FT : 85.7%, FG3 : 37.5% ";
    stats[15][3] = "PPG: 9.3, RPG : 4.9, APG : 2, FG : 40.8%, FT : 80.4%, FG3 : 36.1% ";
    stats[15][4] = "PPG: 16.8, RPG : 10.6, APG : 1.5, FG : 63.7%, FT : 71.3%, FG3 : 25% ";
    
    // Warriors
    stats[16][0] = "PPG: 26, RPG : 5.3, APG : 6.2, FG : 41.6%, FT : 91.3%, FG3 : 37.6% ";
    stats[16][1] = "PPG: 14.7, RPG : 2.8, APG : 2, FG : 37.2%, FT : 100%, FG3 : 30.2% ";
    stats[16][2] = "PPG: 18.2, RPG : 4.2, APG : 2, FG : 48.2%, FT : 66.9%, FG3 : 40.9% ";
    stats[16][3] = "PPG: 7.9, RPG : 7.6, APG : 7.4, FG : 53.7%, FT : 59.7%, FG3 : 28.6% ";
    stats[16][4] = "PPG: 11.5, RPG : 5.8, APG : 0.7, FG : 51.9%, FT : 62.8%, FG3 : 31.6% ";
    
    // Grizzlies
    stats[17][0] = "PPG: 25.3, RPG : 6, APG : 6.9, FG : 48.7%, FT : 91.3%, FG3 : 35% ";
    stats[17][1] = "PPG: 17.7, RPG : 4.4, APG : 2.4, FG : 47%, FT : 88.6%, FG3 : 42% ";
    stats[17][2] = "PPG: 8.2, RPG : 5.3, APG : 2.6, FG : 43.6%, FT : 66.1%, FG3 : 35.1% ";
    stats[17][3] = "PPG: 16.4, RPG : 5.7, APG : 1, FG : 41%, FT : 81.4%, FG3 : 31.3% ";
    stats[17][4] = "PPG: 6.7, RPG : 9.3, APG : 3, FG : 51.6%, FT : 57.1%, FG3 : -% ";
    
    // Jazz
    stats[18][0] = "PPG: 14, RPG : 3, APG : 5.2, FG : 42.4%, FT : 82.4%, FG3 : 42.4% ";
    stats[18][1] = "PPG: 25.5, RPG : 4, APG : 5.2, FG : 45%, FT : 87.6%, FG3 : 33.9% ";
    stats[18][2] = "PPG: 18.1, RPG : 4.2, APG : 1.7, FG : 46.7%, FT : 85.8%, FG3 : 38.7% ";
    stats[18][3] = "PPG: 5.1, RPG 2: , APG : 0.5, FG : 49.2%, FT : 73.9%, FG3 : 35.6% ";
    stats[18][4] = "PPG: 16, RPG : 15.1, APG : 1.2, FG : 70.7%, FT : 69%, FG3 : 0% ";
    
    // Mavs
    stats[19][0] = "PPG: 25.6, RPG : 8.8, APG : 8.7, FG : 43.7%, FT : 75%, FG3 : 29.1% ";
    stats[19][1] = "PPG: 15.8, RPG : 3.8, APG : 5.5, FG : 50%, FT : 80.2%, FG3 : 32.8% ";
    stats[19][2] = "PPG: 10.3, RPG : 4.9, APG : 2, FG : 41.6%, FT : 65.5%, FG3 : 36.9% ";
    stats[19][3] = "PPG: 19.9, RPG : 8, APG : 2.2, FG : 45.7%, FT : 87%, FG3 : 29% ";
    stats[19][4] = "PPG: 7.2, RPG : 5.7, APG : 1.2, FG : 40.8%, FT : 91.3%, FG3 : 37.6% ";
    
    // Nuggets
    stats[20][0] = "PPG: 12.6, RPG : 2.8, APG : 4.1, FG : 47%, FT : 78.4%, FG3 : 37.3% ";
    stats[20][1] = "PPG: 15.3, RPG : 4.8, APG : 4.2, FG : 43.4%, FT : 78.8%, FG3 : 37% ";
    stats[20][2] = "PPG: 25.6, RPG : 8.8, APG : 8.7, FG : 43.7%, FT : 75%, FG3 : 29.1% ";
    stats[20][3] = "PPG: 25.6, RPG : 8.8, APG : 8.7, FG : 43.7%, FT : 75%, FG3 : 29.1% ";
    stats[20][4] = "PPG: 25.6, RPG : 8.8, APG : 8.7, FG : 43.7%, FT : 75%, FG3 : 29.1% ";
    
    // Lakers
    stats[21][0] = "PPG: 18.6, RPG : 8.1, APG : 7.8, FG : 43.7%, FT : 67.3%, FG3 : 29.6% ";
    stats[21][1] = "PPG: 11.9, RPG : 3, APG : 2.3, FG : 47.7%, FT : 82.4% FG3 : 40.5% ";
    stats[21][2] = "PPG: 29, RPG : 7.7, APG : 8.7, FG : 43.7%, FT : 75%, FG3 : 29.1% ";
    stats[21][3] = "PPG: 25.6, RPG : 8.8, APG : 6.3, FG : 51.8%, FT : 75.6%, FG3 : 35.5% ";
    stats[21][4] = "PPG: 23.3, RPG : 9.9, APG : 2.9, FG : 52.1%, FT : 72.7%, FG3 : 17.9% ";
    
    // Clippers
    stats[22][0] = "PPG: 16.9, RPG : 3.4, APG : 4.2, FG : 39.3%, FT : 84.8%, FG3 : 32.5% ";
    stats[22][1] = "PPG: 7, RPG : 2.9, APG : 1.6, FG : 45.4%, FT : 88%, FG3 : 38.2% ";
    stats[22][2] = "PPG: 15.5, RPG : 5.2, APG : 2.2, FG : 41.7%, FT : 75%, FG3 : 29.1% ";
    stats[22][3] = "PPG: 6.4, RPG : 4.2, APG : 1.1, FG : 46.5%, FT : 63.6%, FG3 : 40.4% ";
    stats[22][4] = "PPG: 9.9, RPG : 8.2, APG : 1.2, FG : 67.4%, FT : 74.4%, FG3 : - ";
    
    // Timberwolves
    stats[23][0] = "PPG: 19.1, RPG : 3.6, APG : 7, FG : 41.1%, FT : 81.7%, FG3 : 35.3% ";
    stats[23][1] = "PPG: 12, RPG : 3.1, APG : 1.6, FG : 37.3%, FT : 72.4%, FG3 : 34.9% ";
    stats[23][2] = "PPG: 22.7, RPG : 5.2, APG : 3.5, FG : 44.6%, FT : 79.3%, FG3 : 37.6% ";
    stats[23][3] = "PPG: 7, RPG : 9.2, APG : 1.5, FG : 59.1%, FT : 64.7%, FG3 : 20% ";
    stats[23][4] = "PPG: 24.1, RPG : 9.4, APG : 3.6, FG : 51.6%, FT : 81.1%, FG3 : 41 ";
    
    // Blazers
    stats[24][0] = "PPG: 24, RPG : 4.1, APG : 7.3, FG : 40.2%, FT : 87.8%, FG3 : 32.4% ";
    stats[24][1] = "PPG: 20.4, RPG : 4.2, APG : 4.4, FG : 43%, FT : 71.2%, FG3 : 40.2% ";
    stats[24][2] = "PPG: 18.3, RPG : 2.9, APG : 2.1, FG : 45.3%, FT : 82.2%, FG3 : 40.1% ";
    stats[24][3] = "PPG: 6.9, RPG : 5.6, APG : 2, FG : 51.5%, FT : 65.3%, FG3 : 30.6% ";
    stats[24][4] = "PPG: 14.4, RPG : 10.9, APG : 2.8, FG : 53.7%, FT : 69.3%, FG3 : 20.5% "; 
    
    // Kings
    stats[25][0] = "PPG: 21, RPG : 3.8, APG : 5.2, FG : 45.8%, FT : 74.4%, FG3 : 24.8% ";
    stats[25][1] = "PPG: 15.1, RPG : 4, APG : 2, FG : 38.9%, FT : 86.7%, FG3 : 38% ";
    stats[25][2] = "PPG: 13.8, RPG : 4, APG : 7.2, FG : 46.6%, FT : 81.3%, FG3 : 42.7% ";
    stats[25][3] = "PPG: 16.3, RPG : 6, APG : 2.4, FG : 44.8%, FT : 83%, FG3 : 40.6% ";
    stats[25][4] = "PPG: 9.4, RPG : 7.2, APG : 0.6, FG : 46.1%, FT : 74.5%, FG3 : 24.1% "; 
    
    // Spurs
    stats[26][0] = "PPG: 19.3, RPG : 8.4, APG : 9, FG : 45.1%, FT : 73.5%, FG3 : 31.9% ";
    stats[26][1] = "PPG: 14.2, RPG : 3.5, APG : 5.6, FG : 41.7%, FT : 85.8%, FG3 : 29.5% ";
    stats[26][2] = "PPG: 11.4, RPG : 2.5, APG : 1.2, FG : 45.8%, FT : 70.4%, FG3 : 41.5% ";
    stats[26][3] = "PPG: 14.9, RPG : 6.2, APG : 1.7, FG : 46.7%, FT : 70.7%, FG3 : 44.2% ";
    stats[26][4] = "PPG: 12.9, RPG : 9.1, APG : 2.7, FG : 60.1%, FT : 43.8%, FG3 : - "; 
    
    // Pelicans
    stats[27][0] = "PPG: 14, RPG : 2.6, APG : 4.5, FG : 37.1%, FT : 83.8%, FG3 : 36.3% ";
    stats[27][1] = "PPG: 13.1, RPG : 3.4, APG : 2.7, FG : 37.3%, FT : 71.4%, FG3 : 31.5% ";
    stats[27][2] = "PPG: 22.4, RPG : 6.1, APG : 5.2, FG : 44.3%, FT : 81.8%, FG3 : 34.5% ";
    stats[27][3] = "PPG: 13.5, RPG : 7.6, APG : 4.2, FG : 51.6%, FT : 75.2%, FG3 : 33.3% ";
    stats[27][4] = "PPG: 18.3, RPG : 12, APG : 2.5, FG : 52.6%, FT : 81.9%, FG3 : 41.7% "; 
    
    // Thunder
    stats[28][0] = "PPG: 23, RPG : 4.8, APG : 5.5, FG : 42.4%, FT : 82.8%, FG3 : 36.2% ";
    stats[28][1] = "PPG: 11.5, RPG : 7.4, APG : 6.2, FG : 40.4%, FT : 66%, FG3 : 26.6% ";
    stats[28][2] = "PPG: 16.1, RPG : 4, APG : 1.6, FG : 39.6%, FT : 85.1%, FG3 : 32.7% ";
    stats[28][3] = "PPG: 6.9, RPG : 5.6, APG : 1.1, FG : 38.8%, FT : 68.7%, FG3 : 26% ";
    stats[28][4] = "PPG: 5.1, RPG : 4.7, APG : 0.8, FG : 49.7%, FT : 55.6%, FG3 : 16.7% "; 
    
    // Rockets
    stats[29][0] = "PPG: 13.2, RPG : 4.2, APG : 6, FG : 38.1%, FT : 64.2%, FG3 : 34.4% ";
    stats[29][1] = "PPG: 14.2, RPG : 3.2, APG : 2.2, FG : 37.4%, FT : 82.9%, FG3 : 29.1% ";
    stats[29][2] = "PPG: 14.6, RPG : 2, APG : 3.2, FG : 50%, FT : 74.5%, FG3 : 44.5% ";
    stats[29][3] = "PPG: 12.6, RPG : 5.7, APG : 3.1, FG : 50.2%, FT : 70.2%, FG3 : 30.3% ";
    stats[29][4] = "PPG: 17.4, RPG : 10.2, APG : 2.1, FG : 48.2%, FT : 61.5%, FG3 : 36.6% ";
    
    // Advice
    //bulls
    advice[0][0] = "Despite the Bull’s long slump, the 2021 free agency has seemed to revive the once great franchise. With Demar DeRozan performing at a top tier level, the Chicago Bulls are expected to make it deep into the playoffs. Betting Advice: Very Good";
    
    //heat
    advice[1][0] = "The addition of Jimmy Butler and Kyle Lowry has helped the Miami Heat to be Championship contenders. A key player to watch out for is Tyler Herro. Betting Advice: Very Good";
    
    //nets
    advice[2][0] = "Although this franchise has had its ups and downs, it is expected to do very good in the coming years. With their “big three” and a strong core built around them, they pose a threat to the league. Betting Advice: Very Good";

    //cavs
    advice[3][0] = "The Cavs are an interesting franchise. With the addition of many young bright stars such as Evan Mobley and Collins Sexton, they are expected to do well - in the future. Although they remain 5th in the East, they are not contenders, just not yet. Betting Advice: Average";

    //bucks
    advice[4][0] = "Coming off a strong 2021 season, not to mention winning the championship, the bucks are destined to do good. However, simply put, they are outshined. The trio of Holiday, Middleton and Antetokounmpo can’t exactly compare to the chemistry of some other teams. Betting Advice: Good";

    //76ers
    advice[5][0] = "We could say that the 76ers motto of “trust the process” has failed miserably. Being the franchise that lost again, then again, then again, it is quite hard to see them flourishing, however Joel Embid and (maybe) Ben Simmons might be able to revive them once again. Betting Advice: Good";

    //hornets
    advice[6][0] = "Being the younger brother of Lonzo Ball, and part of the Ball family, LaMelo single handedly has been able to give a new light to the franchise. That being said, the Hornets are a very young team and don't have much veteran leadership, so it’s hard to say how this season goes. Betting Advice: Average";

    //wizards
    advice[7][0] = "Despite having a great start to the season, the Wizards are still 10th in the East. Although the players have been trying their best, especially Bradely Beal, it is still hard to see the Wizards as big contenders, as they simply do not have the players to compete. Betting Advice: Poor";

    //raptors
    advice[8][0] = "In a current state of what you would call “rebuild” the Raptors are also living in the middle ground. Despite having a roster full of young players with great potential, the Raptors are just in the need of a leader to bring their team together. Key players to look out for are Trent Jr., Anunoby and Barnes. Betting Advice: Average";

    //celtics
    advice[9][0] = "The Celtics have been stuck in the same situation as the 76ers. Although they have had a great team, they just keep losing, again and again, and being 9  in the conference isn’t making things much better. Jason Tatum still continues to impress however. Betting Advice: Average";

    //knicks
    advice[10][0] = "Very rarely, will you meet a devoted Knicks fan, but when the Knicks start winning, the world starts winning. This season does not seem to be the case however. Although they did quite well last year, and even made it to the second round of the playoffs, it just seems something is still wrong with the franchise. Key players to look out for are RJ Barret and Julius Randle. Betting Advice: Poor";

    //hawks
    advice[11][0] = "Although the Hawks are coming off a fantastic playoff run, making them the underdogs in the 2021 playoffs, this chemistry doesn’t seem to be working right now. The Hawks are a young team however, led by young star Trae Young, and it may take some time for this team to develop. Betting Advice: Poor";

    //pacers
    advice[12][0] = "The Pacers have talent, but the talent is not good enough. Being 13th in the East doesn’t help their playoffs odds, nor their betting odds. Betting Advice: Very Poor";

    //pistons
    advice[13][0] = "Even though the Pistons struck gold on the draft with Cade Cunningham, not many expected the Pistons to do very well. They do have many young stars such as Cade Cunningham and Jerami Grant. Betting Advice: Very Poor";

    //magic
    advice[14][0] = "The Magic are currently 9-40, the worst record in the league. It would be safe to say that betting on the Magic would definitely be a risky move, but betting on young star Cole Anthony may not. Betting Advice: Very Poor";

    //suns
    advice[15][0] = "The Suns are currently one of the best teams in the league. Coming off a finals appearance last season, the Suns have continued to capitalize on their good form, currently sitting at the top of the Western Conference with a record of 38 - 9.  Players like Chris Paul, Devin Booker, and Deandre Ayton are the core of the Suns team, so these are the key guys you want to bet on. Team Betting Level - Very Good";

    //warriors
    advice[16][0] = " Despite their shooting slumps in recent games, the Warriors are one of the strongest teams in the league. Stephen Curry has been playing at an MVP level for most of the season. Team Betting Level - Very Good";
    
    //grizzlies
    advice[17][0] = "The Grizzlies have been one of the most surprising teams in the NBA this year, sitting at 3rd in the West, with a record of 33-17. Ja Morant has led the team, taking a huge leap statistically, which has placed him in MVP contention. Team Betting Level - Good";

    //jazz
    advice[18][0] = "The Jazz are another solid team in the west, sitting at 4th with a record of 30-19. Donovan Mitchell and Rudy Gobert are the main players to bet on, both doing very well statistically. For “over/under” with field/goals or points, bet on Donovan Mitchell. For rebounds or double doubles, bet on Rudy Gobert. Team Betting Level - Good";

    //mavericks
    advice[19][0] = "Despite a tough start to the season, the Mavericks have been able to turn it around, with Luka Doncic and Kristaps Porzingis playing at all-star levels. In every other category, he is a betting “gold mine”. Porzingis is solid for points and rebounds. Team Betting Level - Good";

    //nuggests
    advice[20][0] = "The Nuggets have had their fair share of struggles without their primary point guard, Jamal Murray. However, with Nikola Jokic in tremendous form, the Nuggets are 6th in the West, and will likely be a playoff team. Nikola Jokic is a solid player in almost every category when it comes to betting. With both Murray and MPJ sidelined, look out for players like Will Barton and Aaron Gordon who will likely have increased production. Team Betting Level - Average";

    //lakers
    advice[21][0] = "The Lakers have struggled thus far into the season, which has made many question their ability to contend for a championship. Russell Westbrook has struggled, and Anthony Davis has had trouble staying healthy. However, Lebron James continues to shine, even at his age, making him one of the best players to bet on categorically. Despite his shooting woes, Russ is still solid for betting, as his production for assists and rebounds continues to be constant. Team Betting Level - Good";

    //clippers
    advice[22][0] = "Despite their two stars being sidelined indefinitely, the Clippers have surprisingly been at a .500 record, occupying the 8th spot in the west. Look for players like Reggie Jackson and Marcus Morris to continue thriving with Kawhi and PG out. Team Betting Level - Average";

    //timerwolves
    advice[23][0] = "The Timberwolves have been a bit better this season, sitting at 7th in the West, with a 24-23 record. D’Angelo Russell, Anthony Edwards, and Karl Anthony Towns are the players to bet on, as they contribute towards most of the team’s scoring. Team Betting Level - Between Average and Good";

    //blazers
    advice[24][0] = "The Blazers have struggled this year. With Dame out indefinitely, and CJ Mccolum just returning from a major injury, many question if the team will be able to make the playoffs. Norman Powell and Jusuf Nurkic are the players to bet on for now. Team Betting Level - Poor to Average";

    //kings
    advice[25][0] = "Despite the talent on the roster, the Kings are unlikely to be a playoff team. Still, their players to bet on are Fox, Tyrese Haliburton, and Buddy Hield. If Fox is traded to a playoff team, his production will likely take a small hit, but he should still be a solid overall player. Team Betting Level - Poor";

    //spurs
    advice[26][0] = "After the departure of Demar Derozan, the Spurs struggle was inevitable, as they are unlikely to qualify for the playoffs. Dejounte Murray is still a solid player to bet on, and continue to watch out for Derrick White and Jakob Poeltl. Team Betting Level - Poor";

    //pelicans
    advice[27][0] = "With Zion Williamson out without a proper timetable, the Pelicans are unlikely to make the playoffs. However, they still have talented players like Brandon Ingram and Jonas Valancunias, as well as Josh Hart who has stepped up in Zion’s absence. Team Betting Level - Poor";
    
    //thunder
    advice[28][0] = "The Thunder are currently in a rebuilding phase, as they traded almost all of their assets for future draft picks. Shai Gilgeous Alexander and Josh Giddey are the best players to bet on. Team Betting Level - Very Poor";

    //rockets
    advice[29][0] = "The Rockets are in the same boat as the Thunder, in a rebuilding phase. They have solid talent in Christian Wood, Kevin Porter Jr, and Jalen Green. However, KPJ’s start to the season has been slightly underwhelming, as has Jalen Green. Continue to monitor their progress, and bet on Wood for point and rebound totals. Team Betting Level - Very Poor";
    
    for (int p = 0; p <= 29; p++)
    {
      if (playerTeamCount == p)
      {
        textFont(adviceText, 16);
        fill(74, 52, 50);
        text(advice[p][0], 25, 250, 450, 400);
        
        stroke(225);
        noFill();
        rect(20, 15, 150, 50);
        textFont(text, 22);
        fill(18, 109, 128);
        text(players[p][0], 50, 25, 300, 225);

        stroke(225);
        noFill();
        rect(330, 15, 150, 50);
        textFont(text, 22);
        fill(18, 109, 128);
        text(players[p][1], 340, 25, 300, 225);

        stroke(225);
        noFill();
        rect(190, 100, 100, 50);
        textFont(text, 22);
        fill(18, 109, 128);
        text(players[p][2], 200, 110, 300, 225);
        
        stroke(225);
        noFill();
        rect(20, 160, 150, 50);
        textFont(text, 22);
        fill(18, 109, 128);
        text(players[p][3], 50, 175, 300, 225);
        
        stroke(225);
        noFill();
        rect(330, 160, 150, 50);
        textFont(text, 22);
        fill(18, 109, 128);
        text(players[p][4], 340, 175, 300, 225);
      }
    }
  }
}