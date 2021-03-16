package ro.ase.csie.cts.g1094.refactor.phase3;

import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1094.refactor.phase3.services.MarketingInterface;
import ro.ase.csie.cts.g1094.refactor.phase3.services.ValidatorService;
import ro.ase.csie.cts.g1094.refactor.phase3.services.ValidatorServiceInterface;

public class Product {

    MarketingInterface mkService = null;
    ValidatorServiceInterface validator = null;

    public  Product(MarketingInterface mkService,ValidatorServiceInterface validator)
    {
//        if(mkService == null)
//        {
//            throw new NullPointerException();
//        }
//        this.mkService = mkService;
        this.setMarketingService(mkService);
        this.validator = validator;
    }

    //version 4 - use the global service collection
    public Product(){
        //dependency injection based on the global services collection

        for(Object service : TestProduct.services)
        {
            if(service instanceof MarketingInterface)
            {
                this.setMarketingService((MarketingInterface) service);
            }
            if(service instanceof ValidatorServiceInterface)
            {
                this.validator = (ValidatorServiceInterface) service;
            }
        }

        if(this.mkService == null )
        {
            throw new UnsupportedOperationException();
        }

        if(this.validator == null )
        {
            throw new UnsupportedOperationException();
        }

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

        validator.validatePrice(price);
        validator.validateAge(accountAge);

        float fidelityDiscount = (productType == ProductType.NEW) ? 0 : mkService.getFidelityDiscount(accountAge);

       float finalPrice = getFinalPrice(price,fidelityDiscount,productType);

        return finalPrice;
    }
}
