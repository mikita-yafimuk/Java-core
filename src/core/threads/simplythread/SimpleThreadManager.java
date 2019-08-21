package core.threads.simplythread;

public class SimpleThreadManager
{

	public static void main(String[] arg)
	{

		for (int i = 0; i < 5; i++)
		{
			Thread threadExt = new SimpleThreadExt();
			threadExt.start();
		}

		for (int i = 0; i < 5; i++)
		{
			Thread threadImpl = new Thread(new SimpleThreadImpl());
			threadImpl.start();
		}

		Thread t = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				for (int i = 0; i < 5; i++)
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
		});

		System.out.println("______");
		t.start();
	}
}
