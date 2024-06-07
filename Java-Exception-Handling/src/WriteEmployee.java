import java.io.*;
import java.util.Scanner;

class Employee {
    private int empNo;
    private String empName;
    private int empBasic;

    public Employee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpBasic() {
        return empBasic;
    }
}

public class WriteEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get details of an employee from the user
        System.out.println("Enter employee number:");
        int empNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter employee name:");
        String empName = scanner.nextLine();
        System.out.println("Enter employee basic salary:");
        int empBasic = scanner.nextInt();

        // Create an Employee object with the provided details
        Employee employee = new Employee(empNo, empName, empBasic);

        // Write employee details to a file emp.txt
        try (PrintWriter writer = new PrintWriter("emp.txt")) {
            writer.println(employee.getEmpNo());
            writer.println(employee.getEmpName());
            writer.println(employee.getEmpBasic());
            System.out.println("Employee details written to emp.txt successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred while writing to file.");
//            e.printStackTrace();
        }

        // Read employee details from the file and display them
        try (BufferedReader reader = new BufferedReader(new FileReader("emp.txt"))) {
            System.out.println("\nReading employee details from emp.txt:");
            int empNoFromFile = Integer.parseInt(reader.readLine());
            String empNameFromFile = reader.readLine();
            int empBasicFromFile = Integer.parseInt(reader.readLine());

            // Create an Employee object from the read details
            Employee employeeFromFile = new Employee(empNoFromFile, empNameFromFile, empBasicFromFile);

            // Display the employee details
            System.out.println("Employee Number: " + employeeFromFile.getEmpNo());
            System.out.println("Employee Name: " + employeeFromFile.getEmpName());
            System.out.println("Employee Basic Salary: " + employeeFromFile.getEmpBasic());
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
//            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error occurred while reading from file.");
//            e.printStackTrace();
        }
    }
}
