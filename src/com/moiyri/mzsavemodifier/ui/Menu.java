package com.moiyri.mzsavemodifier.ui;

import com.moiyri.mzsavemodifier.ui.listener.menu.*;

import javax.swing.*;

public class Menu {
    private JMenuBar menu = new JMenuBar();
    private ModifierUI mainFrame;
    public Menu(ModifierUI mainFrame){
        this.mainFrame = mainFrame;
        this.createContents();
    }

    public JMenuBar getMenu() {
        return this.menu;
    }

    public void createContents() {
        JMenu menuFile = new JMenu("File");
        JMenu menuHelp = new JMenu("Help");

        JMenuItem itemOpen = new JMenuItem("Open");
        JMenuItem itemSave = new JMenuItem("Save");
        JMenuItem itemSaveAs = new JMenuItem("Save As");
        JMenuItem itemQuit = new JMenuItem("Quit");
        JMenuItem itemAbout = new JMenuItem("About");

        menuFile.add(itemOpen);
        menuFile.add(itemSave);
        menuFile.add(itemSaveAs);
        menuFile.addSeparator();
        menuFile.add(itemQuit);

        menuHelp.add(itemAbout);

        itemOpen.addActionListener(new ItemOpenListener(this.mainFrame.getStatusBarPanel()));
        itemSave.addActionListener(new ItemSaveListener());
        itemSaveAs.addActionListener(new ItemSaveAsListener());
        itemQuit.addActionListener(new ItemQuitListener(this.mainFrame));
        itemAbout.addActionListener(new ItemAboutListener(this.mainFrame));

        this.menu.add(menuFile);
        this.menu.add(menuHelp);
    }
}
