public class Q69 {
    public static void main(String[] args) {
//        Employee e1 = new Employee();
        Employee e2 = new Employee("Jack", 50);
        Employee e3 = new Employee("Chloe", 40, 5000);

//        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }

}

class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age) {
        setName(name);
        setAge(age);
        setSalary(2000);
    }

    public Employee(String name, int age, int salary) {
        this(name,age);
        setSalary(salary);
    }
    public void printDetails() {
        System.out.println(name + " : " + age + " : " + salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}

/*
A.      Compilation fails in the Employee class

B.      null : 0 : 0
        Jack : 50 : 0
        Chloe : 40 : 5000

C.      null : 0 : 0
        Jack : 50 : 2000
        Chloe : 40 : 5000

D.      Compilation fails in the Test class

E.      Both the Employee class and the Test class fail to compile.

        A.	Option A
        B.	Option B
        C.	Option C
        D.	Option D
        E.	Option E

 */
