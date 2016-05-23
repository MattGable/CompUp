package com.compup;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainGUI 
{
	//Create the default containers
	private JFrame mainFrame = new JFrame("Main GUI Panel");
	private JPanel contentPanel = new JPanel(new BorderLayout());
	private JPanel northPanel = new JPanel();
	private JPanel westPanel = new JPanel();
	private JPanel centerPanel = new JPanel();
	//Create a new header label
	private JLabel headerLabel = new JLabel("Please choose which key to simulate action \n"
											+ "to keep your machine awake.");
	//Create a button object
	private JButton button1 = new JButton("Button!");		
	//Create a new label object
	private JLabel label1 = new JLabel("Main Label!");
	
	/**
	 * the constructor for the MainGUI. Sets colors, visibility, and adds
	 * components
	 */
	public MainGUI()
	{
		contentPanel.setBackground(Color.lightGray);
		contentPanel.setPreferredSize(new Dimension(600, 200));
			
		mainFrame.setContentPane(contentPanel);
			
		mainFrame.setVisible(true);
		
		contentPanel.add(northPanel, BorderLayout.NORTH);

		//Add label to header
		northPanel.add(headerLabel, BorderLayout.NORTH);
		//Add a label to the Label panel
		westPanel.add(label1);
		//Add a button to the Button panel
		centerPanel.add(button1);
		
		contentPanel.add(westPanel, BorderLayout.WEST);
		contentPanel.add(centerPanel, BorderLayout.CENTER);
		
		mainFrame.pack();
		
	}
	
	//TODO: Everything! Next up: add more JPanels for organization for
	//both the buttons and labels in the GUI


}
