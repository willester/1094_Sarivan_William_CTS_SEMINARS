package ro.ase.csie.cts.g1094.dp.command;

public class AsynchTask implements AsynchTaskInterface{

    String taskName;
    int priority;
    GameModuleInterface module;

    public AsynchTask(String taskName, int priority, GameModuleInterface module) {
        super();
        this.taskName = taskName;
        this.priority = priority;
        this.module = module;
    }

    @Override
    public void awaitTask() {
        this.module.doTask(taskName);
    }

}
