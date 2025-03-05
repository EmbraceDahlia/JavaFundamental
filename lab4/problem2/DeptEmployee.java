package lab4.problem2;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    private double salary;
    private LocalDate hiredDate;

    public DeptEmployee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hiredDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(LocalDate hiredDate) {
        this.hiredDate = hiredDate;
    }

    public double computeSalary(){
        return this.salary;
    }
}
