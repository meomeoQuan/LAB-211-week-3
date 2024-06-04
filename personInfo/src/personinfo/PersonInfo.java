/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personinfo;

/**
 *
 * @author mac
 */
public class PersonInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String [] mchon = {"Input person","Show Person","Exit"};
     
     PersonList personList = new PersonList();
     Person person = new Person();
        while (true) {            
             int choice = Menu.displayMenu(mchon, 1, mchon.length);
            switch(choice)
            {
                case 1 ->{enterInput(personList,person); }
                case 2 ->{personList.sortBubbleBySalary(personList.getPersonList());
                personList.show(personList);}
                case 3 ->{System.err.println("Exit");
                System.exit(0);}
            }
        }
    }
     public static void enterInput(PersonList personList, Person person)
  {
      System.out.println("Input Information of Person");
      String name = Person.emptyCheck("Please input Name: ");
      String address = Person.emptyCheck("Please input Address: ");
      double salary = Person.convertDouble("Please input Salary: ");
      person = new Person(name, address, salary);
      personList.addPerson(person);
      System.out.println("Input Sucessful !");
  }
    
}
