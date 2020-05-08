package edu.ti.caih313.lab8;

public class Ledger {

        private double[] sale;
        private int salesMade;
        private int maxSales;


        public Ledger(int max){
            this.maxSales = max;
            sale = new double[this.maxSales];
            this.salesMade =0;
        }


        public void addSale(double d){
            if(salesMade< maxSales){
                sale[salesMade] = d;
                salesMade++;
                System.out.println("Sale added in ledger with value = "+d);
            }else{
                System.out.println("Max sales reached for the ledger!");
            }
        }


        public int getNumberOFSales(){
            return salesMade;
        }


        public double getTotalSales(){
            double total = 0;
            for(int i = 0 ; i < salesMade; i++){
                total = total + sale[i];
            }
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
            for(int i = 0;i<salesMade;i++){
                if(sale[i]>v){
                    count++;
                }
            }

            return count;
        }
    }


