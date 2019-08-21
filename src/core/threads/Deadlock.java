package core.threads;

public class Deadlock
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println(Runtime.getRuntime().availableProcessors());
		Thread.currentThread().join();
		System.out.println("DEADLOCK");
	}
}
