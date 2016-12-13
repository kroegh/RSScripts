package Kroegh.powerMiner;

import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Item;

public class DropRubies extends Task<ClientContext>{

	private int rubyId = 1619;
	
	public DropRubies(ClientContext ctx){
		super(ctx);
	}
	
	@Override
	public boolean activate(){
		return ctx.inventory.select().id(rubyId) != null;
	}
	
	@Override
	public void execute(){
		for (Item e : ctx.inventory.id(rubyId)){
			e.interact("drop");
		}
	}
	
}