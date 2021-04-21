public class Calculator {

    public static int add(int val1, int val2){
        return val1 + val2;
    }

    public static boolean moreThan100(int val){
        return val > 100;
    }

    public static String alarmMessage(int peopleInShop){
        if (peopleInShop >= 30) {
            return "Zu viele Personen";
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }


}
