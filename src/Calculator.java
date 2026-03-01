import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Calculator {
    int borderWidth = 360;
    int borderHeight = 540;

    Color lightGrayColor = new Color(212, 212, 210);
    Color dartkGreyColor = new Color(80, 80, 80);
    Color blackColor = new Color(28, 28, 28);
    Color orangeColor = new Color(255, 149, 0);

    String[] buttonValues = {
        "AC", "+/-", "%", "÷", 
        "7", "8", "9", "×", 
        "4", "5", "6", "-",
        "1", "2", "3", "+",
        "0", ".", "√", "="
        };

    String[] rightSymbols = {"÷", "×", "-", "+", "="};
    String[] topSymbols = {"AC", "+/-", "%"};

    JFrame frame = new JFrame("Calculator");
    JLabel displayLabel = new JLabel();
    JPanel displayPanel = new JPanel();
    JPanel buttonPanel = new JPanel();

    Calculator(){

        frame.setVisible(true);
        frame.setSize(borderWidth, borderHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        displayLabel.setBackground(blackColor);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 80));
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayLabel.setText("0");
        displayLabel.setOpaque(true);

        displayPanel.setLayout(new BorderLayout());
        displayPanel.add(displayLabel);
        frame.add(displayPanel);
        frame.add(displayPanel, BorderLayout.NORTH);

        buttonPanel.setLayout(new GridLayout(5,4));
        buttonPanel.setBackground(blackColor);
        frame.add(buttonPanel);

            for (int i = 0; i < buttonValues.length; i++){
                JButton button = new JButton();
                String buttonValue = buttonValues[i];

                button.setFont(new Font("Arial", Font.PLAIN, 30));
                button.setText(buttonValue);
                button.setFocusable(false);
                
                
                if(Arrays.asList(topSymbols).contains(buttonValue)){
                    button.setBackground(lightGrayColor);
                    button.setForeground(blackColor);
                }
                else if (Arrays.asList(rightSymbols).contains(buttonValue)){
                    button.setBackground(orangeColor);
                    button.setForeground(Color.white);
                }
                else{
                    button.setBackground(dartkGreyColor);
                    button.setForeground(Color.white);
                }
                buttonPanel.add(button);
            }
        
        }
    }
