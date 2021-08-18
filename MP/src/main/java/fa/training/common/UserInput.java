package fa.training.common;

public class UserInput {
	public static int inputTypeInt(String value) {
		int intValue = 0;
		do {
			try {
				intValue = Integer.parseInt(value);
			} catch (Exception e) {
				System.out.println("Please input int value!");
			}
			break;
		} while (true);
		return intValue;
	}

	/**
	 * Get value type float from console.
	 * 
	 * @method inputTypeFloat
	 * @param value
	 */
	public static float inputTypeFloat(String value) {
		float floatValue = 0;
		do {
			try {
				floatValue = Float.parseFloat(value);
			} catch (Exception e) {
				System.out.println("Please input float value!");
			}
			break;
		} while (true);
		return floatValue;
	}

	/**
	 * Get value type double from console.
	 * 
	 * @method inputTypeDouble
	 * @param value
	 */
	public static double inputTypeDouble(String value) {
		double doubleValue = 0;
		do {
			try {
				doubleValue = Double.parseDouble(value);
			} catch (Exception e) {
				System.out.println("Please input double value!");
			}
			break;
		} while (true);
		return doubleValue;
	}
}
