package Kroegh.powerMiner;

import java.util.Random;

import org.powerbot.script.Area;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.Bank;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.GameObject;
import org.powerbot.script.rt4.Item;

public class Banking extends Task<ClientContext>{
	
	Random rn = new Random();
	
	private int mineId = 440;
	
	Area Area1= new Area(new Tile(3250, 3423), new Tile(3257, 3420));
	
	Bank bank = new Bank(ctx);
			
	public Banking(ClientContext ctx){
		super(ctx);
	}
	
	@Override
	public boolean activate(){
		return Area1.contains(ctx.players.local()) && ctx.inventory.select().count() == 28;
	}
	
	@Override
	public void execute(){
		if(bank.inViewport()){
			bank.open();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bank.deposit(mineId, 27);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bank.close();
		}
	}
}