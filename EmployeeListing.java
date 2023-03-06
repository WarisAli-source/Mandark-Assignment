import java.io.*;

public class EmployeeListing {
    public static void main(String[] args) {
        File inputFile = new File("/Users/wali/Downloads/Assignment/src/employees.csv");
        File outputManagerFile = new File("manager.csv");
        File outputSingleNameFile = new File("single_name_employees.csv");
        String managerRole = "Manager";
        String rdDivision = "R&D";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter managerWriter = new BufferedWriter(new FileWriter(outputManagerFile));
             BufferedWriter singleNameWriter = new BufferedWriter(new FileWriter(outputSingleNameFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                String role = data[1];
                String division = data[2];

                if (role.equals(managerRole) && division.equals(rdDivision)) {
                    managerWriter.write(line);
                    managerWriter.newLine();
                }

                if (name.split(" ").length == 1) {
                    singleNameWriter.write(line);
                    singleNameWriter.newLine();
                }
            }

            System.out.println("Output written to files: " + outputManagerFile.getName() + ", " + outputSingleNameFile.getName());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
