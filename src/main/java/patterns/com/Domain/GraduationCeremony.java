package patterns.com.Domain;

/**
 * Created by student on 2016/04/07.
 */
public class GraduationCeremony implements Ceremonies {
    private String event_id;
    private String event_name;
    public String getID(){
        return event_id;
    }

    public String getName(){
        return event_name;
    }

    public GraduationCeremony(Builder builder){
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

        public Builder copy(GraduationCeremony grad){
            this.event_id=grad.getID();
            this.event_name=grad.getName();
            return this;
        }

        public GraduationCeremony build(){
            return new GraduationCeremony(this);
        }
    }
    public String getTypeOfCeremony(){
        return "Graduation";
    }
    public String getEvent(){
        return getTypeOfCeremony();
    }
    public String getTypeOfClient(){
        return getEvent();
    }
}
