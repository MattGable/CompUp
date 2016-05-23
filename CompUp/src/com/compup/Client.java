package com.compup;

/**
 * creates an instance of the main GUI.
 * @author Matt
 * @version 0.1
 *
 */
public class Client 
{
	
	public static void main(String[] args) 
	{
		MainGUI newGUI = new MainGUI();
		newGUI.startServices();
		newGUI.initializeListeners();
	}

}
