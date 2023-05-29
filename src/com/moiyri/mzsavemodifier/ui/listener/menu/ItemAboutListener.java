package com.moiyri.mzsavemodifier.ui.listener.menu;

import com.moiyri.mzsavemodifier.ui.dialogue.AboutDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemAboutListener implements ActionListener {
    private JFrame parent;
    public ItemAboutListener(JFrame parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JDialog aboutDialogue = new AboutDialog(parent);
//        parent.add(aboutDialogue);
        aboutDialogue.setVisible(true);
    }
}
