public class Worker{

    String fulName;
    String position;
    String email;
    int phone;
    int salary;
    int age;


    //public Worker() { }


   // public Worker(String fulName, String position, String email, int phone, int salary, int age) {
        //this.fulName = fulName;
        //this.position = position;
        //this.email = email;
        //this.phone = phone;
        //this.salary = salary;
        //this.age = age;}

    public Worker(String fulName, String position, String email, int phone, int salary, int age) {
        this.fulName = fulName;
        this.position  = position;
        this.email  = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public void inform() {
        System.out.printf(" fulName : %s\n position : %s\n email : %s\n phone : %s\n salary : %s\n age %s\n", this.fulName, this.position, this.email, this.phone, this.salary,  this.age);
    }


}