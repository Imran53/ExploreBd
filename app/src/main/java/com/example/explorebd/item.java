package com.example.explorebd;

public class item {

    int background;
    String profileName;// want
    int profilePhoto;
    int nbFollowers;

    public item(){

    }
    public item(int background,String profileName,int profilePhoto,int nbFollowers){
        this.background=background;
        this.profileName=profileName;//want
        this.profilePhoto=profilePhoto;
        this.nbFollowers=nbFollowers;
    }

    public int getBackground(){
        return background;
    }

    public String getImageTitle(){
        return profileName;
    }

    public int getProfilePhoto(){
        return  profilePhoto;
    }

    public int getNbFollowers(){
        return nbFollowers;
    }

    public void setBackground(int background)
    {
        this.background=background;
    }

    public void setImageTitle(String imageTitle){
        this.profileName=profileName;
    }

    public void setProfilePhoto(int profilePhoto){
        this.profilePhoto=profilePhoto;
    }

    public void setNbFollowers(int nbFollowers){
        this.nbFollowers=nbFollowers;
    }
}
