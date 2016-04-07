package patterns.com.Chain_of_responsibility;

/**
 * Created by student on 2016/04/07.
 */
public class Photographer {
    private String photo_id;
    private String name;
    private int sessionNumber;

    public Photographer(String photo_id,String name,int sessionNumber) {
        this.photo_id = photo_id;
        this.name = name;
        this.sessionNumber = sessionNumber;
    }
    public String getPhoto_ID(){return photo_id;}
    public String getName(){return name;}
    public int getSession(){return sessionNumber;}
}
