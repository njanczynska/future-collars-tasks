package CinemaEmployees;

public abstract class BaseEmployee {

    private String name;
    private String lastName;
    private final int basicSalary = 3000;
    private final int yearOfEmployment;


    public BaseEmployee(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
        System.out.println("You have been working for " + String.valueOf(returnYearsOfWork()) + " years");
    }

    public int returnYearsOfWork() {
        return 2022 - yearOfEmployment;
    }

    public abstract int calculateMonthlySalary(int salary);

    public int getBasicSalary() {
        return basicSalary;
    }
}
