package week13;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String t) {
        super(name);
        title = t;
    }

    @Override
    public String toString() {
        return "Staff name: " + super.name+ ", " + title;
    }
}

