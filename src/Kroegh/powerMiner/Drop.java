package Kroegh.powerMiner;

import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Item;

public class Drop extends Task<ClientContext>{
	
	private int mineId = 436;
			
	public Drop(ClientContext ctx){
		super(ctx);
	}
	
	@Override
	public boolean activate(){
		return ctx.inventory.select().count() == 28;
	}
	
	@Override
	public void execute(){
		for (Item i : ctx.inventory.id(mineId)){
			i.interact("Drop");
		}
	}
}
