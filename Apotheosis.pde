





public void setup() {

}
public void draw() {
	//IF MENU
	//IF GAME
		//IF PAUSE
	//IF SCENES


}
abstract class Floater {
  
}
//FLOATER: Abstract.

//PLAYER
  //Move: changes x and y coordinates. UNLESS player is in zone around walls, where you cannot go up/down. 

//WALLS:
  //Save x and y bounds. 
  //Walls create a collision zone around themselves. Each zone is labeled, and disables the respective movement of an object.
  //









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