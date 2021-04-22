public class Calculator {

    public static int add(int val1, int val2){
        return val1 + val2;
    }

    public static boolean moreThan100(int val){
        return val > 100;
    }

    public static String alarmMessage(int peopleInShop, String alarmLevel){
        int numberOfPeopleAllowed = 0;
        switch (alarmLevel){
            case "red":
                numberOfPeopleAllowed = 0;
                break;
            case "yellow":
                numberOfPeopleAllowed = 30;
                break;
            case "green":
                numberOfPeopleAllowed = 60;
                break;
            default:
                System.out.println("keine Alarmstufe");
                break;
        }

        if (peopleInShop > numberOfPeopleAllowed) {
            return "Zu viele Personen";
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }


}
