package com.londonappbrewery.quizzler;

public class TrueFalse {

    /*
        member variable to hold or reference the questionID in the String.xml
        made an int because the R.id will return an int referencing a particular question
     */
    private int mQuestionID;
    private boolean mAnswer;

    public TrueFalse(){

    }

    public TrueFalse(int mQuiestionResouceID, boolean trueOrFalse){
        this.mQuestionID = mQuiestionResouceID;
        this.mAnswer =trueOrFalse;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }

    @Override
    public String toString() {
        return "TrueFalse{" +
                "mQuestionID=" + mQuestionID +
                ", mAnswer=" + mAnswer +
                '}';
    }
}
