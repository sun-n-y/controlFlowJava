public class TheForLoop {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        for (double i = 2.0; i < 6.0; i++) {

        System.out.println("10,000 at "+i +"% interest = " + calculateInterest(10000.0,i) );
        }

//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0,3.0) );
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0,4.0) );

        for (double i = 7.5; i <= 10.0 ; i+= .25) {
            if(calculateInterest(100.00,i)>8.5){
                break;
            }
            System.out.println(calculateInterest(100.00,i));
        }
    }

    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate/100));
    }
}
