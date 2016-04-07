package patterns.com;

import junit.framework.Assert;
import org.junit.Test;
import patterns.com.Domain.PhotoEditor;
import patterns.com.Domain.Photos;
import patterns.com.Factory.PhotoEditorFactory;

/**
 * Created by student on 2016/04/07.
 */
public class TestPhotoEditor {
    private PhotoEditorFactory factory;
    @Test
    public void setUp()
    {
        factory= PhotoEditorFactory.getInstance();
    }

    @Test
    public void TestPhotoCreation()
    {
        PhotoEditor edit=factory.getEdit("PETomson","Encore");
        Assert.assertNotNull(edit.getID());
        Assert.assertEquals("PETomson",edit.getID());
        Assert.assertEquals("Encore",edit.getName());

        PhotoEditor updatePhoto=new PhotoEditor.Builder().copy(edit).name("Encore").build();
        Assert.assertEquals(updatePhoto.getID(),edit.getID());
        Assert.assertEquals(updatePhoto.getName(), edit.getName());
    }
}
