package model;

/**
 * The {@code Name} class stores an individual's first and last name in a
 * structured format.
 *
 * <p>This is used for competitors and judges.</p>
 *
 * @author Wong Wai Soon
 * @version 1.0
 */
public class Name {

    private String firstName;
    private String lastName;

    // Constructs a Name object. //
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Returns full name. //
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
