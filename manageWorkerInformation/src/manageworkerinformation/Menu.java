/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageworkerinformation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public abstract class Menu <T>{
    
    private  String title;
    private final ArrayList<T> arrayChoice;

    public Menu(String title, T [] mchon) {
        this.title = title;
        this.arrayChoice = new ArrayList<>();
        for( T s : mchon)
        {
            arrayChoice.add(s);
        }
    }
    
    public abstract void execute(int chon);
    
    public int selected()
    {
        Show();
        System.out.println("Enter your choice: ");
        return new Scanner(System.in).nextInt();
    }
    public void run()
    {
        while (true) {            
           int choice = selected();
           if(choice > arrayChoice.size())
           {
               break;
           }else{
               execute(choice);
           }
                   
        }
    }
    public void Show()
    {
        System.out.println("======== "+title+" ========");
        
        for(int i = 0 ; i < arrayChoice.size(); i++)
        {
            System.out.println((i+1)+"."+arrayChoice.get(i));
        }
       
    }
    
    
    
    
    
}
    