package Kroegh.powerMiner;

import org.powerbot.script.Area;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientContext;

public class WalkToMine extends Task<ClientContext> {
	
	Area Area1= new Area(new Tile(3250, 3423), new Tile(3257, 3420));

	Tile[] pathToMine = {new Tile(3254, 3424), new Tile(3256, 3428), new Tile(3260, 3428), new Tile(3264, 3427)
			, new Tile(3269, 3428), new Tile(3274, 3428), new Tile(3279, 3425), new Tile(3283, 3423)
			, new Tile(3286, 3419), new Tile(3287, 3414), new Tile(3289, 3408), new Tile(3291, 3403)
			, new Tile(3291, 3397), new Tile(3291, 3391), new Tile(3292, 3385), new Tile(3293, 3378), new Tile(3290, 3374), new Tile(3287, 3370), new Tile(3286, 3368)};

	public WalkToMine(ClientContext ctx){
		super(ctx);
	}
	
	public boolean activate(){
		return (ctx.inventory.select().count() == 1);
	}
	
    public void execute(){	
    	
    	ctx.movement.newTilePath(pathToMine).traverse();
    }
}
