public class Employee {
    String firstName;
    String lastName;
    int birthYear;
    int seniority;

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", seniority=" + seniority +
                '}';
    }
}
