package com.moiyri.mzsavemodifier.ui.listener.dialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutDialogOKListener implements ActionListener {
    private JDialog dialog;
    public AboutDialogOKListener(JDialog dialog) {
        this.dialog = dialog;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dialog.dispose();
    }
}
