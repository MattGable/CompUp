package com.compup;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainGUI 
{
	//Create the default containers
	private JFrame mainFrame = new JFrame("Main GUI Panel");
	private JPanel contentPanel = new JPanel();
	private JPanel topLabelPanel = new JPanel();
	private JPanel bottomButtonPanel = new JPanel();
	//Create a button object
	private JButton button1 = new JButton();		
	//Create a new label object
	private JLabel label1 = new JLabel("Main Label!");
	
	/**
	 * the constructor for the MainGUI. Sets colors, visibility, and adds
	 * components
	 */
	public MainGUI()
	{
		contentPanel.setBackground(Color.lightGray);
		contentPanel.setPreferredSize(new Dimension(200, 200));
			
		mainFrame.setContentPane(contentPanel);

			
		mainFrame.setVisible(true);

		contentPanel.add(topLabelPanel);
		contentPanel.add(bottomButtonPanel);
		//Add a label to the Label panel
		topLabelPanel.add(label1);
		//Add a button to the Button panel
		bottomButtonPanel.add(button1);
		
		mainFrame.pack();
		
	}
	
	//TODO: Everything! Next up: add more JPanels for organization for
	//both the buttons and labels in the GUI


}
