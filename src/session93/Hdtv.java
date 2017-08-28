/**
 * Hdtv.java 1.1 28-Aug-2017
 * 
 */
//public class declaration
package session93;
/**
 * This class declares Hdtv class and its attributes as Name and Size.
 * 
 * Version 1.1
 * 
 * Compiled on 28-Aug-2017
 * 
 * @author Chhaya Yadav
 */
//public class declaration

public class Hdtv {
	
//member variable declaration
	
	private String brandName ;
	
	private int brandSize ;
	
//parameterized constructor declaration	
	
	public Hdtv(String brandName , int brandSize){
		
		this.brandName  = brandName ;
		
		this.brandSize  = brandSize      ;
	}

//get method to retrieve Hdtv BrandName 
	
	public String getBrandName() {
		
		return brandName;
	}

//set method to set the value of Hdtv BrandName
	
	public void setBrandName(String brandName) {
		
		this.brandName = brandName;
	}

//get method to retrieve Hdtv  BrandSize	
	public int getBrandSize() {
		
		return brandSize;
	}

//set method to set the value of Hdtv BrandSize	

	public void setBrandSize(int brandSize) {
		
		this.brandSize = brandSize;
	}



}
