
import java.util.Scanner;

class Employee
{
    private String name;
    private String email;
    private Long phone;
    private float salary;
    private String city;
    private int id;
   public void setName(String name){
        this.name =name;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getPhone() {
        return phone;
    }
    public void setPhone(Long phone) {
        this.phone = phone;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}



public class Data {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Employee e=new Employee();

        //setting the data

        System.out.println("enter the name:");
        e.setName(scan.nextLine());
        System.out.println("enter the email:");
        e.setEmail(scan.nextLine());
        System.out.println("enter the phone number:");
        e.setPhone(scan.nextLong());
        System.out.println("enter the salary:");
        e.setSalary(scan.nextFloat());
        System.out.println("enter the city:");
        scan.nextLine();
        e.setCity(scan.nextLine());
        System.out.println("enter the employee id:");
        e.setId(scan.nextInt());

        //getting the data
        System.out.println(e.getName());
        System.out.println(e.getEmail());
        System.out.println(e.getPhone());
        System.out.println(e.getSalary());
        System.out.println(e.getCity());
        System.out.println(e.getId());
    }
    
}
