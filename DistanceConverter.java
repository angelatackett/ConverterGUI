/**
 * The DistanceConverter class extends the Converter class and provides methods
 * for converting distance from miles to kilometers.
 */
public class DistanceConverter extends Converter {

	/**
	 * Constructs a new DistanceConverter instance with no input value.
	 */
	public DistanceConverter() {
		super();
	}

	/**
	 * Constructs a new DistanceConverter instance with the specified input
	 * value.
	 *
	 * @param input the distance in miles to convert
	 */
	public DistanceConverter(double input) {
		super(input);
	}

	/**
	 * Converts the input distance from miles to kilometers and returns the
	 * result. If the instance has no input value, returns Double.NaN.
	 *
	 * @return the input distance converted to kilometers
	 */
	@Override
	public double convert() {
		if (Double.isNaN(this.getInput())) {
			return Double.NaN;
		} else {
			return this.getInput() * 1.609;
		}
	}
}