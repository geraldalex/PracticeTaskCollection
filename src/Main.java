import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> workers =  new ArrayList<>();
        Scanner scanner = new Scanner(System.in );
        Scanner scanner1 = new Scanner(System.in);
        String sName;
        int  sId;
        int sPay;
        int count;
        System.out.println("Выберите способ вода : если нажмете 1 то работники по умолчанию, если 2 то пользователь вводит работников");
        int choice = scanner.nextInt();
        if(choice == 1){

            workers.add(new Student("Алекс", 1,30000));
            workers.add(new Student("Антон", 2,20000));
            workers.add(new Student("Петр", 3,35000));
            workers.add(new Student("Алексей", 4,50000));
            workers.add(new Student("Илья", 5,10000));
            workers.add(new Student("Денис", 6,24000));
            workers.add(new Student("Вадим", 7,20000));

        }else if(choice == 2) {
            for (count = 0; count < 7; count++) {
                System.out.println("Введите порядковый номер работника :  ");
                sId = scanner.nextInt();

                System.out.println("Введите имя работника :  ");
                sName = scanner1.nextLine();

                System.out.println("Введите зароботную плату  работника :  ");
                sPay = scanner.nextInt();

                workers.add(new Student(sName, sId, sPay));
            }
        }

        System.out.println("\n");


        Collections.sort(workers, new Comparator<Student>(){
            public int compare(Student s1, Student s2){
               return Integer.valueOf(s2.getPay()).compareTo(s1.getPay());
            }
        });

        for (count = 0; count<workers.size(); count++){
            System.out.println(workers.get(count).toString());
        }

        System.out.println("\n\n");

    List<Student> workers2 = workers.subList(0,5);
        for (count = 0; count<workers2.size(); count++){
            System.out.println(workers2.get(count).toString());
        }
        System.out.println("\n\n");

        List<Student> workers3 = workers.subList(workers.size()-3,workers.size());
        for (count = 0; count<workers3.size(); count++){
            System.out.println(workers3.get(count).toString());
        }

    }


}
