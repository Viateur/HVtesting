package UtilPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {
    private static final Logger LOGGER = LoggerFactory.getLogger(Log.class);
    public  static void info(String message){
        LOGGER.info (message);
    }

}
