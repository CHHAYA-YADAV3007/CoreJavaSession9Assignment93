/**
 * SizeComparatorDemo.java 1.1  28-Aug-2017
 */
//package declaration
package session93;

//importing java.util package to use ArrayList class of Collection framework

import java.util.*;
/**
 * This class illustrate the ArrayList class instantiation and initialization with Hdtv class objects.
 * 
 * This class will display the Hdtv objects in sorted order of size with the help of SizeComparator class.
 * 
 * Version 1.1
 * 
 * @author chhaya yadav
 * 
 * Compiled on 28-Aug-2017
 *
 */
//public class declaration
public class SizeComparatorDemo {

//main method declaration
public static void main(String[] args){
	
//Declaration of ArrayList class instances and instantiation with Hdtv class

       ArrayList<Hdtv> al = new ArrayList<Hdtv>();
       
//Declaration & Instantiation of Hdtv class objects 

       Hdtv h1 = new Hdtv("SAMSUNG",50);

       Hdtv h2 = new Hdtv("HITACHI",35);

       Hdtv h3= new Hdtv("PANASONIC",45);
       
//Adding the Hdtv Class instances to ArrayList       

       al.add(h1);

       al.add(h2);

       al.add(h3);

//Instantiation of SizeComparator class		

       SizeComparator sc = new SizeComparator();

//Sorting the hdtv objects in ascending order of hdtv size

       Collections.sort(al,sc);

       
       System.out.println("Displaying of HDTV objects in sorted ascending order of size");
       

       System.out.println("-------------------------------------------------------------");
       
//Traversing through the sorted array list where elements have been sorted in ascending order
//with the help of SizeComparator class

       for(Hdtv h : al){
	
	       System.out.println("HDTV Brand Name " +h.getBrandName());
	
	       System.out.println("HDTV Size:"+h.getBrandSize());
	
	       System.out.println("____________________________________________");
       }


}}
