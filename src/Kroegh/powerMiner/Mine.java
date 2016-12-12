package Kroegh.powerMiner;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.GameObject;

public class Mine extends Task<ClientContext>{
	
	private int[] mineIds = {7488, 7455};

	public Mine(ClientContext ctx){
		super(ctx);
	}
	
	@Override
	public boolean activate(){
		return ctx.inventory.select().count() < 28 && !ctx.objects.select().id(mineIds).isEmpty() && ctx.players.local().animation() == -1;
	}

	@Override
	public void execute(){
		GameObject mine = ctx.objects.nearest().poll();
		if(mine.inViewport()){
			mine.interact("Mine");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			ctx.movement.step(mine);
			ctx.camera.turnTo(mine);
		}
	}
	
}
