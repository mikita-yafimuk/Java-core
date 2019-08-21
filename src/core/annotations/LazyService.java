package core.annotations;

@Service(name = "Service Lazy")
public class LazyService
{
	@Init
	public void lazyInit() throws Exception
	{
		System.out.println("lazyInit() from LazyService invoked");
	}
}
