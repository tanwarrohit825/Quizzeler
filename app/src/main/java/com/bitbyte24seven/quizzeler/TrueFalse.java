package com.bitbyte24seven.quizzeler;

public class TrueFalse {

    private  int qution;
    private  boolean ans;

    public TrueFalse(int qution ,boolean ans) {
        this.qution = qution;
        this.ans = ans;
    }

    public int getQution() {
        return qution;
    }

    public void setQution(int qution) {
        this.qution = qution;
    }

    public boolean isAns() {
        return ans;
    }

    public void setAns(boolean ans) {
        this.ans = ans;
    }
}
