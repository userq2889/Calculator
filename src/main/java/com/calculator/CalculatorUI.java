package com.calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorUI extends JFrame {
    private final Calculator calculator = new Calculator();
    private JTextField num1Field, num2Field, resultField;

    public CalculatorUI() {
        setTitle("Calculator");
        setSize(350, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputPanel.add(new JLabel("Number 1:"));
        num1Field = new JTextField();
        inputPanel.add(num1Field);

        inputPanel.add(new JLabel("Number 2:"));
        num2Field = new JTextField();
        inputPanel.add(num2Field);

        inputPanel.add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        inputPanel.add(resultField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton addButton = new JButton("Add");
        addButton.addActionListener(e -> calculate('+'));
        buttonPanel.add(addButton);

        JButton subButton = new JButton("Subtract");
        subButton.addActionListener(e -> calculate('-'));
        buttonPanel.add(subButton);

        JButton mulButton = new JButton("Multiply");
        mulButton.addActionListener(e -> calculate('*'));
        buttonPanel.add(mulButton);

        JButton divButton = new JButton("Divide");
        divButton.addActionListener(e -> calculate('/'));
        buttonPanel.add(divButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> {
            num1Field.setText("");
            num2Field.setText("");
            resultField.setText("");
        });
        buttonPanel.add(clearButton);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void calculate(char op) {
        String num1Text = num1Field.getText();
        String num2Text = num2Field.getText();
        if (!num1Text.matches("^-?\\d+(\\.\\d+)?$")) {
            resultField.setText("Error: Number 1 invalid");
            return;
        }
        if (!num2Text.matches("^-?\\d+(\\.\\d+)?$")) {
            resultField.setText("Error: Number 2 invalid");
            return;
        }
        try {
            double a = Double.parseDouble(num1Text);
            double b = Double.parseDouble(num2Text);
            double result = 0;
            switch (op) {
                case '+': result = calculator.add(a, b); break;
                case '-': result = calculator.subtract(a, b); break;
                case '*': result = calculator.multiply(a, b); break;
                case '/': result = calculator.divide(a, b); break;
            }
            resultField.setText(String.valueOf(result));
        } catch (Exception ex) {
            resultField.setText("Error");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorUI().setVisible(true));
    }
}