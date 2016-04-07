package patterns.com.Domain;

/**
 * Created by student on 2016/04/07.
 */
public class Credit implements Payment {
    private String credit_no;
    private String company_name;

    public String getNumber(){
        return credit_no;
    }

    public String getName(){
        return company_name=company_name;

    }

    public Credit(Builder builder){
        this.credit_no=builder.credit_no;
        this.company_name=builder.company_name;
    }
    public static class Builder{
        private String credit_no;
        private String company_name;

        public Builder no(String credit_no){
            this.credit_no=credit_no;
            return this;
        }

        public Builder name(String company_name){
            this.company_name=company_name;
            return this;
        }

        public Builder copy(Credit credit){
            this.credit_no=credit.getNumber();
            this.company_name=credit.getName();

            return this;
        }
        public Credit build(){
            return new Credit(this);
        }
    }
    public String getTypeOfPayment(){
        return "Credit";
    }
}
