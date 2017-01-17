package trasher.view;

import javax.swing.*;

/**
 * Created by fatfcuk on 15.01.17.
 */


public class BotPanel extends JPanel {

    private JTextArea logArea;
    private JProgressBar progressBar;

    public BotPanel(){

            logArea = new JTextArea(30,30);
            progressBar = new JProgressBar();
                progressBar.setValue(30);
                progressBar.setStringPainted(true);

            add(logArea);
            add(progressBar);

    }

}
