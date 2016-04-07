package patterns.com.Domain;

/**
 * Created by student on 2016/04/07.
 */
public class ReligionCeremony implements Ceremonies {
    private String event_id;
    private String event_name;
    public String getID(){
        return event_id;
    }

    public String getName(){
        return event_name;
    }

    public ReligionCeremony(Builder builder){
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

        public Builder copy(ReligionCeremony rel){
            this.event_id=rel.getID();
            this.event_name=rel.getName();
            return this;
        }

        public ReligionCeremony build(){
            return new ReligionCeremony(this);
        }
    }
    public String getTypeOfCeremony(){
        return "Religion";
    }
    public String getEvent(){
        return getTypeOfCeremony();
    }
    public String getTypeOfClient(){
        return getEvent();
    }
}
