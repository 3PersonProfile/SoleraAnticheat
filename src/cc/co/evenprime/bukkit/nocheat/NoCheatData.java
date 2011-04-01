package cc.co.evenprime.bukkit.nocheat;

import org.bukkit.Location;
import org.bukkit.World;

/**
 * Storage for data persistence between events
 * 
 * @author Evenprime
 *
 */
public class NoCheatData {

	/**
	 * Don't rely on any of these yet, they are likely going to change their name/functionality 
	 */

	public int movingJumpPhase = 0; // current jumpingPhase
	public int movingViolationsInARow[] =  { 0, 0, 0 }; 
	public World movingLastWorld = null;
	public double movingHorizFreedom = 0.0D;
	public double movingVertFreedom = 0.0D;
	public int movingVertFreedomCounter = 0;
	public Location movingSetBackPoint = null;
	public Location movingLocation = null;
	public Runnable movingRunnable = null;
	
	// WORKAROUND for changed PLAYER_MOVE logic
	public Location movingTeleportTo = null;
	
	public boolean reset = false;

	public long speedhackLastCheck = System.currentTimeMillis(); // timestamp of last check for speedhacks
	public Location speedhackSetBackPoint = null;
	public int speedhackEventsSinceLastCheck = 0; // used to identify speedhacks
	public int speedhackViolationsInARow = 0;

	public int airbuildPerSecond = 0;
	public Runnable airbuildRunnable = null;





	public NoCheatData() { }
}