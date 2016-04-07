package patterns.com.Factory;

import patterns.com.Domain.Cash;

/**
 * Created by student on 2016/04/07.
 */
public class CashFactory {
    public static CashFactory cashy=null;
    public CashFactory(){
    }
    public static CashFactory getInstance(){
        if(cashy==null){
            cashy=new CashFactory();
        }
        return cashy;
    }
    public static Cash getCash(String cash_no,String company_name){
        Cash cash=new Cash.Builder().no(cash_no)
                .name(company_name)
                .build();
        return cash;
    }
}
