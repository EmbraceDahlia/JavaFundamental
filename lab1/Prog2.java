package lab1;

public class Prog2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
//
//package lesson3.classexamples;
//
//import java.util.Date;
//import java.util.GregorianCalendar;
//
//public class Employee {
//    // instance fields
//    private String name;
//    private String nickName;
//    private double salary;
//    private Date hireDay;
//    private GregorianCalendar gc;
//
//    // constructor
//    Employee(String name, String nickName, double salary, int aYear,
//             int aMonth, int aDay) {
//        this.name = name;
//        this.nickName = nickName;
//        this.salary = salary;
//        GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
//        hireDay = cal.getTime();
//        gc = cal;
//    }
//
//    public GregorianCalendar getGc() {
//        return (GregorianCalendar) gc.clone();
//        //	return gc;
//    }
//
//    // instance methods
//    public String getName() {
//        return name;
//    }
//
//    public String getNickName() {
//        return nickName;
//    }
//
//    public void setNickName(String aNickName) {
//        nickName = aNickName;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    // Date is a mutable object
//    public Date getHireDay() {
//        //return hireDay; // Mutable
//        return (Date)hireDay.clone(); // Clone copy, original cannot be modified
//    }
//
//    public void raiseSalary(double byPercent) {
//        double raise = salary * byPercent / 100;
//        salary += raise;
//    }
//
//
//}
//
//public static void main(String[] args) {
//
//    Employee[] staff = new Employee[3];
//    staff[0] = new Employee("Carl","Jones", 75000,1987, 12,15);
//    staff[1] = new Employee("Harry","Rogers", 50000, 1989, 10, 1);
//    staff[2] = new Employee("Tony", "Atkinson", 40000, 1990, 3, 15);
//
//    for(Employee e : staff) {
//        e.raiseSalary(5);
//    }
//    for(Employee e : staff) {
//        System.out.println("name = "+e.getName() +
//                ", salary = "+e.getSalary() +
//                ", hire day = "+e.getHireDay());
//    }
//    // Importance of cloning and immutable
//    Employee e = new Employee("Bob","Bob",100000,1999,5,5);
//    System.out.printf("\nBefore change %tD",e.getHireDay());
//    Date d = e.getHireDay();
//    d.setTime(11100L);
//    System.out.printf("\nAfter change %tD",e.getHireDay());
//	/*	GregorianCalendar d1 = e.getGc();
//		System.out.println("Before change GC = " +d1.get(Calendar.DAY_OF_MONTH));
//		d1.set(2000, 2, 20);
//		System.out.println("Before change GC = " + e.getGc().get(Calendar.DAY_OF_MONTH));
//	*/
//}
//
//}
//
//        package lesson3.dateapi;
//
//import java.util.*; // for GregorianCalendar
//        import java.text.*; // for DateFormat Class
//
//public class CalenderExample {
//    public static void main(String[] args) {
//        // Creates a GregorianCalendar object for the quizDay, outputs
//        // information about the day, and modifies the day using class
//        // methods
//        // Creates the quiz day object to store the day of the quiz
//
//        GregorianCalendar quizDay = new GregorianCalendar(2023, Calendar.JUNE, 2);
//        //System.out.println("Quiz Date :" + quizDay);
//        int month, day; // store date attributes
//        // Get integer value for the characteristics
//        day = quizDay.get(Calendar.DAY_OF_MONTH);
//        System.out.println("Day: " + day);
//
//        month = quizDay.get(Calendar.MONTH) +1;
//        System.out.println("Month: " + month);
//        int weekday = quizDay.get(Calendar.DAY_OF_WEEK);  //1 - 7
//        System.out.println("Day of the Week :" + weekday);
//        // Make the quiz 2 days earlier
//        // Get the new date
//        quizDay.add(Calendar.DAY_OF_MONTH, 2);
//        day = quizDay.get(Calendar.DAY_OF_MONTH);
//        System.out.println("Day of the quiz: " + day);
//        month = quizDay.get(Calendar.MONTH)+1;
//        System.out.println("Month of the quiz: " + month);
//        System.out.println("Year of the quiz: " + quizDay.get(Calendar.YEAR));
//    }
//
