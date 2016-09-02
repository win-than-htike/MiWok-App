package com.example.android.miwok;

/**
 * Created by Win Than on 8/31/2016.
 */
public class Word {

    private String mMiwokTranslation;

    private String mDefaultTranslation;

    private int imageId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mMiwokTranslation, String mDefaultTranslation, int imageId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.imageId = imageId;
    }

    public Word(String mMiwokTranslation, String mDefaultTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageId() {
        return imageId;
    }

    public boolean hasImage(){
        return imageId != NO_IMAGE_PROVIDED;
    }
}
