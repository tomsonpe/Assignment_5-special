package patterns.com.Chain_of_responsibility;

/**
 * Created by student on 2016/04/07.
 */
public interface PhotoChain {
    void setNextSession(PhotoChain chain);
    void printing(Photographer photo);
}
