package Stream;

import java.util.*;
import java.util.stream.*;

class Employee {

    private String name;
    private int age;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name +
                " | Age: " + age +
                " | Department: " + department +
                " | Salary: " + salary;
    }
}


public class Main {

    public static void main(String[] args) {

        // =========================================================
        // 1. CREATE A LIST OF EMPLOYEES
        // =========================================================

        List<Employee> employees = Arrays.asList(

                new Employee("Pratyush", 24, "IT", 50000),
                new Employee("Rahul", 21, "HR", 35000),
                new Employee("Sahil", 20, "IT", 20000),
                new Employee("Ankit", 29, "Finance", 75000),
                new Employee("Amit", 26, "IT", 60000),
                new Employee("Neha", 25, "HR", 45000)
        );


        // =========================================================
        // 2. stream()
        // =========================================================

        /*
         * stream() creates a Stream from the Collection.
         *
         * List = stores data
         *
         * Stream = processes data
         */

        System.out.println("\n--- 1. stream() ---");

        employees.stream()
                .forEach(System.out::println);


        // =========================================================
        // 3. filter()
        // =========================================================

        /*
         * filter() is used when we want to SELECT elements.
         *
         * Here:
         *
         * e -> e.getSalary() > 40000
         *
         * means:
         *
         * Keep only employees whose salary is greater than 40000.
         */

        System.out.println("\n--- 2. filter() ---");

        employees.stream()
                .filter(e -> e.getSalary() > 40000)
                .forEach(System.out::println);


        // =========================================================
        // 4. map()
        // =========================================================

        /*
         * map() TRANSFORMS one object into another.
         *
         * Employee -> String
         *
         * Here we don't want the entire Employee object.
         * We only want employee names.
         */

        System.out.println("\n--- 3. map() ---");

        employees.stream()
                .map(e -> e.getName())
                .forEach(System.out::println);


        // =========================================================
        // 5. filter() + map()
        // =========================================================

        /*
         * First filter employees whose salary > 40000.
         *
         * Then convert Employee objects into their names.
         */

        System.out.println("\n--- 4. filter() + map() ---");

        employees.stream()
                .filter(e -> e.getSalary() > 40000)
                .map(e -> e.getName())
                .forEach(System.out::println);


        // =========================================================
        // 6. sorted()
        // =========================================================

        /*
         * sorted() sorts elements.
         *
         * Here we sort employees based on salary.
         *
         * Comparator.comparingDouble()
         * creates a Comparator based on salary.
         */

        System.out.println("\n--- 5. sorted() by salary ---");

        employees.stream()
                .sorted(Comparator.comparingDouble(e -> e.getSalary()))
                .forEach(System.out::println);


        // =========================================================
        // 7. sorted() DESCENDING
        // =========================================================

        /*
         * reversed() changes ascending order to descending.
         */

        System.out.println("\n--- 6. sorted() descending salary ---");

        employees.stream()
                .sorted(
                        Comparator.comparingDouble(
                                (Employee e) -> e.getSalary()
                        ).reversed()
                )
                .forEach(System.out::println);


        // =========================================================
        // 8. distinct()
        // =========================================================

        /*
         * distinct() removes duplicate elements.
         *
         * Here we first get departments.
         *
         * Suppose:
         *
         * IT
         * HR
         * IT
         * Finance
         * IT
         * HR
         *
         * distinct() gives:
         *
         * IT
         * HR
         * Finance
         */

        System.out.println("\n--- 7. distinct() departments ---");

        employees.stream()
                .map(e -> e.getDepartment())
                .distinct()
                .forEach(System.out::println);


        // =========================================================
        // 9. limit()
        // =========================================================

        /*
         * limit(n)
         *
         * Takes only the first n elements.
         */

        System.out.println("\n--- 8. limit() ---");

        employees.stream()
                .limit(3)
                .forEach(System.out::println);


        // =========================================================
        // 10. skip()
        // =========================================================

        /*
         * skip(n)
         *
         * Skips the first n elements.
         */

        System.out.println("\n--- 9. skip() ---");

        employees.stream()
                .skip(3)
                .forEach(System.out::println);


        // =========================================================
        // 11. count()
        // =========================================================

        /*
         * count() counts the number of elements.
         *
         * Return type is long.
         */

        System.out.println("\n--- 10. count() ---");

        long count =
                employees.stream()
                        .filter(e -> e.getSalary() > 40000)
                        .count();

        System.out.println("Employees with salary > 40000 = " + count);


        // =========================================================
        // 12. min()
        // =========================================================

        /*
         * Find employee with minimum salary.
         *
         * min() returns Optional<Employee>
         *
         * Why Optional?
         *
         * Because the Stream could be empty.
         */

        System.out.println("\n--- 11. min() ---");

        Optional<Employee> minimumSalaryEmployee =
                employees.stream()
                        .min(
                                Comparator.comparingDouble(
                                        e -> e.getSalary()
                                )
                        );

        minimumSalaryEmployee.ifPresent(
                e -> System.out.println("Minimum salary: " + e)
        );


        // =========================================================
        // 13. max()
        // =========================================================

        /*
         * Find employee with maximum salary.
         */

        System.out.println("\n--- 12. max() ---");

        Optional<Employee> maximumSalaryEmployee =
                employees.stream()
                        .max(
                                Comparator.comparingDouble(
                                        e -> e.getSalary()
                                )
                        );

        maximumSalaryEmployee.ifPresent(
                e -> System.out.println("Maximum salary: " + e)
        );


        // =========================================================
        // 14. findFirst()
        // =========================================================

        /*
         * findFirst() returns the first matching element.
         *
         * Again, return type is Optional.
         */

        System.out.println("\n--- 13. findFirst() ---");

        Optional<Employee> firstEmployee =
                employees.stream()
                        .filter(e -> e.getSalary() > 40000)
                        .findFirst();

        firstEmployee.ifPresent(
                e -> System.out.println("First employee: " + e)
        );


        // =========================================================
        // 15. findAny()
        // =========================================================

        /*
         * findAny() returns any matching element.
         *
         * With sequential streams it commonly returns an early
         * matching element, but don't depend on a specific one.
         */

        System.out.println("\n--- 14. findAny() ---");

        Optional<Employee> anyEmployee =
                employees.stream()
                        .filter(e -> e.getSalary() > 40000)
                        .findAny();

        anyEmployee.ifPresent(
                e -> System.out.println("Any employee: " + e)
        );


        // =========================================================
        // 16. anyMatch()
        // =========================================================

        /*
         * anyMatch() asks:
         *
         * "Does AT LEAST ONE employee satisfy this condition?"
         *
         * Returns boolean.
         */

        System.out.println("\n--- 15. anyMatch() ---");

        boolean hasHighSalary =
                employees.stream()
                        .anyMatch(e -> e.getSalary() > 70000);

        System.out.println(
                "Is there an employee with salary > 70000? "
                        + hasHighSalary
        );


        // =========================================================
        // 17. allMatch()
        // =========================================================

        /*
         * allMatch() asks:
         *
         * "Do ALL employees satisfy this condition?"
         */

        System.out.println("\n--- 16. allMatch() ---");

        boolean everyoneAbove18 =
                employees.stream()
                        .allMatch(e -> e.getAge() >= 18);

        System.out.println(
                "Are all employees 18 or older? "
                        + everyoneAbove18
        );


        // =========================================================
        // 18. noneMatch()
        // =========================================================

        /*
         * noneMatch() asks:
         *
         * "Does NO employee satisfy this condition?"
         */

        System.out.println("\n--- 17. noneMatch() ---");

        boolean nobodyHasZeroSalary =
                employees.stream()
                        .noneMatch(e -> e.getSalary() == 0);

        System.out.println(
                "Does nobody have zero salary? "
                        + nobodyHasZeroSalary
        );


        // =========================================================
        // 19. reduce()
        // =========================================================

        /*
         * reduce() combines multiple elements into ONE result.
         *
         * Here we calculate total salary.
         *
         * 0 = initial value
         *
         * (total, salary) -> total + salary
         *
         * Example:
         *
         * 0 + 50000 = 50000
         * 50000 + 35000 = 85000
         * 85000 + 20000 = 105000
         * ...
         */

        System.out.println("\n--- 18. reduce() ---");

        double totalSalary =
                employees.stream()
                        .map(e -> e.getSalary())
                        .reduce(
                                0.0,
                                (total, salary) -> total + salary
                        );

        System.out.println("Total salary = " + totalSalary);


        // =========================================================
        // 20. collect() / toList()
        // =========================================================

        /*
         * collect() collects Stream elements into another data structure.
         *
         * Here we create a List containing names of IT employees.
         */

        System.out.println("\n--- 19. collect() ---");

        List<String> itEmployees =
                employees.stream()
                        .filter(e -> e.getDepartment().equals("IT"))
                        .map(e -> e.getName())
                        .collect(Collectors.toList());

        System.out.println("IT employees = " + itEmployees);


        // Modern Java:
        //
        // List<String> itEmployees =
        //         employees.stream()
        //                 .filter(e -> e.getDepartment().equals("IT"))
        //                 .map(e -> e.getName())
        //                 .toList();


        // =========================================================
        // 21. groupingBy()
        // =========================================================

        /*
         * groupingBy() groups elements based on a key.
         *
         * Here:
         *
         * Department -> Employees
         *
         * Example:
         *
         * IT      -> [Pratyush, Sahil, Amit]
         * HR      -> [Rahul, Neha]
         * Finance -> [Ankit]
         */

        System.out.println("\n--- 20. groupingBy() ---");

        Map<String, List<Employee>> employeesByDepartment =
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        e -> e.getDepartment()
                                )
                        );

        employeesByDepartment.forEach(
                (department, employeeList) -> {

                    System.out.println(
                            department + " -> " + employeeList
                    );
                }
        );


        // =========================================================
        // 22. partitioningBy()
        // =========================================================

        /*
         * partitioningBy() divides elements into TWO groups:
         *
         * true
         * false
         *
         * Here:
         *
         * true  -> salary > 40000
         * false -> salary <= 40000
         */

        System.out.println("\n--- 21. partitioningBy() ---");

        Map<Boolean, List<Employee>> salaryPartition =
                employees.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        e -> e.getSalary() > 40000
                                )
                        );

        System.out.println(
                "Salary > 40000: "
                        + salaryPartition.get(true)
        );

        System.out.println(
                "Salary <= 40000: "
                        + salaryPartition.get(false)
        );


        // =========================================================
        // 23. joining()
        // =========================================================

        /*
         * joining() combines Strings into one String.
         */

        System.out.println("\n--- 22. joining() ---");

        String allNames =
                employees.stream()
                        .map(e -> e.getName())
                        .collect(
                                Collectors.joining(", ")
                        );

        System.out.println("Names: " + allNames);


        // =========================================================
        // 24. toMap()
        // =========================================================

        /*
         * Convert employees into:
         *
         * Employee Name -> Salary
         *
         * Example:
         *
         * Pratyush -> 50000
         * Rahul    -> 35000
         */

        System.out.println("\n--- 23. toMap() ---");

        Map<String, Double> salaryMap =
                employees.stream()
                        .collect(
                                Collectors.toMap(
                                        e -> e.getName(),
                                        e -> e.getSalary()
                                )
                        );

        System.out.println(salaryMap);


        // =========================================================
        // 25. mapToDouble()
        // =========================================================

        /*
         * mapToDouble() converts Stream<Employee>
         *
         * into:
         *
         * DoubleStream
         *
         * This is useful for numeric calculations.
         */

        System.out.println("\n--- 24. mapToDouble() ---");

        double averageSalary =
                employees.stream()
                        .mapToDouble(e -> e.getSalary())
                        .average()
                        .orElse(0);

        System.out.println(
                "Average salary = " + averageSalary
        );


        // =========================================================
        // 26. flatMap()
        // =========================================================

        /*
         * flatMap() is used when we have nested collections.
         *
         * Example:
         *
         * List<List<Integer>>
         *
         * [[1,2,3], [4,5,6], [7,8,9]]
         *
         * flatMap() converts it into:
         *
         * [1,2,3,4,5,6,7,8,9]
         */

        System.out.println("\n--- 25. flatMap() ---");

        List<List<Integer>> nestedNumbers =
                Arrays.asList(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(4, 5, 6),
                        Arrays.asList(7, 8, 9)
                );

        List<Integer> flattenedNumbers =
                nestedNumbers.stream()

                        // Convert every List<Integer>
                        // into a Stream<Integer>
                        .flatMap(list -> list.stream())

                        // Collect everything into one List
                        .toList();

        System.out.println(flattenedNumbers);


        // =========================================================
        // 27. peek()
        // =========================================================

        /*
         * peek() is mainly useful for DEBUGGING.
         *
         * It lets us see what is passing through the pipeline.
         *
         * IMPORTANT:
         *
         * peek() is an intermediate operation.
         */

        System.out.println("\n--- 26. peek() ---");

        employees.stream()

                .peek(e ->
                        System.out.println(
                                "Before filter: " + e.getName()
                        )
                )

                .filter(e -> e.getSalary() > 40000)

                .peek(e ->
                        System.out.println(
                                "After filter: " + e.getName()
                        )
                )

                .forEach(e ->
                        System.out.println(
                                "Final: " + e.getName()
                        )
                );


        // =========================================================
        // 28. LAZY EVALUATION
        // =========================================================

        /*
         * filter() and map() are LAZY.
         *
         * They don't execute until a terminal operation appears.
         */

        System.out.println("\n--- 27. Lazy Evaluation ---");

        employees.stream()
                .filter(e -> {

                    System.out.println(
                            "Filtering: " + e.getName()
                    );

                    return e.getSalary() > 40000;
                });

        /*
         * Nothing will be printed above!
         *
         * Why?
         *
         * Because there is NO terminal operation.
         *
         * Now add forEach():
         */

        employees.stream()
                .filter(e -> {

                    System.out.println(
                            "Filtering: " + e.getName()
                    );

                    return e.getSalary() > 40000;
                })
                .forEach(e ->
                        System.out.println(
                                "Accepted: " + e.getName()
                        )
                );


        // =========================================================
        // 29. SHORT-CIRCUITING
        // =========================================================

        /*
         * anyMatch() can stop processing once it finds a match.
         */

        System.out.println("\n--- 28. Short Circuiting ---");

        boolean result =
                employees.stream()
                        .anyMatch(e -> {

                            System.out.println(
                                    "Checking: " + e.getName()
                            );

                            return e.getSalary() > 70000;
                        });

        System.out.println("Result = " + result);


        // =========================================================
        // 30. PARALLEL STREAM
        // =========================================================

        /*
         * parallelStream() allows processing to happen in parallel.
         *
         * Different elements may be processed by different threads.
         *
         * The order should NOT be assumed with forEach().
         */

        System.out.println("\n--- 29. parallelStream() ---");

        employees.parallelStream()
                .forEach(e ->
                        System.out.println(
                                Thread.currentThread().getName()
                                        + " -> "
                                        + e.getName()
                        )
                );
    }
}
