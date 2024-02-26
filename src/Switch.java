public class Switch {

    public static void main(String[] args) {
        
//        int value = 1;
//        if(value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was a 3, 4, or 5");
                System.out.println("Value was: " + switchValue);
            }
            default -> System.out.println("Value was not 1 ,2, 3, 4, or 5");
        }
        String month = "OCRT";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter.");

    }
    public static String getQuarter(String month){

        return switch (month) {
            case "JAN", "FEB", "MAR" -> "1st";
            case "APR", "MAY", "JUN" -> "2nd";
            case "JUL", "AUG", "SEP" -> "3rd";
            case "OCT", "NOV", "DEC" -> "4th";
            default ->{
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
