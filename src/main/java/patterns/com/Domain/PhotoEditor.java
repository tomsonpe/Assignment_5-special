package patterns.com.Domain;

/**
 * Created by student on 2016/04/07.
 */
public class PhotoEditor implements Editor {
    private String pEditor_id;
    private String pEditor_name;

    public String getID(){
        return pEditor_id;
    }

    public String getName(){
        return pEditor_name;
    }
    public PhotoEditor(Builder build){
        pEditor_id=build.pEditor_id;
        pEditor_name=build.pEditor_name;
    }
    public static class Builder{
        private String pEditor_id;
        private String pEditor_name;

        public Builder id(String pEditor_id){
            this.pEditor_id=pEditor_id;
            return this;
        }
        public Builder name(String pEditor_name){
            this.pEditor_name=pEditor_name;
            return this;
        }
        public Builder copy(PhotoEditor edit){
            this.pEditor_id=edit.getID();
            this.pEditor_name=edit.getName();

            return this;
        }

        public PhotoEditor build(){
            return new PhotoEditor(this);
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
