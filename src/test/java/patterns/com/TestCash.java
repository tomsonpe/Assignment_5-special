package patterns.com;

import junit.framework.Assert;
import org.junit.Test;
import patterns.com.Domain.Cash;
import patterns.com.Factory.CashFactory;

/**
 * Created by student on 2016/04/07.
 */
public class TestCash {
    private CashFactory factory;
    @Test
    public void setUp()
    {
        factory= CashFactory.getInstance();
    }

    @Test
    public void TestCreation()
    {
        Cash cash=factory.getCash("PETomson","Encore");
        Assert.assertNotNull(cash.getNumber());
        Assert.assertEquals("PETomson",cash.getNumber());
        Assert.assertEquals("Encore",cash.getName());

        Cash update=new Cash.Builder().copy(cash).name("Encore").build();
        Assert.assertEquals(update.getNumber(),cash.getNumber());
        Assert.assertEquals(update.getName(), cash.getName());
    }
}
