package edu.etime.ssmtest.pojo;

import java.io.Serializable;

public class test implements Serializable {
    private String testid;

    private String testpwd;

    private String testname;

    private static final long serialVersionUID = 1L;

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

    public String getTestpwd() {
        return testpwd;
    }

    public void setTestpwd(String testpwd) {
        this.testpwd = testpwd;
    }

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }
}