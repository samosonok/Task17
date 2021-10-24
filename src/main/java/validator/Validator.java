package validator;

public class Validator {

    public void checkSalary(double salary) throws SalaryException {
        if (salary < 0) {
            throw new SalaryException("TooSmallSalaryException in " + salary);
        }
    }

    public void checkName(String name, String surname) throws NameException {
        if (!name.matches("[a-zA-Z]+") | !surname.matches("[a-zA-Z]+")) {
            throw new NameException("ImpossibleNameException in " + name + " " + surname);
        }
    }
}
