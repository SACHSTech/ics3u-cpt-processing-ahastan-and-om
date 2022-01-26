import processing.core.PApplet;
import processing.core.PFont;
import java.util.ArrayList;

public class Sketch1 extends PApplet {
  PFont text;
  PFont title;
  PFont subtitle;
  public String [] teams = {"Chicago Bulls", "Miami Heat", "Brooklyn Nets", "Cleveland Cavaliers", 
  "Milwaukee Bucks", "Philadelphia 76ers", "Charlotte Hornets", "Washington Wizards", "Toronto Raptors", "Boston Celtics", 
  "New York Knicks", "Atlanta Hawks", "Indiana Pacers", "Detroit Pistons", "Orlando Magic", "Phoenix Suns", "Golden State Warriors", "Memphis Grizzlies", "Utah Jazz", "Dallas Mavericks", 
  "Denver Nuggets", "Los Angeles Lakers", "Los Angeles Clippers", "Minnesota Timberwolves", "Portland Trail Blazers", 
  "Sacramento Kings", "San Antonio Spurs", "New Orleans Pelicans", "Oklahoma City Thunder", "Houston City Rockets"};
  public ArrayList <String> possibleTeams = new ArrayList <String>();
  public String[][] players = new String[30][5];
  public String[][] stats = new String[30][5];
  public int[] rand = new int [12];
  public String playerTeam;
  public int playerTeamCount;
  public boolean screen1Move = false;
  public boolean rosterScreenMove = true;
  public boolean continueMove = false;
  public boolean playMove = false;
  public boolean returnToHome = false;
  public int gameCycle = 0;
  public boolean scheduleRun = false; 

	
  public void settings() {
    size(500, 500);
    String[] fontList = PFont.list();
    printArray(fontList);
    for (int i = 0; i < rand.length; i++)
    {
      rand[i] = (int) random(0,29);
    }
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
      rosterScreen();
    }
      // if (rosterScreenMove == true)
      // {
      //   rosterScreen();
      // }
      // if(continueMove == true)
      // {
      //   continueScreen();
      //   if (playMove == true)
      //   {
      //     playFunction();
      //     if (returnToHome == true)
      //     {
      //       screen2();
      //     }
      //   }
      // }
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

    // //Homepage commands
    // if(rosterScreenMove == false && mouseX >= 50 && mouseX <= 170 && mouseY >= 400 && mouseY <= 450)
    // {
    //   rosterScreenMove = true;
    // }

    if(screen1Move == true && mouseX >= 180 && mouseX <= 300 && mouseY >= 400 && mouseY <= 450)
      {
        screen1Move = false;
      }

    // if(continueMove == false && mouseX >= 300 && mouseX <= 420 && mouseY >= 400 && mouseY <= 450)
    // {
    //   continueMove = true;
    // }

    // if(continueMove == true)
    //   {
    //     //Going Back
    //     if (mouseX >= 180 && mouseX <= 300 && mouseY >= 400 && mouseY <= 450)
    //     {
    //       continueMove = false;
    //     }

    //     //Play 
    //     else if (mouseX >= 330 && mouseX <= 450 && mouseY >= 330 && mouseY <= 380)
    //     {
    //       playMove = true;
    //       if (mouseX >= 180 && mouseX <= 300 && mouseY >= 400 && mouseY <= 450)
    //       {
    //         playMove = false;
    //         continueMove = false;
    //         returnToHome = true;
    //       }
    //     }
    //   }
    
  }

  //Introduction Screen
  public void screen1()
  {
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
  // public void screen2()
  // {
  //   background(92, 150, 242);
  //   textFont(title, 25);
  //   fill(255,204,203);
  //   text("NBA ULTIMATE", 150, 30);

  //   // Game schedule
  //   stroke(208, 224, 29);
  //   fill(208, 224, 29);
  //   rect(50, 50, 400, 100);

  //   stroke(255);
  //   fill(255);
  //   line(50, 100, 450, 100);

  //   for(int gameDisplay = 75; gameDisplay < 450; gameDisplay = gameDisplay + 170)
  //   {
  //     ellipse(gameDisplay, 100, 40, 20);
  //   }

  //   //Standings Preview
  //   stroke(255);
  //   noFill();
  //   rect(50, 200, 150, 170);

  //   //continue and roster buttons
  //   stroke(255);
  //   noFill();
  //   rect(50, 400, 120, 50);
  //   textFont(text, 30);
  //   fill(18, 109, 128);
  //   text("ROSTER", 80, 410, 92, 225);

  //   stroke(255);
  //   noFill();
  //   rect (300, 400, 120, 50);
  //   textFont(text, 30);
  //   fill(18, 109, 128);
  //   text("CONTINUE", 320, 410, 92, 225);

  //   if (scheduleRun == false)
  //   {
  //     for (int i = 0; i <= 11; i++)
  //     {
  //       if (!playerTeam.equals(teams[rand[i]]))
  //       {
  //         possibleTeams.add(teams[rand[i]]);
  //       }
  //     }
  //     scheduleRun = true;
  //   }

  //   printArray(possibleTeams);
  //   int i = 0;
  //   for (int positionX = 65; positionX < 450; positionX = positionX + 170)
  //   {
  //     String team = possibleTeams.get(i);
  //     textFont(text, 20);
  //     fill(18, 109, 128);
  //     text(team, positionX, 100, 92, 225);
  //     i++;
  //   }
  // }

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


    for (int p = 0; p <= 5; p++)
    {
      if (playerTeamCount == p)
      {
        textFont(text, 30);
        fill(18, 109, 128);
        text(players[p][0], 50, 25, 300, 225);
        textFont(text, 18);
        fill(18, 109, 128);
        text(stats[p][0], 50, 75, 92, 225);

        textFont(text, 30);
        fill(18, 109, 128);
        text(players[p][1], 200, 25, 300, 225);
        textFont(text, 18);
        fill(18, 109, 128);
        text(stats[p][1], 200, 75, 92, 225);

        textFont(text, 30);
        fill(18, 109, 128);
        text(players[p][2], 370, 25, 300, 225);
        textFont(text, 18);
        fill(18, 109, 128);
        text(stats[p][2], 370, 75, 92, 225);

        textFont(text, 30);
        fill(18, 109, 128);
        text(players[p][3], 50, 250, 300, 225);
        textFont(text, 18);
        fill(18, 109, 128);
        text(stats[p][3], 50, 300, 92, 225);

        textFont(text, 30);
        fill(18, 109, 128);
        text(players[p][4], 370, 250, 300, 225);
        textFont(text, 18);
        fill(18, 109, 128);
        text(stats[p][4], 370, 300, 92, 225);
      }
    }

    // for (int i = 0; i <= 29; i++)
    // {
    //   if (playerTeamCount == i)
    //   {
        
    //   }
    // }

  }

  //Continue Screen
  // public void continueScreen()
  // {
  //   background(92, 150, 242);
  //   stroke(255);
  //   noFill();
  //   rect (180, 400, 120, 50);
  //   textFont(text, 30);
  //   fill(18, 109, 128);
  //   text("BACK", 230, 410, 92, 225);

  //   textFont(text, 30);
  //   fill(18, 109, 128);
  //   text(playerTeam, 50, 150, 92, 225);

  //   textFont(text, 80);
  //   fill(18, 109, 128);
  //   text("VS", 220, 150, 92, 225);

  //   textFont(text, 30);
  //   fill(18, 109, 128);
  //   text(possibleTeams.get(gameCycle), 320, 150, 92, 225);

  //   stroke(255);
  //   noFill();
  //   rect (330, 330, 120, 50);
  //   textFont(text, 30);
  //   fill(18, 109, 128);
  //   text("PLAY", 370, 340, 92, 225);
  // }

  // When the user presses play, simulation
  // public void playFunction()
  // {
  //   background(92, 150, 242);
  //   possibleTeams.remove(gameCycle);
  //   gameCycle = gameCycle + 1;

  //   rect (180, 400, 120, 50);
  //   textFont(text, 30);
  //   noFill();
  //   text("BACK", 230, 410, 92, 225);
    
  // }
  
  }