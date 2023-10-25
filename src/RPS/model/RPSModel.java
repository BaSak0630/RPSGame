package RPS.model;

import RPS.gui.MainView;

import java.awt.*;
import java.util.*;

public class RPSModel {
    public ArrayList<RPSObject> rpsObjects;
    RPSObject tmp;
    MainView mainView;
    Random random = new Random();
    Graphics g;
    public RPSModel(MainView mainView,Graphics g) {
        this.mainView =mainView;
        this.g = g;
        rpsObjects = new ArrayList<>();
    }

    public void setNumberRPSObject(int numOfRock, int numOfPaper, int numOfScissors) {
        for (int i = 0; i < numOfRock; i++) {
            tmp  = new RPSObject(g,"rock",random.nextInt(mainView.mainFrame.getFrameWidth()),random.nextInt(mainView.mainFrame.getFrameHeight()),mainView);
            rpsObjects.add(tmp);
        }
        for (int i = 0; i < numOfPaper; i++) {
            tmp  = new RPSObject(g,"paper",random.nextInt(mainView.mainFrame.getFrameWidth()),random.nextInt(mainView.mainFrame.getFrameHeight()),mainView);
            rpsObjects.add(tmp);
        }
        for (int i = 0; i < numOfScissors; i++) {
            tmp  = new RPSObject(g,"scissors",random.nextInt(mainView.mainFrame.getFrameWidth()),random.nextInt(mainView.mainFrame.getFrameHeight()) ,mainView);
            rpsObjects.add(tmp);
        }
        System.out.println(rpsObjects);
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
