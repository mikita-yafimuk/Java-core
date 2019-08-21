package core.threads.simplythread;

public class SimpleThreadExt extends Thread
{

	@Override
	public void run()
	{
		try
		{
			long pause = Math.round(Math.random() * 2000);
			Thread.sleep(pause);
			System.out.println("Simple Thread - pause = " + pause);
		}
		catch (InterruptedException e)
		{

		}
	}
}
