package com.bolaah.eko;

/**
 * {@link Word} represents a list of tourist centers.
 * It contains a Subject and a Body for that word.
 */
public class Word {

    /**
     * Subject for the word
     */
    private String mSubject;

    /**
     * Body for the word
     */
    private String mBody;

    /**
     * Image ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    private static final int NO_IMAGE_PROVIDED = -1;



    /**
     * Create a new Word object.
     *
     * @param subject is the subject of the Word object
     * @param body   is the body of the Word object
     * @param imageResourceId    is the image Id for the word
     *
     *
     */
    public Word(String subject, String body, int imageResourceId) {
        mSubject = subject;
        mBody = body;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get Subject of the word.
     */
    public String getSubject() {
        return mSubject;
    }

    /**
     * Get Body of the word.
     */
    public String getBody() {
        return mBody;
    }

    /**
     * Get the Image ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }




}