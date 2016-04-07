package patterns.com.Factory;

import patterns.com.Domain.PhotoEditor;

/**
 * Created by student on 2016/04/07.
 */
public class PhotoEditorFactory {
    public static PhotoEditorFactory editor=null;
    public PhotoEditorFactory(){
    }
    public static PhotoEditorFactory getInstance(){
        if(editor==null){
            editor=new PhotoEditorFactory();
        }
        return editor;
    }
    public static PhotoEditor getEdit(String pEditor_id,String pEditor_name){
        PhotoEditor myEdit=new PhotoEditor.Builder().id(pEditor_id)
                .name(pEditor_name)
                .build();

        return myEdit;
    }
}
