package patterns.com.Factory;

import patterns.com.Domain.VideoEditor;

/**
 * Created by student on 2016/04/07.
 */
public class VideoEditorFactory {
    public static VideoEditorFactory editor=null;
    public VideoEditorFactory(){
    }
    public static VideoEditorFactory getInstance(){
        if(editor==null){
            editor=new VideoEditorFactory();
        }
        return editor;
    }
    public static VideoEditor getEdit(String vEditor_id,String vEditor_name){
        VideoEditor myEdit=new VideoEditor.Builder().id(vEditor_id)
                .name(vEditor_name)
                .build();

        return myEdit;
    }
}
