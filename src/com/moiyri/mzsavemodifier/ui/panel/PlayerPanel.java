package com.moiyri.mzsavemodifier.ui.panel;

import com.moiyri.mzsavemodifier.ui.ModifierPanel;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends ModifierPanel {

    protected void createContents() {
        Box hBox1 = Box.createVerticalBox();
        Box hBox2 = Box.createVerticalBox();
        Component hGlue = Box.createVerticalGlue();
        Component hGlue3 = Box.createVerticalGlue();
        PropertiesPanel propertiesPanel1 = new PropertiesPanel(15);
        PropertiesPanel propertiesPanel2 = new PropertiesPanel(15);
//        PropertiesPanel propertiesPanel3 = new PropertiesPanel();
        this.setLayout(new GridLayout(1, 4));
        hBox1.add(propertiesPanel1);
        hBox2.add(propertiesPanel2);
        this.add(hBox1);
        this.add(hGlue);
        this.add(hBox2);
        this.add(hGlue3);
//        this.add(propertiesPanel3);
    }
}
