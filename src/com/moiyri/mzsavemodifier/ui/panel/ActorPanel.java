package com.moiyri.mzsavemodifier.ui.panel;

import com.moiyri.mzsavemodifier.ui.ModifierPanel;

import javax.swing.*;
import java.awt.*;

public class ActorPanel extends ModifierPanel {
    String arr[] = {"test1", "test2", "test3", "test3", "test3", "test3", "test3", "test3", "test3", "test3", "test3"};
    private JList actorList = new JList(arr);
    private JScrollPane actorListPane = new JScrollPane(actorList);
    public ActorPanel() {
        actorListPane.add(new JLabel("test"));
        Box upperBox = Box.createHorizontalBox();
        Box lowwerBox = Box.createHorizontalBox();
        setLayout(new GridLayout(2, 1));
        upperBox.add(actorList);
        this.add(upperBox);
        this.add(lowwerBox);
    }
}
