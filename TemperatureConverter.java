/**
 * A class for converting temperatures from Fahrenheit to Celsius. Extends the
 * Converter class.
 */
public class TemperatureConverter extends Converter {

	/**
	 * Default constructor which calls the parent constructor with no input.
	 */
	public TemperatureConverter() {
		super();
	}

	/**
	 * Overloaded constructor which calls the parent constructor with the input
	 * Fahrenheit temperature.
	 * 
	 * @param input the Fahrenheit temperature to be converted to Celsius
	 */
	public TemperatureConverter(double input) {
		super(input);
	}

	/**
	 * Converts the input Fahrenheit temperature to Celsius and returns the
	 * value. If the instance has no input value, it should return Double.NaN.
	 * 
	 * @return the input Fahrenheit temperature converted to Celsius, or
	 *         Double.NaN if there is no input value
	 */
	@Override
	public double convert() {
		if (Double.isNaN(this.getInput())) {
			return Double.NaN;
		} else {
			return ((this.getInput() - 32) * 5) / 9;
		}
	}
}