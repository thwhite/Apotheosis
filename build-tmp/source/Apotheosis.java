import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Apotheosis extends PApplet {

boolean mainMenu, gameState;
Player eva;




public void setup() {
  size(600, 600);

  eva = new Player();

  mainMenu = false;
  gameState = true;

}
public void draw() {
  background(0);
  eva.show();

	//IF MENU
	//IF GAME
  if (gameState) {

  }
		//IF PAUSE
  
	//IF SCENES


}
abstract class Floater //Do NOT modify the Floater class! Make changes in the SpaceShip class 
{   
  protected int corners;  //the number of corners, a triangular floater has 3   
  protected int[] xCorners;   
  protected int[] yCorners;   
  protected int myColor;   
  protected double myCenterX, myCenterY; //holds center coordinates   
  protected double myPointDirection; //holds current direction the ship is pointing in degrees    
  public void setX(int x) {myCenterX = x;}  
  public int getX() {return (int)myCenterX;}   
  public void setY(int y) {myCenterY = y;}   
  public int getY() {return (int)myCenterY;}   
  public void setPointDirection(int degrees) {myPointDirection = degrees;}   
  public double getPointDirection() {return myPointDirection;} 

  //Accelerates the floater in the direction it is pointing (myPointDirection)   

  public void rotate (int nDegreesOfRotation)   
  {     
    //rotates the floater by a given number of degrees    
    myPointDirection+=nDegreesOfRotation;   
  }   
  public void move (int xAmt, int yAmt)   //move the floater in the current direction of travel
  {      
    myCenterX += xAmt;
    myCenterY += yAmt;     
  }   
  public void show ()  //Draws the floater at the current position  
  {             
    fill(myColor);   
    stroke(myColor);    
    //convert degrees to radians for sin and cos         
    double dRadians = myPointDirection*(Math.PI/180);                 
    int xRotatedTranslated, yRotatedTranslated;    
    beginShape();         
    for(int nI = 0; nI < corners; nI++)    
    {     
      //rotate and translate the coordinates of the floater using current direction 
      xRotatedTranslated = (int)((xCorners[nI]* Math.cos(dRadians)) - (yCorners[nI] * Math.sin(dRadians))+myCenterX);     
      yRotatedTranslated = (int)((xCorners[nI]* Math.sin(dRadians)) + (yCorners[nI] * Math.cos(dRadians))+myCenterY);      
      vertex(xRotatedTranslated,yRotatedTranslated);    
    }   
    endShape(CLOSE); 
  }   
} 
public class Player extends Floater
{
  public Player() {
    corners = 4;
    int[] setX = {-4, -4, 4, 4};
    int[] setY = {-4, 4, 4, -4};

    xCorners = setX;
    yCorners = setY;
    myColor = color(0, 0, 255);

    myCenterX = width/2;
    myCenterY = height/2;
  }
}
//FLOATER: Abstract.

//PLAYER
  //Move: changes x and y coordinates. UNLESS player is in zone around walls, where you cannot go up/down. 

//WALLS:
  //Save x and y bounds. 
  //Walls create a collision zone around themselves. Each zone is labeled, and disables the respective movement of an object.
  //
abstract class Zone {
  int x, y, width, height;
  int loadState;
  //Color is defined by individual class types. 
  public Zone() {
    int x = 0;
    int y = 0;
    int width = 50;
    int height = 50;
    loadState = 0;
  }
  public Zone(int xx, int yy, int wid, int hgt) {
    int x = xx;
    int y = yy;
    int width = wid;
    int height = hgt;
    loadState = 0;
  }
  public void zomeLoad(int mult) {
    loadState += mult;
  }

}








//CLASSES:
/*
ROOMS: Each area, which can connect to others. 
FLOATERS: Basic code for an object, including enemies, player, projectiles etc. 
 - Player (white colored)
 - Enemies
 - NPCs.
 - Turrets.
 - 
ZONE: Uploads, danger zones, firewalls, connectors to... (lets use functions of computer) etc. 
READABLES: 
 - SCENES: For speech between characters. Format TBD.
  	- Can also come up when the player opens up cameras, etc.  
 - INFO: For emails, other readable information. 
USEABLES: Objects which cans be picked up. 
 - ACCESSABLES: Big, flashy in-game objects, parts of computer, surrounded by an access field. 
    - Camera. Purple. 
    - Security Center. Orange. 
    - Opening to extranet. 
  - ITEMS:
    - Upgrade. WHITE.
    - Password. ORANGE.
    - 
TEXTAREAS: 
 - POPUPS: On-screen, in-game text areas. Incl. speech bubbles, useage prompts on computer functions. 
 - HUD elements, esp. known useables links. 
 - MENU: In-game pause menu.
 - MAP: In-game map of real-world (RW) surroundings. Contains all pertinent data. 
 - COMPMAP: In-game map of computers in surroundings. Constant HUD element. 
 - 











*/

// NOTES

/*
Objects move based on translation of screen; allow more without loading zones etc. Eventually could overburden the computer, though, so would need loading zones. 

HUD at side displays current computer and map. 

COLOR - CODING:
WHITE: Player and related. Upgrades. 
RED: Enemy and related. 
ORANGE: Security, can be subverted. 
GREEN: Ally, NPC, hacked. 
BLUE: Wall, non-related. 
PURPLE: Functional. e.g. for a Camera, functional aspect... 
AQUA: The Swarm. 


*/
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Apotheosis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
