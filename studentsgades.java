import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class studentsGrades {
    public static <Student> void main(String[] args) throws IOException {


        List<String> lines = Files.readAllLines(Paths.get("info1.txt"));


        int nbExams = Integer.valueOf(lines.get(0).trim());


        lines.remove(0);
        int nbStudents = lines.size();

        Student[] students = new Student[nbStudents];
        for(int iStudents = 0; iStudents<nbStudents; iStudents++) {
            String line = lines.get(iStudents);


            String[] tokens = line.split(" ");


            String studentName = tokens[0];


            int[] grades = new int[nbExams];
            for(int i=0; i<nbExams; i++) {
                grades[i] = Integer.valueOf(tokens[i+1]);
            }

            students[iStudents] = new Student(studentName, grades);
        }

        System.out.println(Arrays.toString(students));
    }
}
