public class Employee {
    private String fio;
    private String post;
    private String phone;
    private double salary;
    private int birthday;
    private int today = 2020;
    private int id;
    private static int nextId=1;
    private static Employee[] empArr = new Employee[5];
    public static Employee[] getEmployeesArr() { return empArr;}
    public Employee(String n, String job, String number, double s, int year)
    {
        this.id = nextId++;
        fio = n;
        post=job;
        phone=number;
        salary = s;
        birthday = year;
        empArr[id]=this;
    }

    public int getId() {
        return id;
    }
    public void setId()
    {
        id = nextId;
        nextId++;
    }
    public String getFio()
    {
        return fio;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setBirthday(int aBirthDate)
    {
        this.birthday = aBirthDate;

    }
    public int getBirthday(){
        return birthday;
    }
    public  int calculateAge(){
        if(birthday > 0) {
            return today - birthday;
        } else {
            return 0;
        }
    }

    public static float getAvgAge(Employee[] emp) {
        int avAge = 0;
        for(int i = 0; i<emp.length; i++)
            avAge+=emp[i].calculateAge();
        return avAge/(float)emp.length;
    }

    public static float getAvgSalary(Employee[] emp) {
        int avgSalary = 0;
        for(int i =0; i<emp.length; i++)
            avgSalary+=emp[i].getSalary();
        return avgSalary/(float)emp.length;
    }
    public static void raiseSalary()
    {
        for(int i = 0; i<empArr.length; i++) {
            if(empArr[i] != null && empArr[i].calculateAge() >45)
                empArr[i].salary +=5000;
        }
    }

    public String getPost() {
        return post;
    }


    public static int getNextId() {
        return nextId;
    }

    public String getPhone() {
        return phone;
    }



}
