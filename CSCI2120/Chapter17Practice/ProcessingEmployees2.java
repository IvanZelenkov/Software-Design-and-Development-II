package Chapter17Practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProcessingEmployees2 {
    public static void main(String[] args) {
        // initialize array of Employees
        List<Employee2> list  = List.of(
                new Employee2("Jason", "Red", 5000, "IT"),
                new Employee2("Ashley", "Green", 7600, "IT"),
                new Employee2("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee2("James", "Indigo", 4700.77, "Marketing"),
                new Employee2("Luke", "Indigo", 6200, "IT"),
                new Employee2("Jason", "Blue", 3200, "Sales"),
                new Employee2("Wendy", "Brown", 4236.4, "Marketing"));

        Map<String, List<Employee2>> groupedByDepartment =
                list.stream().
                        collect(Collectors.groupingBy(Employee2::getDepartment));

        groupedByDepartment.forEach((department, employess) -> {
            System.out.printf("%s%n", department);
            System.out.printf("Average employee salary: %.2f%n%n",
                    employess.stream().
                    mapToDouble(Employee2::getSalary).
                    average().
                    getAsDouble());
        });
    }
}
