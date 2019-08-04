package PromissoryNote;

import java.util.HashMap;

public class PromissoryNote {
    HashMap<String, Double> loans;

    public PromissoryNote(){
        this.loans = new HashMap<String, Double>();
    }

    // stores loans to specific names = key.
    public void setLoan(String toWhom, double value){
        this.loans.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String name){
        if(this.loans.containsKey(name)){
            return this.loans.get(name);
        }
        return 0;
    }

    public void printAllDebts(){
        this.loans.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() +" "+ entry.getValue()));
    }
}