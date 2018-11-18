package com.techexchange.mobileapps.lab16;

public class GalleryItem {


    private String mCaption;
    private String mId;
    private String mUrl;

    @Override
    public String toString(){
        return mCaption;
    }
    public void setmCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getmCaption() {
        return mCaption;
    }

    public String getmId() {
        return mId;
    }

    public String getmUrl() {
        return mUrl;
    }
}



