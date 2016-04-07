package patterns.com.Factory;

import patterns.com.Domain.ReligionCeremony;

/**
 * Created by student on 2016/04/07.
 */
public class ReligionCerFactory {
    public static ReligionCerFactory religion=null;
    public ReligionCerFactory(){
    }
    public static ReligionCerFactory getInstance(){
        if(religion==null){
            religion=new ReligionCerFactory();
        }
        return religion;
    }
    public static ReligionCeremony getReligionCeremony(String event_id,String event_name){
        ReligionCeremony rel=new ReligionCeremony.Builder().id(event_id)
                .name(event_name)
                .build();
        return rel;
    }
}
