package Kroegh.powerMiner;

import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Item;

public class DropSapphires extends Task<ClientContext>{

	private int sapphireId = 1623;
	
	public DropSapphires(ClientContext ctx){
		super(ctx);
	}
	
	@Override
	public boolean activate(){
		return ctx.inventory.select().id(sapphireId) != null;
	}
	
	@Override
	public void execute(){
		for (Item e : ctx.inventory.id(sapphireId)){
			e.interact("drop");
		}
	}
	
}