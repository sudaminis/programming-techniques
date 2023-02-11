package techniques.objectClass;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EqualsHashCodeBreaksSymmetry {
    private String string;

    public EqualsHashCodeBreaksSymmetry(String incoming) {
        string = incoming;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null ) {
            return false;
        }
        if( o instanceof EqualsHashCodeBreaksSymmetry) {
            EqualsHashCodeBreaksSymmetry that = (EqualsHashCodeBreaksSymmetry) o;
            return string.equalsIgnoreCase(that.getString());
        }

        if (o instanceof String) // One-way interoperability!
            return string.equalsIgnoreCase((String) o);

        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }

    public static void main(String...args) {
        EqualsHashCodeBreaksSymmetry cis = new EqualsHashCodeBreaksSymmetry("Polish");
        String trans = "polish";

        System.out.println( cis.equals(trans) );

        System.out.println(trans.equals(cis));

        List<String> myList = new ArrayList<>();
        myList.add(cis.getString());

        System.out.println( myList.contains(trans) );
    }
}
