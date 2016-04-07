package patterns.com;

import junit.framework.Assert;
import org.junit.Test;
import patterns.com.Domain.Credit;
import patterns.com.Factory.CreditFactory;

/**
 * Created by student on 2016/04/07.
 */
public class TestCredit {
    private CreditFactory factory;
    @Test
    public void setUp()
    {
        factory= CreditFactory.getInstance();
    }

    @Test
    public void TestCreation()
    {
        Credit credit=factory.getCredit("PETomson","Encore");
        Assert.assertNotNull(credit.getNumber());
        Assert.assertEquals("PETomson",credit.getNumber());
        Assert.assertEquals("Encore",credit.getName());

        Credit update=new Credit.Builder().copy(credit).name("Encore").build();
        Assert.assertEquals(update.getNumber(),credit.getNumber());
        Assert.assertEquals(update.getName(), credit.getName());
    }
}
