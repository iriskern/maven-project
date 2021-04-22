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
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }

    private static int getNumberOfPeopleAllowed(String alarmLevel) {
        return switch (alarmLevel) {
            case "red" -> 0;
            case "yellow" -> 30;
            case "green" -> 60;
            default -> 0;
        };
    }


}
