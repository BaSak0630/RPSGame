package RPS.gui;

import RPS.model.RPSModel;
import RPS.model.RPSObject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StratDialog extends JDialog {
    RPSModel model;

    MainFrame parentsFrame;
    MainView parentsView;

    int dialogWight;
    int dialogHeight;

    JLabel rockLabel = new JLabel("Rock");
    JLabel paperLabel = new JLabel("Paper");
    JLabel scissorsLabel = new JLabel("Scissors");
    JTextField rockTextField = new JTextField("1");
    JTextField paperTextField = new JTextField("1");
    JTextField scissorsTextField = new JTextField("1");
    JLabel label = new JLabel("start");
    JButton startBut = new JButton("start");

    public StratDialog(MainFrame mainFrame,MainView mainView) {
        parentsFrame = mainFrame;
        parentsView = mainView;
        dialogWight = parentsFrame.getScreenWidth() / 5;
        dialogHeight = parentsFrame.getScreenHeight() / 5;
        setTitle("RPS");
        setSize(dialogWight, dialogHeight);
        setLocation((parentsFrame.getScreenWidth() - dialogWight) / 2, (parentsFrame.getScreenHeight()  - dialogHeight) / 2);

        setLayout(new GridLayout(4, 2));

        rockLabel.setSize(10, 10);
        add(rockLabel);
        rockTextField.setSize(10, 10);
        add(rockTextField);

        paperLabel.setSize(10, 10);
        add(paperLabel);
        paperTextField.setSize(10, 10);
        add(paperTextField);

        scissorsLabel.setSize(10, 10);
        add(scissorsLabel);
        scissorsTextField.setSize(10, 10);
        add(scissorsTextField);

        add(label);
        startBut.setSize(10, 10);
        add(startBut);

        startBut.addActionListener(e1 -> {
            try {
                int rock = Integer.parseInt(rockTextField.getText().trim());
                int paper = Integer.parseInt(paperTextField.getText().trim());
                int scissors = Integer.parseInt((scissorsTextField.getText().trim()));

                parentsView.getModel().setNumberRPSObject(rock,paper,scissors);
                mainFrame.setVisible(true);
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "다시 입력해주세요",
                        "숫자를 입력해주세요", JOptionPane.PLAIN_MESSAGE);
            }
        });

        //닫기
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }
}
