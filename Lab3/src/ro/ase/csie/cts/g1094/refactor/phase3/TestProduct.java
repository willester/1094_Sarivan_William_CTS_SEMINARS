package ro.ase.csie.cts.g1094.refactor.phase3;

import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1094.refactor.phase3.services.Marketing2021Strategy;
import ro.ase.csie.cts.g1094.refactor.phase3.services.MarketingEasterStrategy;
import ro.ase.csie.cts.g1094.refactor.phase3.services.MarketingInterface;
import ro.ase.csie.cts.g1094.refactor.phase3.services.ValidatorService;

import java.util.ArrayList;

public class TestProduct {

    public static ArrayList<Object> services = new ArrayList<>();

    public static void startup(){
        //load services
        services.add(new ValidatorService());
        services.add(new Marketing2021Strategy());
    }


    public static void main(String[] args) {

       // Product product = new Product();
        Product product = new Product(new Marketing2021Strategy(),new ValidatorService());

        try {
           float finalPrice =  product.computePriceWithDiscount(ProductType.DISCOUNTED,100,5);
            System.out.println("final price is "+ finalPrice);

            product.setMarketingService(new MarketingEasterStrategy());
            finalPrice =  product.computePriceWithDiscount(ProductType.DISCOUNTED,100,5);
            System.out.println("final price is "+ finalPrice);

            product.setMarketingService(new MarketingInterface() {
                @Override
                public float getFidelityDiscount(int accountAge) {
                    return 0.3f;
                }
            });

            finalPrice =  product.computePriceWithDiscount(ProductType.DISCOUNTED,100,5);
            System.out.println("final price is "+ finalPrice);

        } catch (InvalidPriceException e) {
            e.printStackTrace();
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }


    }
}
