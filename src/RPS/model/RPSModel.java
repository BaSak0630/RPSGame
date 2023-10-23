package RPS.model;

import RPS.gui.MainView;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.*;

public class RPSModel {
    ArrayList<RPSObject> rpsObjects = new ArrayList<>();
    RPSObject tmp;
    MainView mainView;
    public RPSModel(MainView mainView) {
        this.mainView =mainView;
    }

    public void setNumberRPSObject(int numOfRock, int numOfPaper, int numOfScissors) {
        for (int i = 0; i < numOfRock; i++) {
            tmp  = new RPSObject("rock",0,0);
            rpsObjects.add(tmp);
        }
        for (int i = 0; i < numOfPaper; i++) {
            tmp  = new RPSObject("paper",10,10);
            rpsObjects.add(tmp);
        }
        for (int i = 0; i < numOfScissors; i++) {
            tmp  = new RPSObject("scissors",20,20);
            rpsObjects.add(tmp);
        }
        System.out.println(rpsObjects);
    }

    public void paintRPS(Graphics g){
        for (int i = 0; i < rpsObjects.size(); i++) {
            RPSObject tmp = rpsObjects.get(i);
            //g.drawImage(tmp.img,10*i,10*i,10,10,mainView);
            g.drawRect(10 * i, 10 * i, 10, 10);
        }
    }

    public boolean overCheck(){
        boolean flag = true;
        int standadType = rpsObjects.get(0).type;
        for (int i = 0; i < rpsObjects.size(); i++) {
            if(standadType != rpsObjects.get(i).type){
                return false;
            }
        }
        return flag;
    }


}
