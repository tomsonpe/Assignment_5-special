package patterns.com.Factory;

import patterns.com.Domain.GraduationCeremony;

/**
 * Created by student on 2016/04/07.
 */
public class GraduationCerFactory {
    public static GraduationCerFactory graduate=null;
    public GraduationCerFactory(){
    }
    public static GraduationCerFactory getInstance(){
        if(graduate==null){
            graduate=new GraduationCerFactory();
        }
        return graduate;
    }
    public static GraduationCeremony getCeremony(String event_id,String event_name){
        GraduationCeremony grad=new GraduationCeremony.Builder().id(event_id)
                .name(event_name)
                .build();
        return grad;
    }
}
