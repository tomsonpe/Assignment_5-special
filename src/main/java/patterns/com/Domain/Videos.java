package patterns.com.Domain;

/**
 * Created by student on 2016/04/07.
 */
public class Videos implements Photographer {
    private String cameraman_id;
    private String cameraman_name;
    public String getID(){
        return cameraman_id;
    }

    public String getName(){
        return cameraman_name;
    }

    public Videos(Builder build){
        cameraman_id=build.cameraman_id;
        cameraman_name=build.cameraman_name;
    }
    public static class Builder{
        private String cameraman_id;
        private String cameraman_name;

        public Builder id(String cameraman_id){
            this.cameraman_id =cameraman_id;
            return this;
        }

        public Builder name(String cameraman_name){
            this.cameraman_name=cameraman_name;
            return this;
        }

        public Builder copy(Videos video){
            cameraman_id=video.getID();
            cameraman_name=video.getName();
            return this;
        }
        public Videos build(){
            return new Videos(this);
        }
    }
    public String getPhotographer(){
        return "I'm focusing on videos";
    }
    public String getTypeOfEmployee(){
        return getPhotographer();
    }
}
