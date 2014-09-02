package com.sinaapp.expr3d;

import org.apache.logging.log4j.LogManager;  
import org.apache.logging.log4j.Logger;  

public class AppException extends RuntimeException {
	static Logger logger = LogManager.getLogger();
	AppException(String message){
		super(message);
		logger.error(message);
	}
}
