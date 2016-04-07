package patterns.com;

import junit.framework.Assert;
import org.junit.Test;
import patterns.com.Domain.Photos;
import patterns.com.Domain.Videos;
import patterns.com.Factory.VideoFactory;

/**
 * Created by student on 2016/04/07.
 */
public class TestVideo {
    private VideoFactory factory;
    @Test
    public void setUp()
    {
        factory= VideoFactory.getInstance();
    }

    @Test
    public void TestVideoCreation()
    {
        Videos video=factory.getVideo("PETomson", "Encore");
        Assert.assertNotNull(video.getID());
        Assert.assertEquals("PETomson",video.getID());
        Assert.assertEquals("Encore",video.getName());

        Videos updatePhoto=new Videos.Builder().copy(video).name("Encore").build();
        Assert.assertEquals(updatePhoto.getID(),video.getID());
        Assert.assertEquals(updatePhoto.getName(), video.getName());
    }
}
