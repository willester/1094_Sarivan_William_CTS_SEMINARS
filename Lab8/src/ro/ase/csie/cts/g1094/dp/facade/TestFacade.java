package ro.ase.csie.cts.g1094.dp.facade;

public class TestFacade {

    public static void main(String[] args) {

        GameServer gameServer = new GameServer();
        gameServer.connect("10.0.0.1");
        if (gameServer.isConnected()) {
            UserAccount user = new UserAccount();
            user.login("Player1", "1234");

            UserProfile profile = user.downloadUserProfile();
            profile.getUserProfile();
        }

        gameServer = new GameServer();
        gameServer.connect("10.0.0.1");
        if (gameServer.isConnected()) {
            UserAccount user = new UserAccount();
            user.login("Player2", "1234");

            UserProfile profile = user.downloadUserProfile();
            profile.getUserProfile();
        }

        UserProfile player1Profile = UserAPIFacade.getUserProfile("199.04.04.101","tett1","parolaTest");
        if (player1Profile != null)
        {
            player1Profile.getUserProfile();
        }


    }
}
