import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class MyArrayListSort {
     
    public static void main(String a[]){
         
        List<Empl> list = new ArrayList<Empl>();
        list.add(new Empl("Ram",3000));
        list.add(new Empl("John",6000));
        list.add(new Empl("Crish",2000));
        list.add(new Empl("Tom",2400));
        Collections.sort(list);
        System.out.println("Sorted list entries: ");
        for(Empl e:list){
            System.out.println(e);
        }
    }
}
 
 
class Empl implements Comparable<Empl>{
     
    private String name;
    private int salary;
     
    public Empl(String n, int s){
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }
     @Override
        public int compareTo(Empl em) {
            if(this.getSalary()<em.getSalary())
            return -1;
            else
            return 1;
        }
}