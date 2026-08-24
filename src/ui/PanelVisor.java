package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelVisor extends JPanel {
	private static final long serialVersionUID = 1L;
	private static JLabel expression;
    private static JLabel result;
	
	public PanelVisor() {
		expression = new JLabel(" ");
        result = new JLabel("0.0");
        configurePanel();
        configureLabels();
        addComponents();
	}

	private void configurePanel() {
        setLayout(new BorderLayout(10, 2));
        setBackground(new Color(32, 32, 32));
        setBorder(BorderFactory.createEmptyBorder( 15, 20, 15, 20 ));
    }

    private void configureLabels() {
        expression.setHorizontalAlignment(SwingConstants.RIGHT);
		expression.setVerticalAlignment(SwingConstants.CENTER);
        expression.setForeground(new Color(170, 170, 170));
        expression.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        result.setHorizontalAlignment(SwingConstants.RIGHT);
		result.setVerticalAlignment(SwingConstants.CENTER);
        result.setForeground(Color.WHITE);
        result.setFont(new Font("Segoe UI", Font.PLAIN, 36));
    }
	
	private void addComponents() {
		add(expression, BorderLayout.NORTH);
        add(result, BorderLayout.CENTER);
	}

	public static void setExpression(String value) { expression.setText(value); }
	//public static String getResult() { return result.getText(); }
	public static void setResult(String comment) { result.setText(comment); }
	public static void setResult(double value) { result.setText(String.valueOf(value)); }
}
