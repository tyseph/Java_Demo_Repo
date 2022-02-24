package com.cg.feb22.demo;

/*Primitive Data types in java
 * integer type - byte short int long char
 * floating point types - float double
 * boolean - boolean
 * character - char
*/

/*Reference Data types
 * class, array, enum
*/
public class DatatypesDemo {
	
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(num);
	
		byte b1 = 127; //-128 to 127
		System.out.println(Byte.MIN_VALUE + b1);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.SIZE);

		//short
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.SIZE);
		
		//similar for integers
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		//similar for long
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.SIZE);
				
		//float
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.SIZE);
		
		//double
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.SIZE);
		
		//Character
		System.out.println(Character.SIZE);
		
		//Boolean
		String name = "Sajal";
		System.out.println(Boolean.valueOf(name));
				
		double num2 = 8.6;
		
	
	}
}
