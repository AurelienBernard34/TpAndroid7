package com.example.admin.tpandroid7;

/**
 * Created by admin on 12/06/2017.
 */

public class VraiFaux {



    private boolean reponse;

    private String question;

    private String question1;

    private String question2;

    public VraiFaux(String question, String question1, String question2, boolean reponse)
    {
        setQuestion(question);
        setQuestion1(question1);
        setQuestion2(question2);
        setReponse(reponse);
    }


    // Les setters
    public void setQuestion(String question) {
        this.question = question;
    }
    public void setReponse(boolean reponse) {
        this.reponse = reponse;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    //Les getters
    public boolean isReponse() {
        return reponse;
    }

    public String getQuestion() {
        return question;
    }

    public String getQuestion1() {
        return question1;
    }

    public String getQuestion2() {
        return question2;
    }


}
