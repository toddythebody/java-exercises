package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Studentid {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        int id = 1;
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                students.put(id, newStudent);
                id++;

                // Read in the newline before looping back
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }

    }

}

