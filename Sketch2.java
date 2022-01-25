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
  public String playerTeam;public String [] ChicagoBulls = {"Lonzo Ball", "Demar Derozan", "Zach Lavine", "Nikola Vucevic", "Patrick Williams"};
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
  public void draw()
  {
    background(92, 150, 242);

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
  }
  }
 