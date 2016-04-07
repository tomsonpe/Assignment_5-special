package patterns.com.Factory;

import patterns.com.Domain.Cheque;

/**
 * Created by student on 2016/04/07.
 */
public class ChequeFactory {
    public static ChequeFactory cheque=null;
    public ChequeFactory(){
    }
    public static ChequeFactory getInstance(){
        if(cheque==null){
            cheque=new ChequeFactory();
        }
        return cheque;
    }
    public static Cheque getCheque(String cheque_no,String company_name){
        Cheque cheq=new Cheque.Builder().no(cheque_no)
                .name(company_name)
                .build();
        return cheq;
    }
}
