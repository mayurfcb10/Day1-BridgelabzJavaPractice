package com.javapractice;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import jdk.internal.org.jline.utils.Log;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        String message = "Helloworld";
        LOG.debug(message + " Will be printed on Debug");
        LOG.info(message + " Will be printed on Info");
        LOG.warn(message + " Will be printed on Warn");
        LOG.error(message + " Will be printed on Error");
        LOG.fatal(message + " Will be printed on Fatal");
        LOG.info("Appending String: {},"+ message);
        System.out.println(message);
    }
}
