import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorGUI extends JFrame {
    private JTextField displayField;
    private double currentValue = 0;
    private String currentOperation = "";
    private boolean isNewNumber = true;

    public CalculatorGUI() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        // Create the display field
        displayField = new JTextField("0");
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(new Font("Arial", Font.PLAIN, 24));

        // Create the button panel
        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));

        // Add the buttons
        addButton("MC", buttonPanel, new ClearMemoryListener());
        addButton("M+", buttonPanel, new AddToMemoryListener());
        addButton("M-", buttonPanel, new SubtractFromMemoryListener());
        addButton("MR", buttonPanel, new RecallMemoryListener());

        addButton("CE", buttonPanel, new ClearEntryListener());
        addButton("C", buttonPanel, new ClearListener());
        addButton("⌫", buttonPanel, new BackspaceListener());
        addButton("÷", buttonPanel, new DivideListener());

        addButton("7", buttonPanel, new NumberListener("7"));
        addButton("8", buttonPanel, new NumberListener("8"));
        addButton("9", buttonPanel, new NumberListener("9"));
        addButton("×", buttonPanel, new MultiplyListener());

        addButton("4", buttonPanel, new NumberListener("4"));
        addButton("5", buttonPanel, new NumberListener("5"));
        addButton("6", buttonPanel, new NumberListener("6"));
        addButton("-", buttonPanel, new SubtractListener());

        addButton("1", buttonPanel, new NumberListener("1"));
        addButton("2", buttonPanel, new NumberListener("2"));
        addButton("3", buttonPanel, new NumberListener("3"));
        addButton("+", buttonPanel, new AddListener());

        addButton("+/-", buttonPanel, new ChangeSignListener());
        addButton("0", buttonPanel, new NumberListener("0"));
        addButton(".", buttonPanel, new DecimalPointListener());
        addButton("=", buttonPanel, new EqualsListener());

        // Add the display field and button panel to the frame
        add(displayField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private void addButton(String text, JPanel panel, ActionListener listener) {
        JButton button = new JButton(text);
        button.addActionListener(listener);
        panel.add(button);
    }

    private class NumberListener implements ActionListener {
        private final String digit;

        public NumberListener(String digit) {
            this.digit = digit;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (isNewNumber) {
                displayField.setText(digit);
                isNewNumber = false;
            } else {
                displayField.setText(displayField.getText() + digit);
            }
        }
    }

    private class DecimalPointListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isNewNumber) {
                displayField.setText("0.");
                isNewNumber = false;
            } else if (!displayField.getText().contains(".")) {
                displayField.setText(displayField.getText() + ".");
            }
        }
    }

    private class ChangeSignListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double value = Double.parseDouble(displayField.getText());
            displayField.setText(String.valueOf(-value));
        }
    }

    private class ClearEntryListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            displayField.setText("0");
            isNewNumber = true;
        }
    }

    private class ClearListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            currentValue = 0;
            currentOperation = "";
            displayField.setText("0");
            isNewNumber = true;
        }
    }

    private class BackspaceListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String text = displayField.getText();
            if (text.length() > 1) {
                displayField.setText(text.substring(0, text.length() - 1));
            } else {
                displayField.setText("0");
                isNewNumber = true;
            }
        }
    }

    private class AddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            performOperation();
            currentOperation = "+";
            isNewNumber = true;
        }
    }

    private class SubtractListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            performOperation();
            currentOperation = "-";
            isNewNumber = true;
        }
    }

    private class MultiplyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            performOperation();
            currentOperation = "×";
            isNewNumber = true;
        }
    }

    private class DivideListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            performOperation();
            currentOperation = "÷";
            isNewNumber = true;
        }
    }

    private class EqualsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            performOperation();
            currentOperation = "";
            isNewNumber = true;
        }
    }

    private class ClearMemoryListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            currentValue = 0;
        }
    }

    private class AddToMemoryListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            currentValue += Double.parseDouble(displayField.getText());
        }
    }

    private class SubtractFromMemoryListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            currentValue -= Double.parseDouble(displayField.getText());
        }
    }

    private class RecallMemoryListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            displayField.setText(String.valueOf(currentValue));
            isNewNumber = false;
        }
    }

    private void performOperation() {
        double newValue = Double.parseDouble(displayField.getText());
        switch (currentOperation) {
            case "+":
                currentValue += newValue;
                break;
            case "-":
                currentValue -= newValue;
                break;
            case "×":
                currentValue *= newValue;
                break;
            case "÷":
                currentValue /= newValue;
                break;
            default:
                currentValue = newValue;
                break;
        }
        displayField.setText(String.valueOf(currentValue));
    }
}
public class Calculator{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }
}
