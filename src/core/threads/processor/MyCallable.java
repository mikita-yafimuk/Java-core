package core.threads.processor;

import java.util.concurrent.Callable;

class MyCallable implements Callable<Long>
{

	@Override
	public Long call() throws Exception
	{
		Processor p = new Processor();
		return p.process();
	}
}
