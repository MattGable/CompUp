package com.compup;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * MainGUI is the base class that contains the GUI components and most of the 
 * logic for the application.
 * @author Matt
 * @version 0.1
 */
public class MainGUI 
{
	//Create the default containers
	private JFrame mainFrame = new JFrame("==CompUp==Keep Your Computer Awake!");
	private JPanel contentPanel = new JPanel(new BorderLayout());
	private JPanel northPanel = new JPanel();
	private JPanel southPanel = new JPanel();
	private JPanel westPanel = new JPanel();
	private JPanel centerPanel = new JPanel();
	
	//Create a new header label
	private JLabel headerLabel = new JLabel("<html><div style='text-align: center;'>" 
											+ "Please choose a key to be virtually pressed every<br>"
											+ "59 seconds to keep your machine awake.<br>"
											+ "NOTE: 'a' is for testing and is probably not useful.<br></div></html>");
	//Create a the option buttons
	private JButton f15Button = new JButton("F15");
	private JButton f14Button = new JButton("F14");
	private JButton shift = new JButton("Shift");
	private JButton a = new JButton("a");

	//Create a new label object
	private JLabel westLabelText = new JLabel("<html>Pick a key on the right.<br>"
			+ "The default is F15.</html>");
	
	//Create a new text field
	private JTextField textField = new JTextField();
	
	//Current chosen key
	private String chosenKey = "f15";
	

	
	
	/**
	 * the constructor for the MainGUI. Sets colors, visibility, and adds
	 * components.
	 */
	public MainGUI ()
	{
		//Set properties of the content panel
		contentPanel.setPreferredSize(new Dimension(400, 200));
		
		//Set options for the main frame
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		mainFrame.setContentPane(contentPanel);
		mainFrame.setVisible(true);
		mainFrame.setResizable(false);
		
		//Configure components
		textField.setColumns(20);
		
		northPanel.setBackground(new Color(119, 172, 202));
		westPanel.setBackground(new Color(183, 205, 215));
		southPanel.setBackground(new Color(239, 245, 249));
		centerPanel.setBackground(new Color(215, 231, 240));
		
		//Add components to sub panels
		northPanel.add(headerLabel, BorderLayout.NORTH);
		westPanel.add(westLabelText);
		southPanel.add(textField);
		centerPanel.add(f15Button);
		centerPanel.add(f14Button);
		centerPanel.add(shift);
		centerPanel.add(a);
		
		//Add sub panels to content panel
		contentPanel.add(northPanel, BorderLayout.NORTH);
		contentPanel.add(westPanel, BorderLayout.WEST);
		contentPanel.add(southPanel, BorderLayout.SOUTH);
		contentPanel.add(centerPanel, BorderLayout.CENTER);
		
		mainFrame.pack();
	}
	
	/**
	 * contains the definition of runnable code and schedules the 
	 * simulated key presses that keep the computer awake.
	 */
	public void startServices ()
	{
		//Create the runnable code for the scheduled task
		Runnable runnable = new Runnable()
		{
			public void run()
			{
				GUIBot guiBot = new GUIBot();
				textField.setText("This text field is currently only for testing.");
				//textField.setText(textField.getText() + chosenKey);
				guiBot.keyPress(chosenKey);
			}
		};
		
		//Create the scheduled service that will simulate a key press
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(runnable, 0, 59, TimeUnit.SECONDS);
	}
	
	/**
	 * adds the listeners for the buttons in the program.
	 */
	public void initializeListeners ()
	{
		//Create action listeners for the buttons
		f15Button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				chosenKey = "f15";
			}
		});
		
		f14Button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				chosenKey = "f14";
			}
		});
		
		shift.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				chosenKey = "shift";
			}
		});
		
		a.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				chosenKey = "a";
			}
		});
	}
}
