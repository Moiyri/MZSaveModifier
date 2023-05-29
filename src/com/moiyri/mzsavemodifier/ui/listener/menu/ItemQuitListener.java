package com.moiyri.mzsavemodifier.ui.listener.menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemQuitListener implements ActionListener {
    private JFrame parent;
    public ItemQuitListener(JFrame parent) {
        this.parent = parent;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.parent.dispose();
    }
}
