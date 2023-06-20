package manager;
import manager.repository.Repository;
import manager.repository.impl.*;

public class MyApp {

	public static void main(String[] args) throws Exception {
		
		
		//만약에 디비 리퐇ㅈ;털; 시여ㅛㅇ하고 싶다
		Repository rep = new DBRepository();
		
		Repository repCollection =  new CollectionRepository();
		
		rep.rowCount();
		repCollection.rowCount();
		

	}

}
