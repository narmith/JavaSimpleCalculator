package ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.CalcController;

public class PanelNumberBtns extends JPanel {
	private static final long serialVersionUID = 1L;

	private static JButton first;
	private static JButton second;
	private static JButton third;
	private static JButton fourth;
	private static JButton fifth;
	private static JButton sixth;
	private static JButton seventh;
	private static JButton eighth;
	private static JButton ninth;
	private static JButton zero;
	private static int value1;
	private static int value2;
	private static boolean btnsEnabled;
	
	public PanelNumberBtns(){
		btnsEnabled=true;
		first=new JButton("1");
		second=new JButton("2");
		third=new JButton("3");
		fourth=new JButton("4");
		fifth=new JButton("5");
		sixth=new JButton("6");
		seventh=new JButton("7");
		eighth=new JButton("8");
		ninth=new JButton("9");
		zero=new JButton("0");
		configurePanel();
		addNumsBtnComponents();
	}

	private void configurePanel() { setLayout(new GridLayout(4, 3, 8, 8)); }

	public void addNumsBtnComponents(){
		first.addActionListener(new ButtonListener());
		second.addActionListener(new ButtonListener());
		third.addActionListener(new ButtonListener());
		fourth.addActionListener(new ButtonListener());
		fifth.addActionListener(new ButtonListener());
		sixth.addActionListener(new ButtonListener());
		seventh.addActionListener(new ButtonListener());
		eighth.addActionListener(new ButtonListener());
		ninth.addActionListener(new ButtonListener());
		zero.addActionListener(new ButtonListener());
		this.add(first);
		this.add(second);
		this.add(third);
		this.add(fourth);
		this.add(fifth);
		this.add(sixth);
		this.add(seventh);
		this.add(eighth);
		this.add(ninth);
		this.add(zero);
	}

	private void enterNumber(int number) { CalcController.SetOperationValues(number); }

	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent actionEvent) {
			if(actionEvent.getSource().equals(first)) { enterNumber(1); }
			if(actionEvent.getSource().equals(second)) { enterNumber(2); }
			if(actionEvent.getSource().equals(third)) { enterNumber(3); }
			if(actionEvent.getSource().equals(fourth)) { enterNumber(4); }
			if(actionEvent.getSource().equals(fifth)) { enterNumber(5); }
			if(actionEvent.getSource().equals(sixth)) { enterNumber(6); }
			if(actionEvent.getSource().equals(seventh)) { enterNumber(7); }
			if(actionEvent.getSource().equals(eighth)) { enterNumber(8); }
			if(actionEvent.getSource().equals(ninth)) { enterNumber(9); }
			if(actionEvent.getSource().equals(zero)) { enterNumber(0); }
		}
	}

	public static int GetValue1() { return value1; }
	public static int GetValue2() { return value2; }
	public static void SetValue1(int value) { value1=value; }
	public static void SetValue2(int value) { value2=value; }
	public static boolean ToggleBtnsState() { return btnsEnabled;}

	public static void ToggleBtns(boolean btnsEnabled) {
		first.setEnabled(btnsEnabled);
		second.setEnabled(btnsEnabled);
		third.setEnabled(btnsEnabled);
		fourth.setEnabled(btnsEnabled);
		fifth.setEnabled(btnsEnabled);
		sixth.setEnabled(btnsEnabled);
		seventh.setEnabled(btnsEnabled);
		eighth.setEnabled(btnsEnabled);
		ninth.setEnabled(btnsEnabled);
		zero.setEnabled(btnsEnabled);
	}
}