package concepts.collections.treesetdemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeUtil {

    public static void main(String[] args) {

        Set<Employee> employeeSalarySet = new TreeSet<>( new EmployeeSalaryComparator());
        Set<Employee> employeeNameSet = new TreeSet<>( new EmployeeNameComparator());

        Employee e1 = new Employee();
        e1.setName("Adam");
        e1.setSalary(34567.8);

        Employee e2 = new Employee();
        e2.setName("Jenny");
        e2.setSalary(100.8);

        Employee e3 = new Employee();
        e3.setName("Winny");
        e3.setSalary(345.8);

        employeeSalarySet.add(e1);
        employeeSalarySet.add(e2);
        employeeSalarySet.add(e3);

        System.out.println(employeeSalarySet);

        employeeNameSet.add(e1);
        employeeNameSet.add(e2);
        employeeNameSet.add(e3);

        System.out.println(employeeNameSet);

        Set<Employee> employeeSalarySetL = new TreeSet<>(Comparator.comparingDouble(Employee::getSalary));
        Set<Employee> employeeNameSetL = new TreeSet<>(Comparator.comparing(Employee::getName));

        employeeSalarySetL.add(e1);
        employeeSalarySetL.add(e2);
        employeeSalarySetL.add(e3);

        System.out.println(employeeSalarySetL);

        employeeNameSetL.add(e1);
        employeeNameSetL.add(e2);
        employeeNameSetL.add(e3);

        System.out.println(employeeNameSetL);





    }
}
