package Search;

import org.apache.log4j.*;

public class LogClass {

	public static Logger log=Logger.getLogger(LogClass.class);
	
	public static void main(String[] args) {
		log.setLevel(Level.WARN);
		
		log.trace("this is trace");
		log.debug("this is debug");
		log.info("this is info");
		log.warn("this is warn message");
		log.fatal("this is fatal message");
		log.error("this is error message");
	}
}
