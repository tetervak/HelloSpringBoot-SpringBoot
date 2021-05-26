package sheridan.tetervak.hellospringboot.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class User implements Serializable {

    private final Logger logger = LoggerFactory.getLogger(User.class);

    private String firstName = "";
    private String lastName = "";

    public User() {
        logger.trace("constructor User() is called");
    }

    public User(String firstName, String lastName) {
        logger.trace("constructor User(firstName, lastName) is called");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        logger.trace("getFirstName() is called");
        return firstName;
    }

    public void setFirstName(String firstName) {
        logger.trace("setFirstName() is called");
        logger.debug("firstName = " + firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        logger.trace("getLastName() is called");
        return lastName;
    }

    public void setLastName(String lastName) {
        logger.trace("setLastName() is called");
        logger.debug("lastName = " + lastName);
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
