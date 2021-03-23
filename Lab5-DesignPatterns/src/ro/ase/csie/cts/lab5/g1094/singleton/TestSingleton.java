package ro.ase.csie.cts.lab5.g1094.singleton;

public class TestSingleton {

    public static void main(String[] args) {

        //DbConnection con1 = new DbConnection();
        //...
        //DbConnection con2 = new DbConnection();

        //DbConnection con3 = new DbConnection("ceva","ceva");
        //DbConnection con4 = new DbConnection("ceva","ceva");

        DbConnection con1 = DbConnection.getConnection();
        DbConnection con2 = DbConnection.getConnection();

//        DbConnection con1 = DbConnection.getConnection("127.0.0.14443","cts");
//        DbConnection con3 = DbConnection.getConnection("localhost.0.14443","cts");
//        DbConnection con2 = DbConnection.getConnection("127.0.0.14443","cts");


        if(con1 == con2)
        {
            System.out.print("they are potining at the same database");
        }

    }

}
