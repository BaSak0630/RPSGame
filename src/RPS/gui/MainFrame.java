package RPS.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
    public StratDialog stratDialog;
    public MainView mainView;
    private int screenHeight;
    private int screenWidth;
    private int frameHeight;
    private int frameWidth;

    public MainFrame() {
        this.setVisible(false);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        screenHeight = d.height;
        screenWidth = d.width;
        frameHeight = screenHeight - screenHeight / 4;
        frameWidth = screenWidth/2;
        setSize(frameWidth, frameHeight);
        setLocation((screenWidth - frameWidth) / 2, (screenHeight - frameHeight) / 2);
        setTitle("RPS");

        mainView = new MainView(this);
        add(mainView);

        stratDialog = new StratDialog(this,mainView);
        stratDialog.setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public int getScreenHeight() {
        return screenHeight;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public int getFrameHeight() {
        return frameHeight;
    }

    public int getFrameWidth() {
        return frameWidth;
    }
}
