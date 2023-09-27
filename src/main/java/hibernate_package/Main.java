package hibernate_package;
//importing required packages
import java.util.List;

import javax.persistence.Query;

public class Main {

	public static void main(String[] args) {
        Sailor_interface sailor= new Sailor_interface_implement();
		//creating objects and assigning values
		Sailors s1 = new Sailors();
		s1.setSname("John");
		s1.setAge(21);
		s1.setExp(3);
		sailor.insertSailor(s1);
		
		Sailors s2 = new Sailors();
		s2.setSname("Ashok");
		s2.setAge(23);
		s2.setExp(4);
		sailor.insertSailor(s2);
		
		Sailors s3 = new Sailors();
		s3.setSname("Raja");
		s3.setAge(23);
		s3.setExp(2);
		sailor.insertSailor(s3);
		
		
		sailor.updateSailor(s1);
		
		
		sailor.selectSailors();
		
	}

}
