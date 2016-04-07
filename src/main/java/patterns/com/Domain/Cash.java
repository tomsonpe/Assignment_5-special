package patterns.com.Domain;

/**
 * Created by student on 2016/04/07.
 */
public class Cash implements Payment {
    private String cash_no;
    private String company_name;

    public String getNumber(){
        return cash_no;
    }

    public String getName(){
        return company_name=company_name;

    }

    public Cash(Builder builder){
        this.cash_no=builder.cash_no;
        this.company_name=builder.company_name;
    }
    public static class Builder{
        private String cash_no;
        private String company_name;

        public Builder no(String cash_no){
            this.cash_no=cash_no;
            return this;
        }

        public Builder name(String company_name){
            this.company_name=company_name;
            return this;
        }

        public Builder copy(Cash cash){
            this.cash_no=cash.getNumber();
            this.company_name=cash.getName();

            return this;
        }
        public Cash build(){
            return new Cash(this);
        }
    }

    public String getTypeOfPayment(){
        return "deposit";
    }
}
