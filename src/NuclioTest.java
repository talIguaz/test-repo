import io.nuclio.Context;
import io.nuclio.Event;
import io.nuclio.EventHandler;
import io.nuclio.Response;

public class NuclioTest implements EventHandler {

	@Override
	public Response handleEvent(Context context, Event event) {
		context.getLogger().infoWith("in nuclio function", "body", "in function");
		
		HelloWorld helloWorld = new HelloWorld();
		
		return new Response().setBody(helloWorld.testCall());
	}
}
