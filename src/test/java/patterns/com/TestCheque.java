package patterns.com;

import junit.framework.Assert;
import org.junit.Test;
import patterns.com.Domain.Cheque;
import patterns.com.Factory.CashFactory;
import patterns.com.Factory.ChequeFactory;

/**
 * Created by student on 2016/04/07.
 */
public class TestCheque {
    private ChequeFactory factory;
    @Test
    public void setUp()
    {
        factory= ChequeFactory.getInstance();
    }

    @Test
    public void TestCreation()
    {
        Cheque cheque=factory.getCheque("PETomson", "Encore");
        Assert.assertNotNull(cheque.getNumber());
        Assert.assertEquals("PETomson",cheque.getNumber());
        Assert.assertEquals("Encore",cheque.getName());

        Cheque update=new Cheque.Builder().copy(cheque).name("Encore").build();
        Assert.assertEquals(update.getNumber(),cheque.getNumber());
        Assert.assertEquals(update.getName(), cheque.getName());
    }
}
