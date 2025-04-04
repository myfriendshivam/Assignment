package oops.SOLID.singleResponsibilityPrinciple.after;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int monthlyIncome;
    private int nbHoursPerWeek;

    public Employee(String fullName, int monthlyIncome) {
        setMonthlyIncome(monthlyIncome);

        String[] names = fullName.split(" ");
        if (names.length < 2) {
            throw new IllegalArgumentException("Full name must contain first and last name.");
        }

        this.firstName = names[0];
        this.lastName = names[1];
    }

    public String getEmail() {
        return firstName + "." + lastName + "@globomanticshr.com";
    }

    @Override
    public String toString() {
        return getFullName() + " - " + monthlyIncome;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        if (monthlyIncome < 0) {
            throw new IllegalArgumentException("Income must be positive");
        }
        this.monthlyIncome = monthlyIncome;
    }

    public int getNbHoursPerWeek() {
        return nbHoursPerWeek;
    }

    public void setNbHoursPerWeek(int nbHoursPerWeek) {
        if (nbHoursPerWeek <= 0) {
            throw new IllegalArgumentException("Hours must be positive");
        }
        this.nbHoursPerWeek = nbHoursPerWeek;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public abstract String getPosition();
}
