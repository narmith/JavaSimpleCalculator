package ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame{
	private static final long serialVersionUID = 1L;

	public MainWindow(){
		ConfigurateWindow();
		AddComponents();
		setVisible(true);
	}
	private void ConfigurateWindow(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setIconImage(Toolkit.getDefaultToolkit().getImage("monedero.png")); // Monedero folder picture
		setTitle("Calculator");
		setSize(600, 600);
		setResizable(false);
		setLocationRelativeTo(null); // the center of the screen
	}
	private void AddComponents(){
		setLayout(new BorderLayout(10, 10));
		PanelVisor visor = new PanelVisor();
        PanelNumberBtns numbers = new PanelNumberBtns();
        PanelOperationBtns operations = new PanelOperationBtns();
		JPanel calculatorButtons = new JPanel( new GridLayout(1, 2, 10, 0) );
		calculatorButtons.add(numbers);
        calculatorButtons.add(operations);
		PanelEnable enable = new PanelEnable();

		add(visor, BorderLayout.NORTH);
		add(calculatorButtons, BorderLayout.CENTER);
		add(operations, BorderLayout.EAST);
		add(enable, BorderLayout.SOUTH);
	}
}