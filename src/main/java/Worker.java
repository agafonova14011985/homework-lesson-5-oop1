public class Worker{

    private String fulName;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;


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

    public int getAge() {return  this.age;}
    public void inform() {
        System.out.printf(" fulName : %s\n position : %s\n email : %s\n phone : %s\n salary : %s\n age %s\n", this.fulName, this.position, this.email, this.phone, this.salary,  this.age);
    }


}