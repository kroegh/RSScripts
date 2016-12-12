package Kroegh.powerMiner;

import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientContext;

public class Walking extends Task<ClientContext> {

	Tile[] pathToBank = {new Tile(3286, 3368, 0), new Tile(3289, 3372, 0), new Tile(3293, 3377, 0), new Tile(3293, 3383, 0)
			, new Tile(3292, 3389, 0), new Tile(3291, 3395, 0), new Tile(3291, 3401, 0), new Tile(3290, 3408, 0)
			, new Tile(3287, 3413, 0), new Tile(3285, 3419, 0), new Tile(3282, 3423, 0), new Tile(3277, 3427, 0)
			, new Tile(3271, 3429, 0), new Tile(3265, 3428, 0), new Tile(3258, 3428, 0), new Tile(3254, 3425, 0)
			, new Tile(3254, 3420, 0)};

	public Walking(ClientContext ctx){
		super(ctx);
	}
	
	public boolean activate(){
		return (ctx.inventory.select().count() == 28);
	}
	
    public void execute(){	
    	ctx.movement.newTilePath(pathToBank).traverse();
    }
}
