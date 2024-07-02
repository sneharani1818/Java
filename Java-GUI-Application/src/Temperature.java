import javax.swing.*;
import java.awt.*;

class TemperatureGUI extends JFrame {
    private JTextField tempInput;
    private JComboBox<String> tempScale;
    private JLabel resultLabel;

    public TemperatureGUI() {
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel inputLabel = new JLabel("Temperature:");
        panel.add(inputLabel);

        tempInput = new JTextField();
        panel.add(tempInput);

        JLabel scaleLabel = new JLabel("Scale:");
        panel.add(scaleLabel);

        String[] scales = {"Celsius", "Fahrenheit"};
        tempScale = new JComboBox<>(scales);
        panel.add(tempScale);

        JPanel resultPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        resultLabel = new JLabel("Result:");
        resultPanel.add(resultLabel);

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(resultPanel, BorderLayout.SOUTH);

        tempInput.addActionListener(e -> convertTemperature());
        tempScale.addActionListener(e -> convertTemperature());
    }

    private void convertTemperature() {
        try {
            double temp = Double.parseDouble(tempInput.getText());
            String selectedScale = (String) tempScale.getSelectedItem();

            double result;
            if (selectedScale.equals("Celsius")) {
                result = (temp * 9.0 / 5.0) + 32.0;
                resultLabel.setText("Result: " + String.format("%.2f", result) + " Fahrenheit");
            } else {
                result = (temp - 32.0) * 5.0 / 9.0;
                resultLabel.setText("Result: " + String.format("%.2f", result) + " Celsius");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
        }
    }
}
public class Temperature{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TemperatureGUI gui = new TemperatureGUI();
            gui.setVisible(true);
        });
    }
}
