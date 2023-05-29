package com.moiyri.mzsavemodifier;

import com.moiyri.mzsavemodifier.ui.ModifierUI;

import javax.swing.*;

public class MZSaveModifier{
    public static final String TITLE = "MZSaveModifier";

    public static final JFrame ModifierUIFrame = new ModifierUI();
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        UIConsole.run(ModifierUIFrame, TITLE, 816, 624);
    }
}