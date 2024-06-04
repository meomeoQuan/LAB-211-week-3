package personinfo;

import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> al;

    public PersonList() {
        this.al = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return al;
    }


    public void addPerson(Person person) {
        al.add(person);
    }

 public void show(PersonList personList) {
    int count = 0;
    if (al.isEmpty()) {
        System.out.println("Empty Table");
    } else {
        for (Person p : al) {
            System.out.println("Information of Person you have entered:");
            System.out.println(p.toString());
            count++;
            if (count == 3) {
                break;
            }
        }
    }
}

  public void sortBubbleBySalary(ArrayList<Person> personLists) {
       
        for (int i = 0; i < personLists.size(); i++) {
            for (int j = 0; j < personLists.size() - i - 1; j++) {
                if (al.get(j).getSalary() > al.get(j + 1).getSalary()) {
                    // Swap al[j] and al[j+1]
                    Person temp = al.get(j);
                    al.set(j, al.get(j + 1));
                    al.set(j + 1, temp);
                }
            }
        }
    }
}
