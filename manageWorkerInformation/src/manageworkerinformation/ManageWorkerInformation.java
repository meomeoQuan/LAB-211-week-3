/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manageworkerinformation;

/**
 *
 * @author mac
 */
public class ManageWorkerInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String [] mchon = {"Add Worker","Up Salary","Down Salary","Display Information Display","Delete Worker","Exit"};
       Menu<String> wMenu= new WorkerMenu("Worker Management", mchon);
       wMenu.run();
       
    }
    
}
