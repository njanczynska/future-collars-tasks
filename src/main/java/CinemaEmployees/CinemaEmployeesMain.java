package CinemaEmployees;

public class CinemaEmployeesMain {
    public static void main(String[] args) {

        Manager manager = new Manager(2010);
        System.out.println(manager.getBasicSalary());
        System.out.println(manager.calculateMonthlySalary(5000));

        TicketSeller ticketSeller = new TicketSeller(2015);
        System.out.println(ticketSeller.getBasicSalary());
        System.out.println(ticketSeller.calculateMonthlySalary(3000));
    }
}
