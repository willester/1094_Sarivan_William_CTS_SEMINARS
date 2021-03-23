package ro.ase.csie.cts.lab5.g1094.singleton.enumeration;

public enum DbConnection {

    DEV_DB;

    String connString;
    String schema;

    private  DbConnection(){
        System.out.println("Loading settings from the conf file");
    }


}
