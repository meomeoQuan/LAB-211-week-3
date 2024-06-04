/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageworkerinformation;

import java.util.Collections;

/**
 *
 * @author mac
 */


public class WorkerMenu extends Menu<String>{
   private Worker worker ;
   private WorkerList workerList;
    public WorkerMenu(String title, String[] mchon) {
        super(title, mchon);
        worker = new Worker();
        workerList = new WorkerList();
    }

    @Override
    public void execute(int chon) {
        switch(chon)
        {
            case 1 -> {
                Utitlity.addWorker(workerList);
            }
            case 2 -> {
               Utitlity.changeSalaryUp(workerList);}
            case 3 -> {Utitlity.changeSalaryDown(workerList);}
            case 4 -> { Collections.sort(workerList.getWorkerList());
                workerList.show(workerList);}
            case 5 -> {
                 System.out.println("----------------------- Delete Worker --------------------");
                String codeOut = Utitlity.emptyCheck("Enter Code: ");
                workerList.deleteWorker(workerList, codeOut);}
            case 6 -> {
                System.out.println("We will meet again in the future Quan !");
            System.exit(0);
            }
           
        }
    } 

//     public static void simulateLoading() {
//        String[] loadingStates =    {".","..","...",".","..","..."} ;   
//    
//        int numCycles = 3; // Number of cycles through the loading states
//
//        for (int i = 0; i < loadingStates.length * numCycles; i++) {
//            System.out.print("\r" + loadingStates[i % loadingStates.length]);
//            try {
//                Thread.sleep(300); // Adjust the delay for speed of animation
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("\rLoading complete!");
//    }
}
