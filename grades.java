import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String amountString = "";
        while (amountString.isEmpty()) {
            System.out.print("Cati studenti sunt?");
            amountString = scan.nextLine().trim();


            if (!amountString.matches("\\d+") || Integer.valueOf(amountString) < 1
                    || Integer.valueOf(amountString) > 50) {

                System.err.println("Valoare gresita (" + amountString + ") pentru Student "
                        + "Incearca din nou...");
                amountString = "";
                System.out.println();
            }
        }


        int amount = Integer.valueOf(amountString);


        String[] student = new String[amount];
        int grade[] = new int[amount];


        for (int i = 0; i < amount; i++) {

            String name = "";
            while (name.isEmpty()) {
                System.out.print("Introducere student #" + (i + 1) + " nume: --> ");
                name = scan.nextLine().trim();

                if (!name.matches("(?i)([a-z]+)(\\s{1})?([a-z]+)?")) {

                    System.err.println("Invalid Student " + (i + 1) + " nume ("
                            + name + "Incearca din nou...");
                    System.out.println();
                    name = "";
                }
            }

            student[i] = name;


            String gradeString = "";
            while (gradeString.isEmpty()) {
                System.out.print("Introducere student #" + (i + 1) + " grade: --> ");
                gradeString = scan.nextLine().trim();

                if (!gradeString.matches("\\d+")
                        || Integer.valueOf(gradeString) < 0
                        || Integer.valueOf(gradeString) > 100) {

                    System.err.println("Introducere gresita (" + gradeString + ") pentru "
                            + "Student #" + (i + 1) + " grade!Incearca din nou...");
                    gradeString = "";
                    System.out.println();
                }
            }

            grade[i] = Integer.valueOf(gradeString);
        }


        System.out.println();
        for (int i = 0; i < amount; i++) {
            System.out.println(student[i] + " primire final grade  " + grade[i]);
        }
        System.out.println();


        int index = maxGrade(grade, amount);
        System.out.println("Cea mai mare valoare grade a fost pentru '" + student[index]
                + "' cu grade de: " + grade[index]);

        index = minGrade(grade, amount);
        System.out.println("Cea mai mica valoare grade a fost pentru '" + student[index]
                + "' cu grade de: " + grade[index]);


    }

    public static int minGrade(int[] arr, int size) {

        int min = Integer.MAX_VALUE;
        int returnableIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                returnableIndex = i;
            }
        }
        return returnableIndex;
    }

    public static int maxGrade(int[] arr, int size) {
        int max = Integer.MIN_VALUE;
        int returnableIndex = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
                returnableIndex = i;
            }
        }
        return returnableIndex;
    }
}