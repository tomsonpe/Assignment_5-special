package patterns.com;

import junit.framework.Assert;
import org.junit.Test;
import patterns.com.Domain.Photos;
import patterns.com.Factory.PhotoFactory;

/**
 * Created by student on 2016/04/07.
 */
public class TestPhoto {
    private PhotoFactory factory;
    @Test
    public void setUp()
    {
        factory= PhotoFactory.getInstance();
    }

    @Test
    public void TestPhotoCreation()
    {
        Photos photo=factory.getPhoto("PETomson","Encore");
        Assert.assertNotNull(photo.getCameraManID());
        Assert.assertEquals("PETomson",photo.getCameraManID());
        Assert.assertEquals("Encore",photo.getCameraManName());

        Photos updatePhoto=new Photos.Builder().copy(photo).name("Encore").build();
        Assert.assertEquals(updatePhoto.getCameraManID(),photo.getCameraManID());
        Assert.assertEquals(updatePhoto.getCameraManName(),photo.getCameraManName());
    }
}
