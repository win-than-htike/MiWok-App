package com.example.android.miwok;

/**
 * Created by Win Than on 8/31/2016.
 */
public class MiWok {

    private String mMiwokTranslation;

    private String mDefaultTranslation;

    public MiWok(String mMiwokTranslation, String mDefaultTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
}
