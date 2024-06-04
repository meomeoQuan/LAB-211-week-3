/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageworkerinformation;

import java.time.LocalDate;

/**
 *
 * @author mac
 */
public class SalaryHistory {
    private String status ;
    private LocalDate dateTime;
    private int salary;

   

    public SalaryHistory(int salary) {
        this.salary = salary;
        this.status = "  -";
        this.dateTime = LocalDate.now();
    }
    
     
    public String getStatus() {
        return status;
    }

   
    public void setStatus(int oldSalary, int newSalary) {
        if (newSalary > oldSalary) {
            this.status = "UP";
        } else if (newSalary < oldSalary) {
            this.status = "DOWN";
        } else {
            this.status = "-";
        }
    }

    public LocalDate getDateTime() {
        return LocalDate.now();
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = Utitlity.toLocalStringDate(Utitlity.toLocalDate(dateTime));
    }

   

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
