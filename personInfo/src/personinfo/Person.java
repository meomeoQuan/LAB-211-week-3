package personinfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String name, address;
    private double salary;
    private ArrayList<PersonList> pls = new ArrayList<>();

    public Person(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
//        this.pls = new ArrayList<>(); // Initialize the list
    }

    public Person() {
    }

    public ArrayList<PersonList> getPls() {
        return pls;
    }
    
 

    public String getName() {
        return name;
    }

   
    public String getAddress() {
        return address;
    }

   

    public double getSalary() {
        return salary;
    }

 

    private  static String nhap(String msg) {
        System.out.println(msg);
        return new Scanner(System.in).nextLine();
    }

    public static String emptyCheck(String msg) {
        do {
            String check = nhap(msg);
            if (check.isEmpty() || check.length() == 0) {
                System.err.println("Empty Valid!");
            } else {
                return check;
            }
        } while (true);
    }

    public static double convertDouble(String msg) {
        do {
            String check = emptyCheck(msg);
            try {
                double number = Double.parseDouble(check);
                if (number < 0) {
                    System.err.println("salary must be a positive number");
                } else {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.err.println("You must input digit.");
            }
        } while (true);
    }
     public static int convertInt(String msg) {
        do {
            String check = emptyCheck(msg);
            try {
                return Integer.parseInt(check);
                         
            } catch (NumberFormatException e) {
               System.err.println("You must input digit.");
            }
        } while (true);
    }

    
    

    @Override
public String toString() {
    return "Name: " + name + "\n" +
           "Address: " + address + "\n" +
           "Salary: " + String.format("%.1f", salary) + "\n";
}

    
            }
