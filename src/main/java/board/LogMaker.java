package board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogMaker {
	private Logger log;

	public LogMaker() {
		this.log = LoggerFactory.getLogger(this.getClass());
	}

	public Logger getLog() {
		return log;
	}

}
