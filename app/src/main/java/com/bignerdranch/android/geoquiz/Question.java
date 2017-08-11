package com.bignerdranch.android.geoquiz;

/**
 * Created by Surbhi on 5/11/2017.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mAnswerShown;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mAnswerShown = false;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isAnswerShown() { return mAnswerShown; }

    public void setAnswerShown(boolean answerShown) { mAnswerShown = answerShown; }

}
