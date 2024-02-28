public class DigitSumChallenge {

    public static void main(String[] args) {

        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(3));
        System.out.println(sumDigits(-1234));

    }

    public static int sumDigits(int number){

        if(number < 0){
            return -1;
        }

        if(number%10==number){
            return number;
        }

        int sum = 0;
        int value = number;

        while (value>0){
            sum+= value%10;
            value = value/10;
        }

       return sum;

    }
}
