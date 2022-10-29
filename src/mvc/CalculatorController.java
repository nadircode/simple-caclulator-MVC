/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author AsmaPC
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Le Controlleur fait la coordination des interactions entre la vue et le modèle

public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		
		
		this.theView.addCalculateListener(new CalculateListener());
		this.theView.MinusCalculateListener(new MCalculateListener());
		this.theView.ProduitCalculateListener(new PCalculateListener());
		this.theView.DivisionCalculateListener(new DCalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			//int MfirstNumber, MsecondNumber = 0;
			
			
			
			try{
			
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				//MfirstNumber = theView.getMFirstNumber();
				//MsecondNumber = theView.getMSecondNumber();
				
				theModel.addTwoNumbers(firstNumber, secondNumber);
				//theModel.minusTwoNumbers(MfirstNumber, MsecondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
				//theView.setMCalcSolution(theModel.getMCalculationValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
		
		
	}
	
	class MCalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			
			
			int MfirstNumber, MsecondNumber = 0;
			
			
			
			try{
			
				
				
				MfirstNumber = theView.getMFirstNumber();
				MsecondNumber = theView.getMSecondNumber();
				
				
				theModel.minusTwoNumbers(MfirstNumber, MsecondNumber);
				
				
				theView.setMCalcSolution(theModel.getMCalculationValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
		
		
	}
	
	class PCalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			
			
			int PfirstNumber, PsecondNumber = 0;
			
			
			
			try{
			
				
				
				PfirstNumber = theView.getPFirstNumber();
				PsecondNumber = theView.getPSecondNumber();
				
				
				theModel.produitTwoNumbers(PfirstNumber, PsecondNumber);
				
				
				theView.setPCalcSolution(theModel.getPCalculationValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
		
		
	}
	
	class DCalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			
			
			int DfirstNumber, DsecondNumber = 0;
			
			
			
			try{
			
				
				
				DfirstNumber = theView.getDFirstNumber();
				DsecondNumber = theView.getDSecondNumber();
				
				
				theModel.divisionTwoNumbers(DfirstNumber, DsecondNumber);
				
				
				theView.setDCalcSolution(theModel.getDCalculationValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
		
		
	}
}