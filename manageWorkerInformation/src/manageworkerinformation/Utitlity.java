/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageworkerinformation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Utitlity {
         private static String nhap(String msg)
         {
             System.out.println(msg+"");
             return new Scanner(System.in).nextLine();
         }
         public static String emptyCheck ( String msg)
         {
             do{
                String check = nhap(msg);
                 if (check.isEmpty() || check.length() == 0) {
                     System.err.println("Null !");
                 }else{
                     return check;
                 }
             }while (true);                  
                 
             }
//         public static String emptyCheck(String msg) {
//        return Stream.generate(() -> nhap(msg))
//                 .filter(check -> !check.isEmpty())
//                 .findFirst()
//                 .orElseThrow(() -> new IllegalArgumentException("Input cannot be empty"));
//}
         private static int nhapSo (String msg)
         {
             while (true) {                 
                 String check = emptyCheck(msg);
                 
                 try {
                     return Integer.parseInt(check);
                 } catch (NumberFormatException e) {
                     System.err.println("Please Enter number !");
                 }
             }
         }
         public static int nhapTuoi (String n)
         {
             while (true) {                 
                 int age = nhapSo(n);
                 if(age < 18 || age > 50)
                 {
                     System.err.println("Age must in range 18 -> 50");
                 }else{
                     return age;
                 }
                 
             }
         }
         public static int nhapLuong (String n)
         {
             do{
                 int salary = nhapSo(n);
                 if(salary <= 0)
                 {
                     System.err.println("Salary must greater than 0 !");
                 }else{
                       return salary;
                 }
               
             }while(true);
         }
         
    
         public static void addWorker(WorkerList workerList)
        {
            System.out.println("----------------------- Add Worker --------------------");
            String code;
            while(true)
            {
               code = emptyCheck("Enter Code: ");
                if(workerList.checkDuplicateId(workerList, code))
                {
                    System.err.println("Duplicated Code Existed !");
                }else{
                    break;
                }
            }
            String name = emptyCheck("Enter Name: ");
            int age = nhapTuoi("Enter Age: ");
            String workLocation = emptyCheck("Enter Work location: ");
            int salary = nhapLuong("Enter Salary: ");
             SalaryHistory salaryHistory = new SalaryHistory(salary);
             Worker worker = new Worker(code, name, workLocation, age);
             worker.addSalaryHistory(salaryHistory);
             workerList.addWorkerList(worker);

            System.out.println("Worker added successfully!");
            
        }
          public static void changeSalaryUp(WorkerList workerList) {
    System.out.println("----------------------- Up/Down Salary --------------------");
    String code = emptyCheck("Enter Code: ");
    int addSalary = nhapLuong("Enter Salary: ");

    Worker worker = workerList.getWorkerList().stream()
                               .filter(w -> w.getCode().equals(code))
                               .findFirst()
                               .orElse(null);

    if (worker != null) {
        int oldSalary = worker.getHistoryMoneyList().isEmpty() ? 0 : 
                        worker.getHistoryMoneyList().get(worker.getHistoryMoneyList().size() - 1).getSalary();
        int newSalary = oldSalary + addSalary; // Calculate new salary by adding additional salary

        SalaryHistory newSalaryHistory = new SalaryHistory(newSalary);
        newSalaryHistory.setStatus(oldSalary, newSalary);
        newSalaryHistory.setDateTime(LocalDate.now());
        worker.addSalaryHistory(newSalaryHistory);
        System.out.println("Salary updated successfully!");
    } else {
        System.err.println("Worker not found!");
    }
}
                   public static void changeSalaryDown (WorkerList workerList) {
    System.out.println("----------------------- Up/Down Salary --------------------");
    String code = emptyCheck("Enter Code: ");
    int subtractSalary = nhapLuong("Enter Salary: ");

    Worker worker = workerList.getWorkerList().stream()
                               .filter(w -> w.getCode().equals(code))
                               .findFirst()
                               .orElse(null);

    if (worker != null) {
        int oldSalary = worker.getHistoryMoneyList().isEmpty() ? 0 : 
                        worker.getHistoryMoneyList().get(worker.getHistoryMoneyList().size() - 1).getSalary();
        int newSalary = oldSalary - subtractSalary; // Calculate new salary by adding additional salary

        SalaryHistory newSalaryHistory = new SalaryHistory(newSalary);
        newSalaryHistory.setStatus(oldSalary, newSalary);
        newSalaryHistory.setDateTime(LocalDate.now());
        worker.addSalaryHistory(newSalaryHistory);
        System.out.println("Salary updated successfully!");
    } else {
        System.err.println("Worker not found!");
    }
}

         public static String toLocalDate(LocalDate localDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return localDate.format(formatter);
    }
         public static LocalDate toLocalStringDate (String sdate)
         {
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
             return LocalDate.parse(sdate, formatter);
         }
   
}
         
 



