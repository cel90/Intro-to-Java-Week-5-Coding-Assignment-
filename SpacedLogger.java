
public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) {
		log = log.replaceAll("", " ") ; 
		System.out.println(log) ;
		
		
	}

	@Override
	public void Error(String error) {
		error = error.replaceAll("", " ") ; 
		System.out.println("ERROR: " + error) ;
		
		
	}

}
