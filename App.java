
public class App {

	public static void main(String[] args) {
		Logger LGR = new AsteriskLogger() ;
         LGR.Log("CHOUAIB") ; 
         LGR.Error("CHOUAIB") ; 
         Logger LGR2 = new SpacedLogger () ; 
         LGR2.Log("AMERICA");
         LGR2.Error("AMERICA");
	}

}
