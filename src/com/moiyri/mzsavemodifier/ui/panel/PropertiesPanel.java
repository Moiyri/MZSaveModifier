package com.moiyri.mzsavemodifier.ui.panel;

import com.moiyri.mzsavemodifier.ui.ModifierPanel;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PropertiesPanel extends ModifierPanel {
    public PropertiesPanel(int count) {
        this.createContents(count);
    }
    private Map<String, JTextField> properties = new HashMap<String, JTextField>();
    public void createContents(int count) {
        this.setLayout(new GridLayout(count,2));
    }

    public void addProperties(String pp) {
        JTextField jt = new JTextField();
        properties.put(pp, jt);
        this.add(new JLabel(pp));
        this.add(jt);
    }

    public Map<String, JTextField> getProperties() {
        return this.properties;
    }
}
