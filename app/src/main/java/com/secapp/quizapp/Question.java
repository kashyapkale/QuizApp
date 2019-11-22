package com.secapp.quizapp;

public class Question {
    private int rsid;
    private boolean ans;
    private int imgid;

    public Question(int rsid, boolean ans,int imgid) {
        this.rsid = rsid;
        this.ans = ans;
        this.imgid=imgid;
    }

    public int getRsid() {
        return rsid;
    }

    public void setRsid(int rsid) {
        this.rsid = rsid;
    }

    public void setAns(boolean ans) {
        this.ans = ans;
    }

    public boolean getAns(){
        return ans;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgidid(int imgid) {
        this.imgid = imgid;
    }

}
