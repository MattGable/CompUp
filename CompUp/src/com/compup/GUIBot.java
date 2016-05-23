package com.compup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class GUIBot 
{
	Robot bot;
	
	public GUIBot()
	{
		try
		{
			bot = new Robot();
		}
		catch (AWTException awt)
		{
			awt.printStackTrace();
		}
	}
	
	public void keyPress (String inputKey)
	{
		if (inputKey.equals("f15"))
		{
			bot.keyPress(KeyEvent.VK_F15);
			bot.keyRelease(KeyEvent.VK_F15);
		}
		else if (inputKey.equals("f14"))
		{
			bot.keyPress(KeyEvent.VK_F14);
			bot.keyRelease(KeyEvent.VK_F14);
		} 
		else if (inputKey.equals("shift"))
		{
			bot.keyPress(KeyEvent.VK_SHIFT);
			bot.keyRelease(KeyEvent.VK_SHIFT);
		}
		else if (inputKey.equals("a"))
		{
			bot.keyPress(KeyEvent.VK_A);
			bot.keyRelease(KeyEvent.VK_A);
		}
	}
}
