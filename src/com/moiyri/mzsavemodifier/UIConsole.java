package com.moiyri.mzsavemodifier;

import javax.swing.*;
import java.awt.*;

public class UIConsole {
    public static void run(final JFrame f, final String title, final int width, final int height) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                f.setTitle(title);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(width, height);
                f.setMinimumSize(new Dimension(width, height));
                f.setVisible(true);
            }
        });
    }
}
