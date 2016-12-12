package Kroegh.powerMiner;

import org.powerbot.script.Area;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.Bank;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.GameObject;
import org.powerbot.script.rt4.Item;

public class Banking extends Task<ClientContext>{
	
	private int mineId = 440;
	
	Area Area1= new Area(new Tile(3255, 3418, 0), new Tile(3252, 3418, 0),
			new Tile(3255, 3422, 0), new Tile(3252, 3422, 0));
			
	public Banking(ClientContext ctx){
		super(ctx);
	}
	
	@Override
	public boolean activate(){
		return Area1.contains(ctx.players.local());
	}
	
	@Override
	public void execute(){
		System.out.println("awognj");
//	GameObject bank = ctx.objects.nearest().poll();
//	if(bank.inViewport()){
//		bank.interact("bank");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		ctx.bank.deposit(mineId, 27);
//		try {
//			Thread.sleep(2000);
//			} 
//		catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			}
//		
//		}
	}
}