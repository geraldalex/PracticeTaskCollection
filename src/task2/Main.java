package task2;

public class Main {
    public static void main(String[] args) {
        MyDictionary<String,Integer> map = new MyDictionary<>();
        map.add("Artem", 10000);
        map.add("Alex", 104450);
        map.add("Petr", 400040);
        map.add("Denis", 100);
        map.add("Yura", 105);
        map.add("Oleg", 500);
        System.out.print("количество элементов в колекции :  ");
        System.out.println(map.getSize());
        System.out.print("Значение по ключу :  ");
        System.out.println(map.myGet("Petr"));

        map.myRemove("Alex");
        System.out.print("количество элементов в колекции, почле удаления oдного элемента :  ");
        System.out.println(map.getSize());
        System.out.print("Преребор значений колекции :  "+"\n");
        map.pereborValue();
        System.out.print("Преребор ключей колекции :  "+"\n");
        map.pereborKey();
    }
}
