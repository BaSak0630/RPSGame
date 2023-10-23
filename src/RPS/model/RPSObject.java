package RPS.model;

import javax.swing.*;
import java.awt.*;

public class RPSObject {
    static final int ROCK = 1;
    static final int PAPER = 2;
    static final int SCISSORS = 3;

    int x;
    int y;

    RPSThread thread;
    int type;
    ImageIcon rockIcon = new ImageIcon("paper.RPS.png");
    ImageIcon paperIcon = new ImageIcon("rock.RPS.png");
    ImageIcon scissorsIcon = new ImageIcon("scissors.RPS.png");
    Image img;
    public RPSObject(String type,int startX,int startY) {
        x = startX;
        y = startY;
        if(type.equals("rock")){
            this.type = ROCK;
            img = rockIcon.getImage();
        } else if (type.equals("paper")) {
            this.type = PAPER;
            img = paperIcon.getImage();
        } else if (type.equals("scissors")) {
            this.type = SCISSORS;
            img = scissorsIcon.getImage();
        }
        thread= new RPSThread();
    }
    @Override
    public String toString() {
        String typeStr = "";
        if (type == 1) {
            typeStr = "rock";
        } else if (type == 2) {
            typeStr = "paper";
        } else if (type == 3) {
            typeStr = "scissors";
        }
        return "RPSObject{" +
                "type = " + typeStr +
                "}";
    }
}
