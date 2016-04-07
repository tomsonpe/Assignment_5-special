package patterns.com.Domain;

/**
 * Created by student on 2016/04/07.
 */
public class Weddings implements Events {
    private String event_id;
    private String event_name;

    public String getID(){
        return event_id;
    }

    public String getName(){
        return event_name;
    }

    public Weddings(Builder builder){
        this.event_id=builder.event_id;
        this.event_name=builder.event_name;
    }

    public static class Builder{
        private String event_id;
        private String event_name;

        public Builder id(String event_id){
            this.event_id=event_id;
            return this;
        }

        public Builder name(String event_name){
            this.event_name=event_name;
            return this;
        }

        public Builder copy(Weddings wed){
            this.event_id=wed.getID();
            this.event_name=wed.getName();
            return this;
        }

        public Weddings build(){
            return new Weddings(this);
        }
    }
    public String getEvent(){
        return "wedding";
    }
    public String getTypeOfClient(){
        return getEvent();
    }
}
