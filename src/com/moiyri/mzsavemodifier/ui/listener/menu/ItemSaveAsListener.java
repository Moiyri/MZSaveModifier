package com.moiyri.mzsavemodifier.ui.listener.menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemSaveAsListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int rVal = fileChooser.showSaveDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) {
            //TODO
        } else if (rVal == JFileChooser.CANCEL_OPTION) {

        }
    }
}
