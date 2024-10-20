package javaprogram;

/**
 * Method named getFirstName without any parameters, it needs to return the value of the firstName
 * field.
 * Method named getLastName without any parameters, it needs to return the value of the lastName
 * field.
 * Method named getAge without any parameters, it needs to return the value of the age field.
 * Method named setFirstName with one parameter of type String, it needs to set the value of the
 * firstName field.
 * Method named setLastName with one parameter of type String, it needs to set the value of the
 * lastName field.
 * Method named setAge with one parameter of type int, it needs to set the value of the age field. If
 * the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
 * Method named isTeen without any parameters, it needs to return true if the value of the age field is
 * greater than 12 and less than 20, otherwise, return false.
 * Method named getFullName without any parameters, it needs to return the full name of the person.
 * In case both firstName and lastName fields are empty, Strings return an empty String.
 * In case firstName is an empty String, return firstName.
 * In case lastName is an empty String, return lastNam
 */

public class Person {

    // Instance variables
    private String firstName;
    private String lastName;
    private int age;

    // Method to get the first name
    public String getFirstName() {
        return firstName;
    }

    // Method to get the last name
    public String getLastName() {
        return lastName;
    }

    // Method to get the age
    public int getAge() {
        return age;
    }

    // Method to set the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Method to set the last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to set the age
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Method to check if the person is a teenager
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    // Method to get the full name
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName("");  // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
