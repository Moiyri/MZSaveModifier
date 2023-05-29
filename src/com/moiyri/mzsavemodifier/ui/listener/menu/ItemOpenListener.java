package com.moiyri.mzsavemodifier.ui.listener.menu;

import com.moiyri.mzsavemodifier.ui.StatusBarPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemOpenListener implements ActionListener {
    private StatusBarPanel panel;
    public ItemOpenListener(StatusBarPanel panel) {
        this.panel = panel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int rVal = fileChooser.showOpenDialog(null);
        if(rVal == JFileChooser.APPROVE_OPTION) {
            //TODO
            String dir = fileChooser.getCurrentDirectory().toString();
            String name = fileChooser.getSelectedFile().getName();
            panel.setDirLabel(dir + "/" + name);
        } else if(rVal == JFileChooser.CANCEL_OPTION) {

        }
    }
}
