package com.compup;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainGUI 
{
	//Create the default containers
	private JFrame mainFrame = new JFrame("CompUp-Keep Your Computer Awake!");
	private JPanel contentPanel = new JPanel(new BorderLayout());
	private JPanel northPanel = new JPanel();
	private JPanel westPanel = new JPanel();
	private JPanel centerPanel = new JPanel();
	
	//Create a new header label
	private JLabel headerLabel = new JLabel("<html><div style='text-align: center;'> Please choose which key to simulate action<br>"
											+ " to keep your machine awake.<br><br></div></html>");
	//Create a the option buttons
	private JButton f15Button = new JButton("F15");
	private JButton f14Button = new JButton("F14");
	private JButton shift = new JButton("Shift");
	
	//Create a new label object
	private JLabel westLabelText = new JLabel("<html>Pick a key on the right.<br>"
			+ "The default is F15.</div></html>");
	
	/**
	 * the constructor for the MainGUI. Sets colors, visibility, and adds
	 * components
	 */
	public MainGUI()
	{
		//Set properties of the content panel
		contentPanel.setBackground(Color.lightGray);
		contentPanel.setPreferredSize(new Dimension(400, 200));
		
		//Set options for the main frame
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		mainFrame.setContentPane(contentPanel);
		mainFrame.setVisible(true);
		mainFrame.setResizable(false);
		
		
		//Add components to sub panels
		northPanel.add(headerLabel, BorderLayout.NORTH);
		westPanel.add(westLabelText);
		centerPanel.add(f15Button);
		centerPanel.add(f14Button);
		centerPanel.add(shift);
		
		//Add sub panels to content panel
		contentPanel.add(northPanel, BorderLayout.NORTH);
		contentPanel.add(westPanel, BorderLayout.WEST);
		contentPanel.add(centerPanel, BorderLayout.CENTER);
		
		mainFrame.pack();
		
	}

	//TODO: Everything! Next up: add more JPanels for organization for
	//both the buttons and labels in the GUI


}
