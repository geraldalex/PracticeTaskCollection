 class Student {

    private String name;
    private int id;
    private int pay;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPay() {
        return pay;
    }

    public Student(String name, int id, int pay) {
        this.name = name;
        this.id = id;
        this.pay = pay;
    }

     @Override
     public String toString() {
         return "Порядковый номер работника : " + id +
                 "  Имя работника : " + name +
                 "  Введите зароботную плату  работника :  " + pay ;
     }
 }

