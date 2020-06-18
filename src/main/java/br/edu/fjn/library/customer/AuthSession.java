package br.edu.fjn.library.customer;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;

@SessionScoped
public class AuthSession implements Serializable {

    private boolean islog;
    private String userName;

    public boolean isLog() {
        System.out.println("isLogged " + islog);
        return isLog();
    }

    public void setIsLog(boolean isLog) {
        this.islog = isLog;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void signout(){
        this.islog = false;
        this.userName = null;
    }
}