package iHelper;

import java.time.Duration;

public interface IwebDriver {
	void get(String url);
	
	void maximize();
	
	void implicitelyWait(Duration Duration);
	void pageLoadTimeout(Duration Duration);
	
	String getTitle();
	
	String getCurrentTitile();
	
	void close();
	void quit();

}
