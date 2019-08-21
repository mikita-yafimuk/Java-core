package core.threads;

public class WNNA
{
	public static void main(String[] args) throws InterruptedException
	{
		final Object ref = new Object();
		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				synchronized (ref)
				{
					System.out.println("RUN: wait...");
					try
					{
						ref.wait();
					}
					catch (InterruptedException ignore)
					{/*NOP*/}
					System.out.println("RUN: thanks!");
				}
			}
		}).start();
		System.out.println("MAIN: sleep...");
		Thread.sleep(2_000);
		System.out.println("MAIN: sleep!");
		System.out.println("MAIN: notify");
		synchronized (ref)
		{
			ref.notify();
		}
	}
}
