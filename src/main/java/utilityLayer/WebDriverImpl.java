package utilityLayer;

import java.time.Duration;

import baseLayer.BaseClass;
import iHelper.IwebDriver;

public class WebDriverImpl extends BaseClass implements IwebDriver{

	@Override
	public void get(String url) {
		getDriver().get(url);
	}

	@Override
	public void maximize() {
		getDriver().manage().window().maximize();
	}

	@Override
	public void implicitelyWait(Duration Duration) {
		getDriver().manage().timeouts().implicitlyWait(Duration);		
	}

	@Override
	public void pageLoadTimeout(Duration Duration) {
		getDriver().manage().timeouts().pageLoadTimeout(Duration);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return getDriver().getTitle();
	}

	@Override
	public String getCurrentTitile() {
		// TODO Auto-generated method stub
		return getDriver().getCurrentUrl();
	}

	@Override
	public void close() {
		getDriver().close();
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		getDriver().quit();
	}
}
