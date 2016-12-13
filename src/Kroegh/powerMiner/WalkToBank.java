package Kroegh.powerMiner;

import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientContext;

public class WalkToBank extends Task<ClientContext> {

	Tile[] pathToBank = {new Tile(3286, 3368), new Tile(3289, 3372), new Tile(3293, 3377), new Tile(3293, 3383)
			, new Tile(3292, 3389), new Tile(3291, 3395), new Tile(3291, 3401), new Tile(3290, 3408)
			, new Tile(3287, 3413), new Tile(3285, 3419), new Tile(3282, 3423), new Tile(3277, 3427)
			, new Tile(3271, 3429), new Tile(3265, 3428), new Tile(3258, 3428), new Tile(3254, 3425)
			, new Tile(3254, 3420)};

	public WalkToBank(ClientContext ctx){
		super(ctx);
	}
	
	public boolean activate(){
		return (ctx.inventory.select().count() == 28);
	}
	
    public void execute(){	
    	ctx.movement.newTilePath(pathToBank).traverse();
    }
}
