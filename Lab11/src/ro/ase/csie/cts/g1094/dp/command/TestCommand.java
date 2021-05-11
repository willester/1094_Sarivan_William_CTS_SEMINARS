package ro.ase.csie.cts.g1094.dp.command;

public class TestCommand {

    public static void main(String[] args) {

        GameClient gameClient = new GameClient();
        gameClient.addTask(new AsynchTask("Data backup", 5, new BackupModule()));
        gameClient.addTask(new AsynchTask("Updte game models", 1, new UpdateModule()));

        System.out.println("gmae is running");
        gameClient.executeTask();
        gameClient.executeTask();
        gameClient.executeTask();

        System.out.println("game is running");

    }

}
