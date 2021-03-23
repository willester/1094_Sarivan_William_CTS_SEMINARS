package ro.ase.csie.cts.lab5.g1094.singleton.registry;

public class TestRegistry {

    public static void main(String[] args) {

        DbConnection con1 = DbConnection.getDbConnection("127.0.0.1","devDb");
        DbConnection con2 = DbConnection.getDbConnection("127.0.0.1","devDb");

        if(con1 == con2)
        {
            System.out.println("they are the same");
        }

        DbConnection con3 = DbConnection.getDbConnection("10.0.0.1","prodDb");

        if(con3 != con2)
        {
            System.out.println("they are different");
        }

        DbConnection con4 = DbConnection.getDbConnection("89.0.0.1","prodDb");


    }

}
