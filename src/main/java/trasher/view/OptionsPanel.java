package trasher.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by fatfcuk on 15.01.17.
 */
public class OptionsPanel extends JPanel{

    private JCheckBox deleteAllFriends;
    private JCheckBox unlikeAll;
    private JCheckBox tightSecurity;
    private JCheckBox deleteAllPhotos;
    private JCheckBox setRandomPassword;
    private JCheckBox setRandomData;

    private JButton runButton;


    public OptionsPanel(){

            setLayout(new GridLayout());

            deleteAllFriends = new JCheckBox("delete friends");
                deleteAllFriends.setToolTipText(
                        "This function deletes all of your friends. You won't be able to undone this action."
                );
            unlikeAll = new JCheckBox("unlike all");
                unlikeAll.setToolTipText(
                        "This function unlikes all of your likes. You wont be able to undone this action."
                );
            tightSecurity = new JCheckBox("tighten security");
                tightSecurity.setToolTipText(
                        "Tighting security."
                );
            deleteAllPhotos = new JCheckBox("delete photos");
                deleteAllPhotos.setToolTipText(
                        "This function deletes all photos. You wont be able to undone this action."
                );
            setRandomPassword = new JCheckBox("random password");
                setRandomPassword.setToolTipText(
                        "This function generates and sets random password for your account"
                );
            setRandomData = new JCheckBox("random data");
                setRandomData.setToolTipText(
                        "Set random name, address etc."
                );
            runButton = new JButton("run");


            add(deleteAllFriends);
            add(unlikeAll);
            add(tightSecurity);
            add(deleteAllPhotos);
            add(setRandomPassword);
            add(setRandomData);

            add(runButton);


    }
}
