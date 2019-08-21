package core.threads;

public class Random
{

	private static final int LOOP_COUNT = 10_000_000;
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException
	{
		Thread t0 = new Thread(() -> {
			for (int i = 0; i < LOOP_COUNT; i++)
			{
				counter++;
			}
		});
		t0.run();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < LOOP_COUNT; i++)
			{
				counter++;
			}
		});
		t1.run();

		t0.join();
		t1.join();

		System.out.println(counter);
	}

	public synchronized static void inc()
	{
		counter++;
	}
}
