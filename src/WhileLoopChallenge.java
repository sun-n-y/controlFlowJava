public class WhileLoopChallenge {

    public static void main(String[] args) {

        int number = 4;
        int evenTotal = 0;
        int oddTotal = 0;

        while (number < 21) {
            number++;
            if (!isEvenNumber(number)) {
                oddTotal++;
                continue;
            }
            System.out.println(number + " is an even number.");
            evenTotal++;
            if (evenTotal == 5) {
                break;
            }
        }
        System.out.println("Total Even: " + evenTotal + " Total Odd: " + oddTotal);
    }

    public static boolean isEvenNumber(int value1) {
        return value1 % 2 == 0;
    }
}
