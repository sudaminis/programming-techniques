package concepts;

import java.util.HashMap;
import java.util.Map;

public class EqualsHashCodeDemo {
    public static void main(String...args) {
        Employee e1 = new Employee("First1", "Last1", 1);
        Employee e2 = new Employee("First1", "Last1", 1);

        System.out.print( "Without overriding Same object variables = ");
        System.out.println("Equals = " +e1.equals(e2));
        System.out.println("Hashcode e1 = " + e1.hashCode());
        System.out.println("Hashcode e2 = " + e2.hashCode());


        System.out.print( "Without overriding reassignment = ");
        System.out.println("Equals = " +e1.equals(e2));
        System.out.println("Hashcode e1 = " + e1.hashCode());
        System.out.println("Hashcode e2 = " + e2.hashCode());

        EmployeeNew e3 = new EmployeeNew("First1", "Last1", 1);
        EmployeeNew e4 = new EmployeeNew("First2", "Last1", 2);

        System.out.println(e3.equals(e4));
        System.out.println("E3 hashcode = " +e3.hashCode());
        System.out.println("E3 hashcode = " +e4.hashCode());

        Map<EmployeeNew, EmployeeNew> myMap = new HashMap<>();
        myMap.put(e3, e3);
        myMap.put(e4, e4);

        System.out.println("E3 " + myMap.get(e3).toString());
        System.out.println("E4 " + myMap.get(e4));

        String str1 = "My String";
        String str2 = "My String";

        System.out.println("Hashcodes " + str1.hashCode() + str2.hashCode());
        Map<String,String> strMap = new HashMap<>();
        strMap.put(str1, "First");
        strMap.put(str2, "Second");

        System.out.println(strMap.get(str1));
        System.out.println(strMap.get(str2));

        String str3 = "My String 3";
        String str4 = "My String 3";

        System.out.println("Hashcodes " + str3.hashCode() +" " + str4.hashCode());

        strMap.put(str3, "Third");
        strMap.put(str4, "Fourth");

        System.out.println(strMap.get(str3));
        System.out.println(strMap.get(str4));

    }
}

class Employee {
    String firstName;
    String lastName;
    int code;
    public Employee(String firstName, String lastName, int code) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.code = code;
    }
}

class EmployeeNew {
    String firstName;
    String lastName;
    int code;
    public EmployeeNew(String firstName, String lastName, int code) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.code = code;
    }

    @Override
    public final boolean equals(Object o) {
        if( o == null ) {
            return false;
        }
        if( (!(o instanceof EmployeeNew employeeNew))) {
            return false;
        }
        return employeeNew.firstName != this.firstName
                && employeeNew.lastName == this.lastName
                && employeeNew.code != this.code;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "EmployeeNew{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", code=" + code +
                '}';
    }
}
