import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * GUIConverter is a graphical user interface program that allows users to
 * convert distance from miles to kilometers and temperature from Fahrenheit to
 * Celsius. The program includes a main window with three buttons: Distance
 * Converter, Temperature Converter, and Exit. When the Distance Converter
 * button is clicked, a dialog box prompts the user to enter a distance in
 * miles. If the input is valid, the program converts the distance to
 * kilometers using the DistanceConverter class and displays the result in a
 * message dialog. When the Temperature Converter button is clicked, a dialog
 * box prompts the user to enter a temperature in Fahrenheit. If the input is
 * valid, the program converts the temperature to Celsius using the
 * TemperatureConverter class and displays the result in a message dialog. When
 * the Exit button is clicked, the program terminates. The program uses the
 * Converter class as a superclass for DistanceConverter and TemperatureConverter,
 * which provide specific conversion methods for distance and temperature
 * respectively. The program also includes private inner classes for the
 * ActionListeners of the three buttons, which handle user input and conversion
 * logic.
 * @author Angela Tackett
 * @date 22APR2023
 * @class: CMIS242
 * @assignment: 3
*/


public class GUIConverter {
	private JFrame window;
	private JPanel content;
	private JButton distanceButton;
	private JButton temperatureButton;
	private JButton exitButton;

	public GUIConverter() {
		// Create JFrame and JPanel
		window = new JFrame("Welcome to Converter");
		content = new JPanel();
		content.setLayout(new BorderLayout());

		// Create JButtons
		distanceButton = new JButton("Distance Converter");
		distanceButton.setPreferredSize(new Dimension(400, 200)); // Set button size
		temperatureButton = new JButton("Temperature Converter");
		distanceButton.setPreferredSize(new Dimension(400, 200)); // Set button size
		exitButton = new JButton("Exit");

		// Add ActionListeners to buttons
		distanceButton.addActionListener(new DistanceButtonListener());
		temperatureButton.addActionListener(new TemperatureButtonListener());
		exitButton.addActionListener(new ExitButtonListener());

		// Add buttons to panel
		content.add(distanceButton, BorderLayout.WEST);
		content.add(temperatureButton, BorderLayout.CENTER);
		content.add(exitButton, BorderLayout.SOUTH);

		// Set up window and display
		window.setContentPane(content);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	// Action listener for Distance button
	private class DistanceButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Show input dialog and convert input to kilometers
			String inputString = JOptionPane.showInputDialog(null,
					"Enter distance in miles:");
			if (inputString != null) {
				try {
					double input = Double.parseDouble(inputString);
					DistanceConverter converter = new DistanceConverter(input);
					double result = converter.convert();
					JOptionPane.showMessageDialog(null,
							input + " miles = " + result + " kilometers");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"Invalid input. Please enter a number.");
				}
			}
		}
	}

	// Action listener for Temperature button
	private class TemperatureButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Show input dialog and convert input to Celsius
			String inputString = JOptionPane.showInputDialog(null,
					"Enter temperature in Fahrenheit:");
			if (inputString != null) {
				try {
					double input = Double.parseDouble(inputString);
					TemperatureConverter converter = new TemperatureConverter(
							input);
					double result = converter.convert();
					JOptionPane.showMessageDialog(null,
							input + " F = " + result + " C");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"Invalid input. Please enter a number.");
				}
			}
		}
	}

	// Action listener for Exit button
	private class ExitButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new GUIConverter();
	}
}