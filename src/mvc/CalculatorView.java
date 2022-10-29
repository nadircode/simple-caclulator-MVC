/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.awt.FlowLayout;

/**
 *
 * @author AsmaPC
 */


// Le seul travail de la vue est d'afficher ce que l'utilisateur voit
// La vue n'effectue pas d'opérations 

import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{

	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	private JTextField MfirstNumber  = new JTextField(10);
	private JLabel minusLabel = new JLabel("-");
	private JTextField MsecondNumber = new JTextField(10);
	private JButton McalculateButton = new JButton("Calculate");
	private JTextField McalcSolution = new JTextField(10);
	
	private JTextField PfirstNumber  = new JTextField(10);
	private JLabel produitLabel = new JLabel("*");
	private JTextField PsecondNumber = new JTextField(10);
	private JButton PcalculateButton = new JButton("Calculate");
	private JTextField PcalcSolution = new JTextField(10);
	
	private JTextField DfirstNumber  = new JTextField(10);
	private JLabel divisionLabel = new JLabel("/");
	private JTextField DsecondNumber = new JTextField(10);
	private JButton DcalculateButton = new JButton("Calculate");
	private JTextField DcalcSolution = new JTextField(10);
	
	CalculatorView(){
		
		
		JPanel calcPanel = new JPanel();
		
		JPanel calcPanelMinus = new JPanel();
		
		JPanel calcPanelProduit = new JPanel();
		
		JPanel calcPanelDivision = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		// le plus
		
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
		
		//le Moins
		
		calcPanelMinus.add(MfirstNumber);
		calcPanelMinus.add(minusLabel);
		calcPanelMinus.add(MsecondNumber);
		calcPanelMinus.add(McalculateButton);
		calcPanelMinus.add(McalcSolution);
		
		this.add(calcPanelMinus);
		
		//Le Produit
		
		calcPanelProduit.add(PfirstNumber);
		calcPanelProduit.add(produitLabel);
		calcPanelProduit.add(PsecondNumber);
		calcPanelProduit.add(PcalculateButton);
		calcPanelProduit.add(PcalcSolution);
		
		this.add(calcPanelProduit);
		
		//La Division
		
		calcPanelDivision.add(DfirstNumber);
		calcPanelDivision.add(divisionLabel);
		calcPanelDivision.add(DsecondNumber);
		calcPanelDivision.add(DcalculateButton);
		calcPanelDivision.add(DcalcSolution);
		
		this.add(calcPanelDivision);
		
		
		this.setLayout(new FlowLayout());
		
		
			
	}
	
	// Le Plus
	public int getFirstNumber(){
		
		return Integer.parseInt(firstNumber.getText());
		
	}

	public int getSecondNumber(){
		
		return Integer.parseInt(secondNumber.getText());
		
	}

	public int getCalcSolution(){
		
		return Integer.parseInt(calcSolution.getText());
		
	}

	public void setCalcSolution(int solution){
		
		calcSolution.setText(Integer.toString(solution));
		
	}

	// Si on clique sur le bouton, on execute une méthode dans le controlleur
	
            void addCalculateListener(ActionListener listenForCalcButton){
		
		calculateButton.addActionListener(listenForCalcButton);
		
	}

	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	
// Le Moins

public int getMFirstNumber(){
	
	return Integer.parseInt(MfirstNumber.getText());
	
}

public int getMSecondNumber(){
	
	return Integer.parseInt(MsecondNumber.getText());
	
}

public int getMCalcSolution(){
	
	return Integer.parseInt(McalcSolution.getText());
	
}

public void setMCalcSolution(int Msolution){
	
	McalcSolution.setText(Integer.toString(Msolution));
	
}

void MinusCalculateListener(ActionListener listenForMCalcButton){
	
	McalculateButton.addActionListener(listenForMCalcButton);
	
}

void displayMErrorMessage(String errorMMessage){
	
	JOptionPane.showMessageDialog(this, errorMMessage);
	
}

//La Division

public int getDFirstNumber(){
	
	return Integer.parseInt(DfirstNumber.getText());
	
}

public int getDSecondNumber(){
	
	return Integer.parseInt(DsecondNumber.getText());
	
}

public int getDCalcSolution(){
	
	return Integer.parseInt(DcalcSolution.getText());
	
}

public void setDCalcSolution(int Dsolution){
	
	DcalcSolution.setText(Integer.toString(Dsolution));
	
}

void DivisionCalculateListener(ActionListener listenForDCalcButton){
	
	DcalculateButton.addActionListener(listenForDCalcButton);
	
}

void displayDErrorMessage(String errorDMessage){
	
	JOptionPane.showMessageDialog(this, errorDMessage);
	
}


//Le Produit

public int getPFirstNumber(){
	
	return Integer.parseInt(PfirstNumber.getText());
	
}

public int getPSecondNumber(){
	
	return Integer.parseInt(PsecondNumber.getText());
	
}

public int getPCalcSolution(){
	
	return Integer.parseInt(PcalcSolution.getText());
	
}

public void setPCalcSolution(int Psolution){
	
	PcalcSolution.setText(Integer.toString(Psolution));
	
}

void ProduitCalculateListener(ActionListener listenForPCalcButton){
	
	PcalculateButton.addActionListener(listenForPCalcButton);
	
}

void displayPErrorMessage(String errorPMessage){
	
	JOptionPane.showMessageDialog(this, errorPMessage);
	
}

 
	
}