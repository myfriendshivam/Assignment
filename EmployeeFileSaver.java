package oops.SOLID.singleResponsibilityPrinciple.after;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EmployeeFileSaver {
    public static void save(Employee employee) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("### EMPLOYEE RECORD ####\n");
            sb.append("NAME: ").append(employee.getFullName()).append("\n");
            sb.append("POSITION: ").append(employee.getPosition()).append("\n");
            sb.append("EMAIL: ").append(employee.getEmail()).append("\n");
            sb.append("MONTHLY WAGE: ").append(employee.getMonthlyIncome()).append("\n");

            String fileName = employee.getFullName().replace(" ", "_") + ".rec";
            Path path = Paths.get(fileName);
            Files.write(path, sb.toString().getBytes());

            System.out.println("Saved employee " + employee.toString());
        } catch (IOException e) {
            System.out.println("ERROR: Could not save employee. " + e.getMessage());
        }
    }
}
