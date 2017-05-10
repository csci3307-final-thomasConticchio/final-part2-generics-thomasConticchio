/**
 * 
 */
package com.mycompany.section_1;

/**
 * @author tconti97
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		MyGenInterface mgi1 = new MyGenClass(1, "Thomas");
		MyGenInterface mgi2 = new MyGenClass(1, 2017);
		Integer i1=MyRegularClass.getSum(10, 20);
		Float f1=MyRegularClass.getSum(100f, 200f);	
		
		System.out.println("mgi1 key= "+mgi1.getKey()+", value= "+mgi1.getValue());
		System.out.println("mgi2 key= "+mgi2.getKey()+", value= "+mgi2.getValue());
		System.out.println();
		
		System.out.println("i1 = "+i1);
		System.out.println("f1 = "+f1);
		
		
	}

}
