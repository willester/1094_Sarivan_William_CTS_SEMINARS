package ro.ase.csie.cts.g1094.dp.command;

import java.util.ArrayList;

public class GameClient {

    ArrayList<AsynchTaskInterface> tasks = new ArrayList<>();

    public void addTask(AsynchTaskInterface task){
        this.tasks.add(task);
    }

    public void executeTask(){
        if(tasks.size()> 0){
            AsynchTaskInterface task = this.tasks.get(0);
            if(task != null){
                task.awaitTask();
                this.tasks.remove(0);
            }
        }
    }

}
