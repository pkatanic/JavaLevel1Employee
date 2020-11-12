public class Main {
    public static void main(String[] args)
    {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Alexander Alexandrovich Petrov" ,"engineer","555", 75000, 1984);
        emp[1] = new Employee("Elena Leonidovna Petrova" ,"dentist","2222", 70000, 1988);
        emp[2] = new Employee("Igor Vladimirovich Ivanov" ,"driver","666", 50000, 1975);
        emp[3] = new Employee("Anna Borisovna  Mecler" ,"teacher","777", 30000, 1971);


        for(int i =0; i<emp.length; i++)
        {
            if (emp[i].calculateAge() > 40) {
                System.out.println("Name: " + emp[i].getFio() + " Salary " + emp[i].getSalary() + " Age " + emp[i].calculateAge());

            }
        }
        System.out.println();
        Employee.raiseSalary();
        Employee[] emp1 = Employee.getEmployeesArr();
        for(int i =0; i<emp.length; i++)
        {
            if (emp1[i] != null) {
                System.out.println("Name: " + emp[i].getFio() + " Salary " + emp[i].getSalary() + " Age " + emp[i].calculateAge());

            }
        }
        System.out.println();
        for(int i = 0; i < emp.length; i++){
            System.out.println(emp[i].getId());
        }


    }
}
