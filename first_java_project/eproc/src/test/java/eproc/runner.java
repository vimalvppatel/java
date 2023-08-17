package eproc;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class runner {

@Test (dataProvider="myDataProvider", dataProviderClass = dataprovider.class)
public void main(String data) {
	System.out.println(data);
	
}
	
}
