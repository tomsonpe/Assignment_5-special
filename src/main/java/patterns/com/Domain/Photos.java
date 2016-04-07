package patterns.com.Domain;

/**
 * Created by student on 2016/04/07.
 */
public class Photos implements Photographer {
    private String camera_manID;
    private String camera_manName;

    public String getCameraManID(){
        return camera_manID;
    }
    public String getCameraManName(){
        return camera_manName;
    }

    public Photos(Builder builder){
        camera_manID=builder.camera_manID;
        camera_manName=builder.camera_manName;
    }
    public static class Builder{
        private String camera_manID;
        private String camera_manName;

        public Builder id(String camera_manID){
            this.camera_manID=camera_manID;
            return this;
        }

        public Builder name(String camera_manName){
            this.camera_manName=camera_manName;
            return this;
        }

        public Builder copy(Photos photo){
            this.camera_manID=photo.getCameraManID();
            this.camera_manName=photo.getCameraManName();

            return this;
        }

        public Photos build(){
            return new Photos(this);
        }

    }

    public String getPhotographer(){
        return "I'm focusing on photos";
    }
    public String getTypeOfEmployee(){
        return getPhotographer();
    }
}
