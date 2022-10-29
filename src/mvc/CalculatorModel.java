/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author AsmaPC
 */

// Le modèle effectue toutes les opérations nécessaires.
//Le modèle ne sait pas que la vue existe

public class CalculatorModel {

    private int calculationValue;
    private int McalculationValue;
    private int PcalculationValue;
    private int DcalculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber + secondNumber;
    }
    
    public void minusTwoNumbers(int MfirstNumber, int MsecondNumber){
        McalculationValue = MfirstNumber - MsecondNumber;
    }
    
    public void produitTwoNumbers(int PfirstNumber, int PsecondNumber){
    	PcalculationValue = PfirstNumber * PsecondNumber;
    }
    
    public void divisionTwoNumbers(int DfirstNumber, int DsecondNumber){
    	DcalculationValue = DfirstNumber / DsecondNumber;
    }
    
    public int getCalculationValue(){
        return calculationValue;        

    }   
    
    public int getMCalculationValue(){
        return McalculationValue;        

    } 
    
    public int getPCalculationValue(){
        return PcalculationValue;        

    }
    
    public int getDCalculationValue(){
        return DcalculationValue;        

    }

}
