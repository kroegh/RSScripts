package Kroegh.powerMiner;

import org.powerbot.script.*;
import org.powerbot.script.rt4.ClientContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Script.Manifest(description = "A mod for mining", name = "Kroegh")
public class PowerMiner extends PollingScript<ClientContext>{
	private List<Task> taskList = new ArrayList<Task>();
	
	@Override
	public void start(){
		taskList.addAll(Arrays.asList(new Mine(ctx), new Drop(ctx), new DropEmeralds(ctx), new DropSapphires(ctx)));
	}
	
	@Override
	public void poll(){
		for (Task task : taskList){
			if (task.activate()){
				task.execute();
			}
		}
	}
}
