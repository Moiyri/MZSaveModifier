package com.moiyri.mzsavemodifier.ui;

import com.moiyri.mzsavemodifier.ui.panel.*;

import javax.swing.*;
import java.awt.*;

public class ModifierUI extends JFrame {
    private JPanel mainPanel = new JPanel(new GridLayout(1, 1));
    private JTabbedPane modifierTab = new JTabbedPane();
    private StatusBarPanel statusBarPanel = new StatusBarPanel();
    private PlayerPanel playerPanel = new PlayerPanel();
    private ActorPanel actorPanel = new ActorPanel();
    private VariablePanel variablePanel = new VariablePanel();
    private SwitchPanel switchPanel = new SwitchPanel();
    private ScenePanel scenePanel = new ScenePanel();
    private Menu mainMenu = new Menu(this);

    public ModifierUI() {
//        setLayout(new GridLayout(2, 1));

        Box mainBox = Box.createVerticalBox();

        this.loadStatus();
        this.loadAllTags();

        mainBox.add(statusBarPanel);
        mainBox.add(mainPanel);

        this.add(mainBox);


//        this.add(mainPanel);
//        this.setContentPane(modifierTab);
        this.setJMenuBar(mainMenu.getMenu());
    }

    private void loadAllTags() {
        this.modifierTab.add("Player", playerPanel);
        this.modifierTab.add("Actor", actorPanel);
        this.modifierTab.add("Variable", variablePanel);
        this.modifierTab.add("Switch", switchPanel);
        this.modifierTab.add("Scene", scenePanel);
        this.mainPanel.add(modifierTab);
    }

    private void loadStatus() {
        this.add(statusBarPanel);
    }

    public StatusBarPanel getStatusBarPanel() {
        return this.statusBarPanel;
    }

}
