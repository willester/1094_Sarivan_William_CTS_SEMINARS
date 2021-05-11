package ro.ase.csie.cts.g1094.dp.Chain;

public class TestChain {

    public static void main(String[] args) {

        ChatHandler languageFilter = new LanguageFilter("English");
        ChatHandler privateChat = new PrivateChat();
        ChatHandler globalChat = new GlobalChat();

        languageFilter.setNext(privateChat);
        privateChat.setNext(globalChat);

        ChatHandler chatServer = languageFilter;

        chatServer.processMessage(new Message("@everyone","kill superman, its a bot",10));
        chatServer.processMessage(new Message("@John", "lets tart lvl 2",0));
        chatServer.processMessage(new Message("@everyone", "lets join the party",0));



    }

}
