package patterns.com.Factory;

import patterns.com.Domain.Videos;

/**
 * Created by student on 2016/04/07.
 */
public class VideoFactory {
    public static VideoFactory video=null;
    public VideoFactory(){
    }

    public static VideoFactory getInstance(){
        if(video==null){
            video=new VideoFactory();
        }
        return video;
    }
    public static Videos getVideo(String camera_manID,String camera_manName){
        Videos myVideo=new Videos.Builder().id(camera_manID)
                .name(camera_manName)
                .build();
        return myVideo;
    }
}
