package ro.ase.csie.cts.g1094.refactor.phase3;

import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1094.refactor.phase3.services.MarketingInterface;

public class Product {

    MarketingInterface mkService = null;

    public  Product(MarketingInterface mkService)
    {
//        if(mkService == null)
//        {
//            throw new NullPointerException();
//        }
//        this.mkService = mkService;
        this.setMarketingService(mkService);
    }

    //optional - based on design specs
    public void setMarketingService(MarketingInterface mkService)
    {
        if(mkService == null)
        {
            throw new NullPointerException();
        }
        this.mkService = mkService;
    }


    private static float getDiscountValue(float price,float discount)
    {
        return discount * price;
    }

    private static float getFinalPrice(float price, float FidelityDiscount, ProductType type)
    {
      float   discountValue= getDiscountValue(price,type.getDiscount());
      float finalPrice = getPricewithDiscountAndFidelity(price,discountValue,FidelityDiscount);;
      return finalPrice;
    }

    private  static float getPricewithDiscountAndFidelity(float price, float discount,float fidelityDiscount)
    {
        return (price - discount)*(1-fidelityDiscount);
    }


    public float computePriceWithDiscount(ProductType productType, float price, int accountAge) throws InvalidPriceException, InvalidAgeException {
        if(price <= 0) {
            throw new InvalidPriceException();
        }
        if(accountAge < 0) {
            throw new InvalidAgeException();
        }

        float fidelityDiscount = (productType == ProductType.NEW) ? 0 : mkService.getFidelityDiscount(accountAge);

       float finalPrice = getFinalPrice(price,fidelityDiscount,productType);

        return finalPrice;
    }
}
