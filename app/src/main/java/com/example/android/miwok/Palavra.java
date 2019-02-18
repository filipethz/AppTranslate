package com.example.android.miwok;

/**
 * Created by filipeth on 28/02/2017.
 */

public class Palavra {

    private String mPortuguesTranslation;
    private String mInglesTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Palavra(String portuguesTranslation, String inglesTranslation) {
        this.mPortuguesTranslation = portuguesTranslation;
        this.mInglesTranslation = inglesTranslation;
    }
    public Palavra(String portuguesTranslation, String inglesTranslation, int imageResourceId){
        this.mPortuguesTranslation = portuguesTranslation;
        this.mInglesTranslation = inglesTranslation;
        this.mImageResourceId = imageResourceId;
    }

    //trás a palavra em português
    public String getPortuguesTranslation() {
        return mPortuguesTranslation;
    }

    //trás a palavra em inglês
    public String getInglesTranslation() {
        return mInglesTranslation;
    }

    //trás a imagem corresponde a palavra pelo id
    public int getmImageResourceId(){return mImageResourceId;}

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
