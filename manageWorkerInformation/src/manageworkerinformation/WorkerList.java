package manageworkerinformation;

import java.util.ArrayList;

public class WorkerList {
    private ArrayList<Worker> workerList;

    public WorkerList() {
        this.workerList = new ArrayList<>();
    }

    public ArrayList<Worker> getWorkerList() {
        return workerList;
    }

    public void addWorkerList(Worker worker) {
        workerList.add(worker);
    }
   
        public boolean checkDuplicateId(WorkerList workerList, String id)
        {

           return workerList.getWorkerList().stream().anyMatch(s -> s.getCode().equals(id));
//            return workerList.getWorkerList().stream().filter(c -> c.getCode().equals(id)).findFirst().isPresent();
        }
         
          
public void show(WorkerList workerList) {
    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Code", "Name", "Age", "Salary", "Status", "Date");

    if (workerList.getWorkerList().isEmpty()) {
        System.out.println("Empty Table");
    } else {
        for (Worker w : workerList.getWorkerList()) {
            ArrayList<SalaryHistory> historyMoneyList = w.getHistoryMoneyList();
            boolean initialSalarySkipped = false;
            for (SalaryHistory salaryHistory : historyMoneyList) {
                if (salaryHistory.getStatus().equals("-")) {
                    initialSalarySkipped = true;
                } else {
                    if (!initialSalarySkipped) {
                        initialSalarySkipped = true;
                    } else {
                        System.out.printf("%-10s %-10s %-10d %-10d %-10s %-10s\n", w.getCode(), w.getName(),
                                          w.getAge(), salaryHistory.getSalary(), salaryHistory.getStatus(),
                                          Utitlity.toLocalDate(salaryHistory.getDateTime()));
                    }
                }
            }
        }
    }
}




        
         public void deleteWorker (WorkerList workerList, String codeOut)
        {
          
            String code = codeOut;
            
            boolean result = workerList.getWorkerList().removeIf(s -> s.getCode().equals(code));
            if(result)
            {
                System.out.println("Delete Success !");
            }else{
                System.out.println("Can not found worker !");
            }
        }
}
