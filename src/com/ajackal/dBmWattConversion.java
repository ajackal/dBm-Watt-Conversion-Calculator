package com.ajackal;

public class dBmWattConversion {

    private String conversionType = "dbmToWATT";
    private double inputValue;

    private double dbm2watt() {
        double pow = this.inputValue / 10;
        return Math.pow(10.0, pow)/1000;
    }

    private double watt2dbm() {
        return 10 * Math.log10(1000 * this.inputValue);
    }

    void setConversion(String conversionTypeButtonSelection){
        this.conversionType = conversionTypeButtonSelection;
    }

    void setInputValue(String input){
        this.inputValue = Double.parseDouble(input);
    }

//    private void runAgain () {
//        System.out.println("Run another calculation? (1=yes, 2=no)");
//        Scanner scan = new Scanner(System.in);
//        int Choice = scan.nextInt();
//        switch (Choice) {
//            case 1:
//                this.runConversion();
//                break;
//            case 2:
//                exit(0);
//            default:
//                System.out.println("Input choice error, exiting!");
//                exit(0);
//        }
//    }

    double runConversion() {
        double answer = 0.0;
        switch (this.conversionType){
            case "dbmToWATT":
                answer = dbm2watt();
                break;
            // System.out.println("Your answer is: " + dBm_result);
            // this.runAgain();
            case "wattToDBM":
                answer = watt2dbm();
                break;
            // System.out.println("Your answer is: " + watt_result);
            // this.runAgain()
        }
        return answer;
        /*
        System.out.println("Enter your conversion type 1=(dBm -> Watt) OR 2=(Watt -> dBm):");
        Scanner scan = new Scanner(System.in);
        int Choice = scan.nextInt();
        switch (Choice) {
            case 1:
                this.setConversion("dbmToWATT");
                System.out.println("How many dBm? ");
                int dbm = scan.nextInt();
                double watt_result = dbm2watt(dbm);
                System.out.println("Your answer is: " + watt_result);
                runAgain();
            case 2:
                this.setConversion("wattToDBM");
                System.out.println("How many Watts? ");
                int watt = scan.nextInt();
                double dBm_result = watt2dbm(watt);
                System.out.println("Your answer is: " + dBm_result);
                runAgain();
            default:
                System.out.println("Input choice error!");
                System.out.println("Try again!");
                runConversion();
         int input = scan.nextInt();
        */
    }
/* uncomment this section to run from command line:
    public static void main(String[] args) {
        dBmWattConversion dbmw = new dBmWattConversion();
        dbmw.runConversion();
        }
*/
}
