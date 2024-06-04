package manageworkerinformation;

import java.time.LocalDate;
import java.util.ArrayList;

public class Worker implements Comparable<Worker>{
    private String code, name, workLocation;
    private int age;
    private ArrayList<SalaryHistory> historyMoneyList;

    public Worker(String code, String name, String workLocation, int age) {
        this.code = code;
        this.name = name;
        this.workLocation = workLocation;
        this.age = age;
        this.historyMoneyList = new ArrayList<>();
    }

    public Worker() {}

    public String getCode() {
        return code;
    }

    public void addSalaryHistory(SalaryHistory salaryHistory) {
        this.historyMoneyList.add(salaryHistory);
    }

    public ArrayList<SalaryHistory> getHistoryMoneyList() {
        return historyMoneyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (SalaryHistory sh : historyMoneyList) {
//            sb.append(String.format("%-10s %-10s %-10d %-10d %-10s %-10s\n", getCode(), getName(), 
//                    getAge(), sh.getSalary(), sh.getStatus(), Utitlity.toLocalDate(sh.getDateTime())));
//        }
//        return sb.toString();
//    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(SalaryHistory sh : historyMoneyList)
        {
            sb.append(String.format("%-10s %-10s %-10s %-10d %-10s %-10s\n", getCode(),getName(),getAge(),sh.getSalary(),sh.getStatus(),Utitlity.toLocalDate(sh.getDateTime())));
        }
        return sb.toString();
    }
    

    @Override
    public int compareTo(Worker o) {
        return getCode().compareTo(o.getCode());
    }
}
