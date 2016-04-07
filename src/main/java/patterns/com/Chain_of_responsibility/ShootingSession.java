package patterns.com.Chain_of_responsibility;

/**
 * Created by student on 2016/04/07.
 */
public class ShootingSession implements PhotoChain{
    private PhotoChain chain;
    public void setNextSession(PhotoChain chain)
    {
        this.chain=chain;
    }
    public void printing(Photographer photoses)
    {
        printing(photoses);
    }
}
