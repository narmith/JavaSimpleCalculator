package ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.CalcController;

public class PanelOperationBtns extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton clear;
	private JButton addition;
	private JButton subtraction;
	private JButton division;
	private JButton multiplication;
	private JButton module;
	private JButton equal;
	
	public PanelOperationBtns(){
		clear=new JButton("C");
		addition=new JButton("+");
		subtraction=new JButton("-");
		division=new JButton("/");
		multiplication=new JButton("*");
		module=new JButton("%");
		equal=new JButton("=");
		configurePanel();
		addOpsBtnComponents();
	}

	private void configurePanel() { setLayout(new GridLayout(7, 1, 8, 8)); }

	private void addOpsBtnComponents(){
		clear.addActionListener(new ButtonListener());
		addition.addActionListener(new ButtonListener());
		subtraction.addActionListener(new ButtonListener());
		division.addActionListener(new ButtonListener());
		multiplication.addActionListener(new ButtonListener());
		module.addActionListener(new ButtonListener());
		equal.addActionListener(new ButtonListener());
		add(clear);
		add(addition);
		add(subtraction);
		add(division);
		add(multiplication);
		add(module);
		add(equal);
	}
	
	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent actionEvent){
			if(actionEvent.getSource().equals(clear)) { SetOp(0); }
			if(actionEvent.getSource().equals(addition)) { SetOp(1); }
			if(actionEvent.getSource().equals(subtraction)) { SetOp(2); }
			if(actionEvent.getSource().equals(multiplication)) { SetOp(3); }
			if(actionEvent.getSource().equals(division)) { SetOp(4); }
			if(actionEvent.getSource().equals(module)) { SetOp(5); }
			if(actionEvent.getSource().equals(equal)) { CalcController.Execute(); }
		}
	}

	public static void SetOp(int code) {
		if(code==0) { CalcController.clearFields(); }
		if(code==1) { CalcController.SetOperation(1);}
		if(code==2) { CalcController.SetOperation(2);}
		if(code==3) { CalcController.SetOperation(3);}
		if(code==4) { CalcController.SetOperation(4);}
		if(code==5) { CalcController.SetOperation(5);}
	}
}