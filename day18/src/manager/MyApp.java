package manager;
import manager.repository.Repository;
import manager.repository.impl.*;

public class MyApp {

	public static void main(String args[]) throws Exception {

		// 만약에 DBRepository를 사용하고 싶다 

		Repository rep = new DBRepository();

		// 만약에 CollectionRepository를 사용하고 싶다. 
		Repository repCollection = new CollectionRepository(); 

		rep.rowCount();
		repCollection.rowCount(); 

	}

}