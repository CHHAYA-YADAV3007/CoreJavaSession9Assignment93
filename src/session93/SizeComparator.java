/**
 * SizeComparator.java 1.1  28-Aug-2017
 */
//package declaration
package session93;

//importing java.util package to use ArrayList class of Collection framework

import java.util.*;
/**
 * This class defines comparison logic based on the age.
 * This class implements Comparator Interface and provides definition for compare method.
 * 
 *  If size of first object is greater than the second, we are returning positive value.
 *  If size of first object is less than the second object, we are returning negative value.
 *  If size of both objects are equal, we are returning 0.
 *  
 *  Version 1.1
 *  
 * @author chhaya yadav
 * 
 * Compiled on 28-Aug-2017
 *
 */

//public class declaration

public class SizeComparator implements Comparator{

//This method compares the first object with second object.
	
public int compare(Object obj1 , Object obj2 ) {
		
		Hdtv hd1 = (Hdtv) obj1 ;
		
		Hdtv hd2 = (Hdtv) obj2;
		
//If size of both objects are equal, we are returning 0.		
		
		if(hd1.getBrandSize() == hd2.getBrandSize()) {
			
			return 0 ;}
		
// If size of first object is greater than the second, we are returning positive value.		
		
		else if(hd1.getBrandSize() > hd2.getBrandSize()) {
			
			return 1 ;}
		
// If size of first object is less than the second object, we are returning negative value.		
		else { 
			
			return -1 ;}
		
		
	}

}
