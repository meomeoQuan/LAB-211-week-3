/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personinfo;

/**
 *
 * @author mac
 */
public class Menu {
     
    private static int selected (int min, int max)
    {
        while(true){
         int choice = Person.convertInt("Enter your choice: ");
        if(choice < min || choice > max)
        {
            System.err.println("Choice must be in range "+min +"->"+max);
        }else{
            return choice;
        }
    }
   }
    public static int displayMenu (String [] mchon, int min , int max)
    {
        System.out.println("=====Management Person programer=====");
        for(int i = 0 ; i < mchon.length ; i++)
        {
            System.out.println((i+1)+"."+mchon[i]);
        }
       return selected(min, max);
        
    }
   
    
    
}
