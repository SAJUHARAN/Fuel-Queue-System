
import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;


public class Array {
       static boolean isArrayEmpty(String[] array){  // used of methods to call array to each of the options.
           for(int i=0;i< array.length;i++){
            if(array[i] != null){
                return false;
            }
        }
            return true;
    }
    private static void addCustomers( ) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Pump Number 1, 2 or 3");
        int Pump = in.nextInt();
            if(Pump==1)  // created  if statement to call all 3 pumps.
                for (int i = 0; i < 1; i++) {  //used for loops to add customers to each pumps.
                    System.out.println("Enter customer name: ");
                    String pump = input.nextLine();
                    System.out.println("At which position do you want to place the customer"); // also placed positions for each customers.
                    i = input.nextInt();
                    pump1[i] = pump;
                    System.out.println(pump1[i] + " Added to Pump1 Successfully");
                    FuelStock = FuelStock - 10; // once customers are added into the pump fuel stocks starts to reduce.
                    break;
                }
            if(Pump==2)
                for (int i = 0; i < 1; i++) {
                    System.out.println("Enter customer name: ");
                    String pump = input.nextLine();
                    System.out.println("At which position do you want to place the customer");
                    i = input.nextInt();
                    pump2[i] = pump;
                    System.out.println(pump2[i] + " Added to Pump2 Successfully");
                    FuelStock = FuelStock - 10;
                    break;
                }
            if(Pump==3)
                for (int i = 0; i < 1; i++) {
                    System.out.println("Enter customer name: ");
                    String pump = input.nextLine();
                    System.out.println("At which position do you want to place the customer");
                    i = input.nextInt();
                    pump3[i] = pump;
                    System.out.println(pump3[i] + " Added to Pump3 Successfully");
                    FuelStock = FuelStock - 10;
                    break;
                }
        }
    private static void removeCustomer() {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter  Pump number 1  2 or 3");
        int Pump = c.nextInt();
        int Pumpsize = 6;
        if (Pump == 1) {
            System.out.println("Enter the position number u want to remove the customer");
            int position = c.nextInt();
            for (int i = position; i < Pumpsize - 1; i++) {
                pump1[i] = pump1[i + 1];
                System.out.println(pump1[i] );
            }
        }



        if (Pump == 2) {
            System.out.println("Enter the position number u want to remove the customer");
            int position = c.nextInt();
            for (int i = position; i < Pumpsize - 1; i++) {
                pump2[i] = pump2[i + 1];
                System.out.println(pump2[i] );
            }
        }

        if (Pump == 3) {
            System.out.println("Enter the position number u want to remove the customer");
            int position = c.nextInt();
            for (int i = position; i < Pumpsize - 1; i++) {
                pump3[i] = pump3[i + 1];
                System.out.println(pump3[i] );
            }
        }
    }


    private static void RemoveServedCustomer(){
           Scanner b=new Scanner(System.in);
            System.out.println("Enter the Pump number 1, 2 or 3");
           int pump=b.nextInt();
           int pumpsize=6;
           if(pump==1){
               System.out.println("Enter the served customers position");
               int position=b.nextInt();
               for(int i = position; i<pumpsize-1;i++ ){
                   pump1[i]=pump1[i+1];
                   System.out.println(pump1[i] + "" + "should serve fuel");

               }
               pumpsize--;

           }
            else if(pump==2){
                System.out.println("Enter the served customers position");
                int position=b.nextInt();
                for(int i = position; i<pumpsize-1;i++ ){
                    pump2[i]=pump2[i+1];
                    System.out.println(pump2[i] + "" + "should serve fuel");

                }
                pumpsize--;

            }
            else if(pump==3){
                System.out.println("Enter the served customers position");
                int position=b.nextInt();
                for(int i = position; i<pumpsize-1;i++ ){
                    pump3[i]=pump3[i+1];
                    System.out.println(pump3[i] + "" + "should serve fuel");
                    ;
                }
                pumpsize--;

            }
        }
        private static void AlphabeticOrder() {  // once all customers are added into the pump this method is used to make the names in alphabetic order.
            Scanner e = new Scanner(System.in);
            System.out.println("Enter the Pump number 1, 2 or 3");
            int pump = e.nextInt();
            if (pump == 1) {
                int n = pump1.length;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {

                        if (pump1[i].compareTo(pump1[j]) > 0) {
                            String temp = pump1[i];
                            pump1[i] = pump1[j];
                            pump1[j] = temp;
                        }
                    }
                }

                System.out.println("Names in arranged order are:-");
                for (int i = 0; i < n; i++) {
                    System.out.println(pump1[i]);
                }

            }
            if (pump == 2) {
                int n = pump2.length;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {

                        if (pump2[i].compareTo(pump2[j]) > 0) {
                            String temp = pump2[i];
                            pump2[i] = pump2[j];
                            pump2[j] = temp;
                        }
                    }
                }

                System.out.println("Names in arranged order are:-");
                for (int i = 0; i < n; i++) {
                    System.out.println(pump2[i]);
                }

            }
            if (pump == 3) {
                int n = pump3.length;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {

                        if (pump3[i].compareTo(pump3[j]) > 0) {
                            String temp = pump3[i];
                            pump3[i] = pump3[j];
                            pump3[j] = temp;
                        }
                    }
                }

                System.out.println("Names in arranged order are:-");
                for (int i = 0; i < n; i++) {
                    System.out.println(pump3[i]);
                }

            }
        }
        private static void StoreProgram()throws IOException {
            BufferedWriter writer=new BufferedWriter(new FileWriter("Array Version.txt"));
            writer.write(Arrays.toString(pump1));
            writer.write(Arrays.toString(pump2));
            writer.write(Arrays.toString(pump3));
            writer.close();

        }
        private static void LoadProgram()throws IOException{
           try{
               BufferedReader reader=new BufferedReader(new FileReader("Array Version.txt"));
               String read;
               while(((read=reader.readLine()))!=null){
                   System.out.println(read);
               }
               reader.close();
           }catch (FileNotFoundException e){
               e.printStackTrace();
           }
        }
        private static void ViewRemainingFuelStock(){
            System.out.println("Remaining Fuel Stock is " +  + FuelStock + "l");
            if(FuelStock==500){  // this if statement is used as once the fuel reaches 500l a warning sign displays.
                System.out.println("WARNING!!!!!  ----  LOW FUEL");
            }

        }
        private static void AddFuel(){
           Scanner d = new Scanner(System.in);
           System.out.println("How many Fuel litres you want to add-");
           int AddFuel=d.nextInt();
           FuelStock = FuelStock + AddFuel;
           System.out.println(AddFuel + "Litres added to stock\n"  +  FuelStock  +  "Litres in total"  );
        }


         static int FuelStock=6600;  // this to show that initially it has 6600l
         static int i = 6;
         static int j;

         static String[] pump1 = new String[6];
         static String[] pump2 = new String[6]; //Creating 3 arrays named pump1, pump2, pump3 with 6 elements each.
         static String[] pump3 = new String[6];

         public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
             String text;
        while (true) {
            System.out.println("____________FUEL MENU____________");  // full menu  is created for the user
            System.out.println("100 or VFQ: View all Fuel Queues");
            System.out.println("101 or VEQ: View all Empty Queues");
            System.out.println("102 or ACQ: Add customer to a Queue");
            System.out.println("103 or RCQ: Remove a customer from a Queue. (From a specific location)");
            System.out.println("104 or PCQ: Remove a served customer");
            System.out.println("105 or VCS: View Customers Sorted in alphabetical order (Do not use library sort routine)");
            System.out.println("106 or SPD: Store Program Data into file.");
            System.out.println("107 or LPD: Load Program Data from file.");
            System.out.println("108 or STK: View Remaining Fuel Stock.");
            System.out.println("109 or AFS: Add Fuel Stock");
            System.out.println("999 or EXT: Exit the Program");
            System.out.println("enter the value");

            text = input.next();

        // used if else statement to show each and every option
            if (text.equals("100") || text.equals("VFQ")) {
                System.out.println("View all Fuel Queues");
                for (int i = 0; i <= 5; i++) {
                    System.out.println("pump1:" + pump1[i]);
                }
                for (int i = 0; i <= 5; i++) {
                    System.out.println("pump2:" + pump2[i]);
                }
                for (int i = 0; i <= 5; i++) {
                    System.out.println("pump3:" + pump3[i]);
                }

            } else if (text.equals("101") || text.equals("VEQ"))
            {
                System.out.println("View all Empty Queues");
                if(isArrayEmpty(pump1)){
                    System.out.println("pump1 is empty");
                }
                if(isArrayEmpty(pump2)){
                    System.out.println("pump2 is empty");
                }
                if(isArrayEmpty(pump3)){
                    System.out.println("pump3 is empty");
                }

//                Scanner a = new Scanner(System.in);
//                System.out.println("Enter the pump number 1, 2, 3");
//                pump = a.next();
//
//                    for (int i = 0; i <= 5; i++)
//                        if (pump.equals("1")) {
//                            System.out.println(pump1[i]);
//
//                        }
//                    for (int i = 0; i <= 5; i++)
//                        if (pump.equals("2")) {
//                            System.out.println(pump2[i]);

//                        }
//                    for (int i = 0; i <= 5; i++)
//                        if (pump.equals("3")) {
//                            System.out.println(pump3[i]);
//
//                        }


            } else if (text.equals("102") || text.equals("ACQ")) {
                System.out.println("Add customer to a Queue"  );
                addCustomers();

            } else if (text.equals("103") || text.equals("RCQ")) {
                System.out.println("Remove a customer from a Queue");
                removeCustomer();

            } else if (text.equals("104") || text.equals("PCQ")) {
                System.out.println("Remove a served customer");
                RemoveServedCustomer();
            } else if (text.equals("105") || text.equals("VCS")) {
                System.out.println("View Customers Sorted in alphabetical order");
                AlphabeticOrder();
            } else if (text.equals("106") || text.equals("SPD")) {
                System.out.println("Store Program Data into file");
                StoreProgram();
            } else if (text.equals("107") || text.equals("LPD")) {
                System.out.println("Load Program Data from file");
                LoadProgram();
            } else if (text.equals("108") || text.equals("STK")) {
                System.out.println("View Remaining Fuel Stock");
                ViewRemainingFuelStock();
            } else if (text.equals("109") || text.equals("AFS")) {
                System.out.println("Add Fuel Stock");
                AddFuel();
            } else if (text.equals("999") || text.equals("EXT")) {
                System.out.println("Exit the Program");
                break;
            } else {
                System.out.println("Invalid ");
            }


        }

    }


}

