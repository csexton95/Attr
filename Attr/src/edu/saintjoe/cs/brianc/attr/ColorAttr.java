package edu.saintjoe.cs.brianc.attr;

	// Brian Capouch commenting a subclass of Attr, called ColorAttr
	public class ColorAttr extends Attr {
		
		
		// myColor is an ADDITIONAL data member of the ColorAttr class
		private ScreenColor myColor; // The decoded color

		// Constructor No 1
		// This constructor takes a name and an Object value
		public ColorAttr(String name, Object value) {
			// super means call the parent class constructor
			// Note that: the parent class MUST have a constructor
			// with the indicated signature (e.g. name, value)
			// Below line is the same as writing Attr(name,value)
		    super(name, value);
		    // System.out.println("C1");
		    decodeColor();
		    }

		// constructor No 2
		// This constructor takes a name only
		public ColorAttr(String name) {
			// Call the ColorAttr constructor which mathches the parameters
			//  in the same order and type
		    this(name, "transparent");
		    // System.out.println("C2");
		    }

		// constructor no 3
		// This constructor takes a name and a ScreenColor value
		public ColorAttr(String name, ScreenColor value) {
		    super(name, value.toString());
		    //System.out.println("C3");
		    myColor = value;
		    }

		// THIS is an example of method overriding!!!!!!!!!
		public Object setValue(Object newValue)  {
			    // do superclass stuff first
			    Object retval = super.setValue(newValue);
			    decodeColor();
			    return retval;
			    }

		/** Set value to ScreenColor, not description */
		public ScreenColor setValue(ScreenColor newValue) {
			// do superclass first
			//override
			super.setValue(newValue.toString());
			ScreenColor oldValue = myColor;
			myColor = newValue;
			return oldValue;
			}

		  /** Return decoded ScreenColor object */
		  public ScreenColor getColor() {
			    return myColor;
			    }

		  /** Set ScreenColor from description */
		  protected void decodeColor() {
			  if(getValue() == null) {
				  System.out.println("Freakout!!");
				  myColor = null; }
			  else
				  myColor = new ScreenColor(getValue());
		  		  }
		  public String toString() {
			  return super.toString() + " " + myColor.toNumberString();
		  }
	}
