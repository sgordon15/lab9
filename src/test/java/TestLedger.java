import edu.ti.caih313.lab8.Ledger;


public class TestLedger {


        public static void main(String[] args){

            Ledger ledger = new Ledger(10);

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



