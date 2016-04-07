package patterns.com.Factory;

import patterns.com.Domain.Photos;

/**
 * Created by student on 2016/04/07.
 */
public class PhotoFactory {
    public static PhotoFactory photo=null;
    public PhotoFactory(){
    }
    public static PhotoFactory getInstance(){
        if(photo==null){
            photo=new PhotoFactory();
        }
        return photo;
    }
    public static Photos getPhoto(String camera_manID,String camera_manName){
        Photos myphoto=new Photos.Builder().id(camera_manID)
                .name(camera_manName)
                .build();
        return myphoto;
    }
}
