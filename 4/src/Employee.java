import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String fio;
    private String post;
    private String phone;
    private double salary;
    private static LocalDate birthday;
    private static LocalDate today;
    private int id;
    private static int nextId=1;
    private static Employee[] empArr = new Employee[5];

    public Employee(String n, String job, String number, double s, int year, int month, int day)
    {
        this.id = nextId++;
        fio = n;
        post=job;
        phone=number;
        salary = s;
        birthday = LocalDate.of(year, month, day);
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

    public void setBirthday(LocalDate aBirthDate)
    {
        this.birthday = aBirthDate;

    }
    public LocalDate getBirthday(){
        return birthday;
    }
    public  int calculateAge(LocalDate birthDate, LocalDate currentDate){
        if((birthDate !=null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    public static float getAvgAge(Employee[] emp) {
        int avAge = 0;
        for(int i = 0; i<emp.length; i++)
            avAge+=emp[i].calculateAge(birthday,today);
        return avAge/(float)emp.length;
    }

    public static float getAvgSalary(Employee[] emp) {
        int avgSalary = 0;
        for(int i =0; i<emp.length; i++)
            avgSalary+=emp[i].getSalary();
        return avgSalary/(float)emp.length;
    }
    public void raiseSalary()
    {
        for(int i = 0; i<empArr.length; i++) {
            if(empArr[i] != null && empArr[i].calculateAge(birthday,today) >45)
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
