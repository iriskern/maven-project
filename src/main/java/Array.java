public class Array {

    public static void main(String[] args) {
        String[] studentsList = students(5);
        for (int i=0; i < studentsList.length; i++){
            System.out.println(studentsList[i]);
        }
    }

    public static String[] students(int amountOfStudents){

        String[] listOfStudents = new String[amountOfStudents];

        for (int i=0; i < listOfStudents.length; i++){
            listOfStudents[i] = "Student " + (i+1);
        }

        return listOfStudents;
    }
}
