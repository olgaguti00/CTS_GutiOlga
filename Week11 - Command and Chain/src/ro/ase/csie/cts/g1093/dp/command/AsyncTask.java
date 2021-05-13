package ro.ase.csie.cts.g1093.dp.command;

public class AsyncTask implements AsyncTaskInterface{
	GameModuleInterface module;
	String actonDetails;
	int priority;

	public AsyncTask(GameModuleInterface module, String actonDetails, int priority) {
		super();
		this.module = module;
		this.actonDetails = actonDetails;
		this.priority = priority;
	}

	@Override
	public void startTask() {
		this.module.doTheTask(actonDetails);
		
	}

}
