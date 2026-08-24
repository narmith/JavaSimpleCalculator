package controller;

import ui.PanelNumberBtns;
import ui.PanelVisor;

public class CalcController {
	private static int operation = 0;

	public static void SetOperation(int code) {
		operation=code;
		if(code==0) { PanelVisor.setExpression(" "); }
		if(code==1) { PanelVisor.setExpression("+"); }
		if(code==2) { PanelVisor.setExpression("-"); }
		if(code==3) { PanelVisor.setExpression("*"); }
		if(code==4) { PanelVisor.setExpression("/"); }
		if(code==5) { PanelVisor.setExpression("%"); }
	}

    public static void Execute(){
		double result=0;
		PanelNumberBtns.ToggleBtns(false);
		try {
			if (operation==1) { result=(model.Calculator.Addition(GetValue1(), GetValue2())); }
			if (operation==2) { result=(model.Calculator.Subtraction(GetValue1(), GetValue2())); }
			if (operation==3) { result=(model.Calculator.Multiplication(GetValue1(), GetValue2())); }
			if (operation==4) { result=(model.Calculator.Division(GetValue1(), GetValue2())); }
			if (operation==5) { result=(model.Calculator.Module(GetValue1(), GetValue2())); }
			PanelVisor.setResult(result);
		} catch (Exception e) {
			PanelVisor.setResult("Infinity (∞)");
			//System.out.printf("Operation Error: " + e.getMessage());
		}
		
		//System.out.printf("values: " + PanelNumberBtns.GetValue1() + " " + operation + " " + PanelNumberBtns.GetValue2() + " ");
	}

	private static int GetValue1 () { return ui.PanelNumberBtns.GetValue1(); }
	private static int GetValue2 () { return ui.PanelNumberBtns.GetValue2(); }
	private static boolean GetOperation() { return operation > 0; }

	public static void SetOperationValues (int number) {
		if (GetOperation()) {
			PanelVisor.setResult((double) number);
			//PanelVisor.setSecondTerm(String.valueOf(number));
			PanelNumberBtns.SetValue2(number);
		} else {
			PanelVisor.setResult((double) number);
			//PanelVisor.setFirstTerm(String.valueOf(number));
			PanelNumberBtns.SetValue1(number);
    	}
	}

	public static void clearFields() {
		//PanelVisor.setFirstTerm("");
		//PanelVisor.setSecondTerm("");
		PanelVisor.setExpression("");
		PanelVisor.setResult(0);
		SetOperation(0);
		PanelNumberBtns.SetValue1(0);
		PanelNumberBtns.SetValue2(0);
		PanelNumberBtns.ToggleBtns(true);
	}
	
}
