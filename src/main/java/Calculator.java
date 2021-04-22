public class Calculator {

     public static int add(int val1, int val2){
        return val1 + val2;
    }

    public static boolean moreThan100(int val){
        return val > 100;
    }

    public static String alarmMessage(int peopleInShop, String alarmLevel){
        int numberOfPeopleAllowed = getNumberOfPeopleAllowed(alarmLevel);

        if (peopleInShop > numberOfPeopleAllowed) {
            return "Zu viele Personen";
        }
        return "Maximale Personenzahl nicht überschritten";

    }

    public static int getNumberOfPeopleAllowed(String alarmLevel) {
        return switch (alarmLevel) {
            case "red" -> 0;
            case "yellow" -> 30;
            case "green" -> 60;
            default -> 0;
        };
    }

    public static int calculateFaculty(int numberToCalculate){
        int result = 1;
        for(int i=1; i <= numberToCalculate; i++){
            result *= i;
        }
        return result;
    }

    public static int calculateFacultyWithWhileLoop(int numberToCalculate){
        int result = 1;
        int i=1;
        while(i <= numberToCalculate){
            result *= i;
            i++;
        }
        return result;
    }

    public static int calculateFacultyWithRecusion(int numberToCalculate){
        if(numberToCalculate < 1){
            return 1;
        }
        return calculateFacultyWithRecusion(numberToCalculate -1) * numberToCalculate;
    }

}
