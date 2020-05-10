package edu.ti.caih313.lab8;

import java.util.ArrayList;

public class Ledger {

        private ArrayList<Double> salesList = new ArrayList<Double>();
        private int salesMade;
        private int maxSales;
        double total = 0;



        public void addSale(double d) {
            salesMade ++;
            total += d;
            salesList.add(d);
        }


        public int getNumberOFSales(){
            return salesMade;
        }


        public double getTotalSales(){

            return total;
        }


        public double getAverageSale(){
            double total = getTotalSales();
            double average = 0;
            if(salesMade!=0){
                average = total/salesMade;
            }
            return average;
        }


        public int getCountAbove(double v){
            int count = 0;
            for(int i = 0;i<salesList.size();i++){
                if(salesList.get(i)>v){
                    count++;
                }
            }

            return count;
        }

    public static void main(String[] args){

        Ledger ledger = new Ledger();


        double salesAmount[] = {59,45,67.5,39.45,44.47,61.54,73.29};


        for(double d: salesAmount){
            ledger.addSale(d);
        }


        System.out.println("Total number of sales = "+ ledger.getNumberOFSales());


        System.out.println("Total sales amount = "+ ledger.getTotalSales());


        System.out.println("Average sale amount = "+ ledger.getAverageSale());


        double checkSaleAmount = 50;


        System.out.println("Number of sales exceeded "+checkSaleAmount
                + " in value = "+ledger.getCountAbove(checkSaleAmount));

    }

}



