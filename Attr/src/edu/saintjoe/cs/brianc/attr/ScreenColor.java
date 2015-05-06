package edu.saintjoe.cs.brianc.attr;

public class ScreenColor {
	
	// A ScreenColor object has two fields (data members)
	private int colorValue;
	private String description;

	
	// emil exists to show how parameter names are arbitrary
	public ScreenColor(Object colorDescriptor) {
		description = (String) colorDescriptor;
	    colorValue = encode(colorDescriptor);
	    }
	  
	// foo does too!
	private int encode(Object foo) {
		  if (foo.equals("transparent"))
			  // This is a bogus value!!
			  return -1;
		  else if (foo.equals("red"))
			  // green, yellow, blue
			  return 0xff0000;
		  else if (foo.equals("green"))
		  		return 0x00cc00;
		  else if (foo.equals("yellow"))
			  	return 0x999900;
		  else if (foo.equals("chartreuse"))
			  	return 0x9FF781;
		  else if (foo.equals("crimson"))
			  return 0xFA5858
		  // We have to return something; this isn't really the right way to do it!
		  return -1;
	  }
	
	
	  public String toString() {
		  return description;
	  }
	  public String toNumberString() {
		  return Integer.toHexString(colorValue);
	  }
	}
