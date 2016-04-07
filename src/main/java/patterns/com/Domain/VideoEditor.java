package patterns.com.Domain;

/**
 * Created by student on 2016/04/07.
 */
public class VideoEditor implements Editor {
    private String vEditor_id;
    private String vEditor_name;
    public String getID(){
        return vEditor_id;
    }

    public String getName(){
        return vEditor_name;
    }
    public VideoEditor(Builder build){
        vEditor_id=build.vEditor_id;
        vEditor_name=build.vEditor_name;
    }
    public static class Builder{
        private String vEditor_id;
        private String vEditor_name;

        public Builder id(String vEditor_id){
            this.vEditor_id=vEditor_id;
            return this;
        }
        public Builder name(String vEditor_name){
            this.vEditor_name=vEditor_name;
            return this;
        }
        public Builder copy(VideoEditor edit){
            this.vEditor_id=edit.getID();
            this.vEditor_name=edit.getName();

            return this;
        }

        public VideoEditor build(){
            return new VideoEditor(this);
        }
    }
    public String getEditor()
    {
        return "Focus on editing photos";
    }

    public String getTypeOfEmployee(){
        return getEditor();
    }
}
