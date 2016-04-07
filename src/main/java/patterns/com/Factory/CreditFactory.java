package patterns.com.Factory;

import patterns.com.Domain.Credit;

/**
 * Created by student on 2016/04/07.
 */
public class CreditFactory {
    public static CreditFactory credit=null;
    public CreditFactory(){
    }
    public static CreditFactory getInstance(){
        if(credit==null){
            credit=new CreditFactory();
        }
        return credit;
    }
    public static Credit getCredit(String credit_no,String company_name){
        Credit credit=new Credit.Builder().no(credit_no)
                .name(company_name)
                .build();
        return credit;
    }
}
