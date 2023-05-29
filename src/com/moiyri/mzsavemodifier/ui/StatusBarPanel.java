package com.moiyri.mzsavemodifier.ui;

import javax.swing.*;

public class StatusBarPanel extends JPanel {
    private JLabel fileLabel;
    private JLabel dirLabel;
    public StatusBarPanel() {
        super();
        createContents();
    }

    public void createContents() {
        this.fileLabel = new JLabel("File:");
        this.dirLabel = new JLabel("No File Loaded");

        this.add(fileLabel);
        this.add(dirLabel);
    }

    public void setDirLabel(String txt) {
        this.dirLabel.setText(txt);
    }
}
