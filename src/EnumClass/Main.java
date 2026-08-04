package EnumClass;

public class Main {

    // Enum is a special class that represents a fixed set of constants
    enum Day {

        // These are enum constants
        // Java automatically assigns ordinal values:
        // MONDAY = 0
        // TUESDAY = 1
        // WEDNESDAY = 2
        // THURSDAY = 3
        // FRIDAY = 4
        // SATURDAY = 5
        // SUNDAY = 6

        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    // Method that accepts an enum type as parameter
    static void printDay(Day day) {
        System.out.println("Today is: " + day);

        // ordinal() returns the position of the enum constant
        // Position starts from 0
        System.out.println("Ordinal value: " + day.ordinal());
    }

    public static void main(String[] args) {

        // Creating a variable of enum type Day
        Day today = Day.MONDAY;

        // Calling the method and passing enum constant
        printDay(today);

        // Directly accessing another enum constant
        Day tomorrow = Day.TUESDAY;

        System.out.println("Tomorrow is: " + tomorrow);

        // Getting ordinal value
        System.out.println("Ordinal value: " + tomorrow.ordinal());

        // values() returns all enum constants
        System.out.println("\nAll days:");

        for (Day day : Day.values()) {
            System.out.println(day);
        }

        // valueOf() converts a String into an enum constant
        Day d = Day.valueOf("FRIDAY");

        System.out.println("\nUsing valueOf(): " + d);
    }
}
