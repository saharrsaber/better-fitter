/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

import java.util.ArrayList;

/**
 *
 * @author Sara-Labtop
 */
public class chat {
    String id,pid;
    private  ArrayList<String> msgs=new ArrayList<String>();
    
    public chat(String id){
        this.id=id;
        pid=" ";
    }
    public ArrayList<String> getMsgs() {
        return msgs;
    }
    public void sendmsg(String m){
        msgs.add(m);
    }
    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
 }
