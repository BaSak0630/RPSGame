package RPS.model;

import java.awt.*;
import java.util.*;

public class RPSModel {
    ArrayList<RPSObject> rpsObjects = new ArrayList<>();
    RPSObject tmp;
    public RPSModel() {
    }

    public void setNumberRPSObject(int numOfRock, int numOfPaper, int numOfScissors) {
        for (int i = 0; i < numOfRock; i++) {
            tmp  = new RPSObject("rock");
            rpsObjects.add(tmp);
        }
        for (int i = 0; i < numOfPaper; i++) {
            tmp  = new RPSObject("paper");
            rpsObjects.add(tmp);
        }
        for (int i = 0; i < numOfScissors; i++) {
            tmp  = new RPSObject("scissors");
            rpsObjects.add(tmp);
        }
    }

    public void paintRPS(Graphics g){

    }

}
