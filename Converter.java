public class Converter {

	private double input; // Private attribute for input of data type double

	// Default constructor with no parameter which sets input to Double.NaN
	public Converter() {
		this.input = Double.NaN;
	}

	// Overloaded constructor with input for parameter
	public Converter(double input) {
		this.input = input;
	}

	// Get method for input attribute
	public double getInput() {
		return input;
	}

	// Set method for input attribute
	public void setInput(double input) {
		this.input = input;
	}

	// Method convert() which returns input value
	public double convert() {
		return input;
	}

}