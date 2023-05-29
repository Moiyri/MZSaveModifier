package com.moiyri.mzsavemodifier.ui.dialogue;

import com.moiyri.mzsavemodifier.ui.listener.dialog.AboutDialogOKListener;

import javax.swing.*;
import java.awt.*;

public class AboutDialog extends JDialog {
    public AboutDialog(JFrame parent) {

        super(parent, "About", true);
        this.setSize(200, 100);
        this.setMinimumSize(new Dimension(200, 100));
        this.setMaximumSize(new Dimension(200, 100));
        this.setLayout(new GridLayout(2,1));
        JLabel author  = new JLabel("Made By Moiyri");
        JButton ok = new JButton("OK");

        ok.addActionListener(new AboutDialogOKListener(this));
        this.add(author);
        this.add(ok);
    }
}
