public class HomeWorkOop {

    public static void main(String[] args) {

        {
            System.out.println("         1 ");
        }

        Worker worker1 = new Worker("Ivanov Ivan Ivanovich",
                "engineer", "qqqqq@qqq.ru", 12345, 50000, 34);
        worker1.inform();


        {
            System.out.println("         2 ");
        }

        Worker worker2 = new Worker("Petrov Petr Petrovich",
                "engineer", "qqqqq@qqq.ru", 12345, 52000, 35);
        worker2.inform();


        {
            System.out.println("         3 ");
        }

        Worker worker3 = new Worker("Sidorov Ivan Petrovich",
                "engineer", "qqqqq@qqq.ru", 12345, 52000, 40);
        worker3.inform();

        {
            System.out.println("         4 ");
        }

        Worker worker4 = new Worker("Fedorov Evgenij Sergeevich",
                "engineer", "qqqqq@qqq.ru", 12345, 52000, 41);
        worker4.inform();

        {
            System.out.println("         5 ");
        }

        Worker worker5 = new Worker("Lenin Ivan Petrovich",
                "engineer", "qqqqq@qqq.ru", 12345, 55000, 42);
        worker5.inform();
        {
            System.out.println("------------массив из 5 сотрудников-----------------------------------------------");
        }
        {
            System.out.println("------------сотрудник старше 40:--------------");
        }
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Ivanov Ivan Ivanovich", "engineer", "qqqqq@qqq.ru", 1, 0, 34);
        workers[1] = new Worker("Petrov Petr Petrovich", "engineer", "qqqqq@qqq.ru", 1, 0, 35);
        workers[2] = new Worker("Sidorov Ivan Petrovich", "engineer", "qqqqq@qqq.ru", 1, 0, 40);
        workers[3] = new Worker("Fedorov Evgenij Sergeevich", "engineer", "qqqqq@qqq.ru", 1, 0, 40);
        workers[4] = new Worker("Lenin Ivan Petrovich", "engineer", "qqqqq@qqq.ru", 1, 0, 42);

        for (int i = 0; i < 5; i++) {
            if (workers[i].age > 40){ workers[i].inform();}

            //System.out.println(workers[i].age  +" " + workers[i].fulName );
        }



    }}

