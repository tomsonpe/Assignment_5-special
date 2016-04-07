package patterns.com.Factory;

import patterns.com.Domain.Funerals;

/**
 * Created by student on 2016/04/07.
 */
public class FuneralFactory {
    public static FuneralFactory funeral=null;
    public FuneralFactory(){
    }
    public static FuneralFactory getInstance(){
        if(funeral==null){
            funeral=new FuneralFactory();
        }
        return funeral;
    }
    public static Funerals getFuneral(String event_id,String event_name){
        Funerals fun=new Funerals.Builder().id(event_id)
                .name(event_name)
                .build();
        return fun;
    }
}
