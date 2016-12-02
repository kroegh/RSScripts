package Kroegh.powerMiner;

import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Item;

public class DropEmeralds extends Task<ClientContext>{

	private int emeraldId = 1621;
	
	public DropEmeralds(ClientContext ctx){
		super(ctx);
	}
	
	@Override
	public boolean activate(){
		return ctx.inventory.select().id(emeraldId) != null;
	}
	
	@Override
	public void execute(){
		for (Item e : ctx.inventory.id(emeraldId)){
			e.interact("drop");
		}
	}
	
}
