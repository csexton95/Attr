package edu.saintjoe.cs.brianc.attr;

public class ColorAttrDriver {
	
	public static void main(String[] args ) {
		
		ColorAttr testOne, testTwo, testThree;
		Attr testFour;
		
		// We need this object for the third ColorAttr constructor
		ScreenColor newColor = new ScreenColor("green");
		
		// Test out our constructors
		
		// Number one
		testOne = new ColorAttr("ColorOne","red");
		System.out.println(testOne.toString());
		
		// Number two
		testTwo = new ColorAttr("ColorTwo");
		System.out.println(testTwo.toString());
		
		// Number three
		testThree = new ColorAttr("ColorThree", newColor);
		System.out.println(testThree.toString());
	
		// Number four
		testFour = new Attr("ColorFour", "yellow");
		System.out.println(testFour.toString());
		//Number four is differetn from number three because it has a direct color that it is calling
		//Number five
		testFive = new Attr("ColorFive", "chartreuse");
		System.out.println(testFive.toString());
		
		//Number Six
		testSix = new Attr("ColorSix", "crimson");
		System.out.println(testSix.toString());
		
		
	} // end main
}