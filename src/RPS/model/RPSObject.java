package RPS.model;

import RPS.gui.MainView;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RPSObject extends Thread implements Runnable{
    static final int ROCK = 1;
    static final int PAPER = 2;
    static final int SCISSORS = 3;

    public int x;
    public int y;
    protected int xSpeed = 5;
    protected int ySpeed = 5;
    protected int xBoundary;
    protected int yBoundary;
    protected Graphics g;

    MainView mainView;

    public int getType() {
        return type;
    }

    int type;
    public ImageIcon rockIcon = new ImageIcon("paper.png");
    public ImageIcon paperIcon = new ImageIcon("rock.png");
    public ImageIcon scissorsIcon = new ImageIcon("scissors.png");

    public RPSObject(Graphics g, String type, int startX, int startY,MainView mainView) {
        this.g = g;
        this.start();
        this.mainView = mainView;
        /*xBoundary = mainView.getWidth();
        yBoundary = mainView.getHeight();*/
        xBoundary = mainView.mainFrame.getFrameWidth() -28;
        yBoundary = mainView.mainFrame.getFrameHeight()-50;
        x = startX;
        y = startY;
        Random a = new Random();
        if (a.nextBoolean()) {
            xSpeed = xSpeed * -1;
        }
        if (a.nextBoolean()) {
            ySpeed = ySpeed * -1;
        }

        if(type.equals("rock")){
            this.type = ROCK;
        } else if (type.equals("paper")) {
            this.type = PAPER;
        } else if (type.equals("scissors")) {
            this.type = SCISSORS;
        }
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
                "type = " + typeStr +","+ "x = "+ x + ", y = "+y+
                "}";
    }
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(this);
                if(x > xBoundary){
                    xSpeed = xSpeed * -1;
                }
                if (y > yBoundary) {
                    ySpeed = ySpeed * -1;
                }
                if(x < 0){
                    xSpeed = xSpeed * -1;
                }
                if (y < 0) {
                    ySpeed = ySpeed * -1;
                }
                x = x + xSpeed;
                y = y + ySpeed;
                mainView.repaint();
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
