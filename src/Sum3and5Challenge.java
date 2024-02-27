public class Sum3and5Challenge {

    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;

        for (int i = 1; (counter < 5 && i < 1001); i++) {

            if((i%3==0)&&(i%5==0)){
                sum+=i;
                counter++;
                System.out.println("number: " +i + " met the condition.");
            }
        }

        System.out.println("The sum of numbers that met the condition is = " + sum);
    }
}
