package patterns.com;

import junit.framework.Assert;
import org.junit.Test;
import patterns.com.Domain.Weddings;
import patterns.com.Factory.WeddingFactory;

/**
 * Created by student on 2016/04/07.
 */
public class TestWedding {
    private WeddingFactory factory;
    @Test
    public void setUp()
    {
        factory= WeddingFactory.getInstance();
    }

    @Test
    public void TestCreation()
    {
        Weddings wed=factory.getWedding("PETomson", "Encore");
        Assert.assertNotNull(wed.getID());
        Assert.assertEquals("PETomson",wed.getID());
        Assert.assertEquals("Encore",wed.getName());

        Weddings update=new Weddings.Builder().copy(wed).name("Encore").build();
        Assert.assertEquals(update.getID(),wed.getID());
        Assert.assertEquals(update.getName(), wed.getName());
    }
}
