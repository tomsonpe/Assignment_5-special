package patterns.com;

import junit.framework.Assert;
import org.junit.Test;
import patterns.com.Domain.GraduationCeremony;
import patterns.com.Factory.GraduationCerFactory;
import patterns.com.Factory.ReligionCerFactory;

/**
 * Created by student on 2016/04/07.
 */
public class TestGraduation {
    private GraduationCerFactory factory;
    @Test
    public void setUp()
    {
        factory= GraduationCerFactory.getInstance();
    }

    @Test
    public void TestCreation()
    {
        GraduationCeremony grad=factory.getCeremony("PETomson","Encore");
        Assert.assertNotNull(grad.getID());
        Assert.assertEquals("PETomson",grad.getID());
        Assert.assertEquals("Encore", grad.getName());

        GraduationCeremony update=new GraduationCeremony.Builder().copy(grad).name("Encore").build();
        Assert.assertEquals(update.getID(),grad.getID());
        Assert.assertEquals(update.getName(), grad.getName());
    }
}
