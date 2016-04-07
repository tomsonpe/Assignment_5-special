package patterns.com.Factory;

import patterns.com.Domain.Weddings;

/**
 * Created by student on 2016/04/07.
 */
public class WeddingFactory {
    public static WeddingFactory wedin=null;
    public WeddingFactory(){
    }
    public static WeddingFactory getInstance(){
        if(wedin==null){
            wedin=new WeddingFactory();
        }
        return wedin;
    }
    public static Weddings getWedding(String event_id,String event_name){
        Weddings wed=new Weddings.Builder().id(event_id)
                .name(event_name)
                .build();
        return wed;
    }
}
