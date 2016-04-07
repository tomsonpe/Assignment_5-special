package patterns.com;

import junit.framework.Assert;
import org.junit.Test;
import patterns.com.Domain.Funerals;
import patterns.com.Factory.FuneralFactory;

/**
 * Created by student on 2016/04/07.
 */
public class TestFunerals {
    private FuneralFactory factory;
    @Test
    public void setUp()
    {
        factory= FuneralFactory.getInstance();
    }

    @Test
    public void TestCreation()
    {
        Funerals fun=factory.getFuneral("PETomson","Encore");
        Assert.assertNotNull(fun.getID());
        Assert.assertEquals("PETomson",fun.getID());
        Assert.assertEquals("Encore",fun.getName());

        Funerals update=new Funerals.Builder().copy(fun).name("Encore").build();
        Assert.assertEquals(update.getID(),fun.getID());
        Assert.assertEquals(update.getName(), fun.getName());
    }
}
