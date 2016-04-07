package patterns.com;

import junit.framework.Assert;
import org.junit.Test;
import patterns.com.Domain.VideoEditor;
import patterns.com.Factory.VideoEditorFactory;

/**
 * Created by student on 2016/04/07.
 */
public class TestVideoEditor {
    private VideoEditorFactory factory;
    @Test
    public void setUp()
    {
        factory=VideoEditorFactory.getInstance();
    }

    @Test
    public void Test()
    {
        VideoEditor edit=factory.getEdit("PETomson","Encore");
        Assert.assertNotNull(edit.getID());
        Assert.assertEquals("PETomson",edit.getID());
        Assert.assertEquals("Encore",edit.getName());

        VideoEditor update=new VideoEditor.Builder().copy(edit).name("Encore").build();
        Assert.assertEquals(update.getID(),edit.getID());
        Assert.assertEquals(update.getName(), edit.getName());
    }
}
