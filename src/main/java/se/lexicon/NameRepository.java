package se.lexicon;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The NameRepository class provides methods to manage a list of names.
 * It offers functionalities such as adding, removing, finding, and updating names.
 */
public class NameRepository {

    private static String[] names = new String[0];


    /**
     * Retrieves the current size of the names array.
     *
     * @return The number of elements in the names array.
     */
    public static int getSize() {
        return names.length;
    }


    /**
     * Sets the names array to the provided array of names & it should replace all existing names.
     *
     * @param newNames The array of names to set.
     */
    public static void setNames(String[] newNames) {
        if (newNames == null) {
            names = new String[0];
        } else {
            names = Arrays.copyOf(newNames, newNames.length);

        }


    }


    /**
     * Clears the names array by creating a new empty array.
     */
    public static void clear() {
        //todo: implement clear method
        names = new String[0];
    }


    /**
     * Returns all names in a new array (Retrieves a copy of the names array).
     *
     * @return A new array containing all elements from the names array.
     */
    public static String[] findAll() {
        //todo: implement findAll method
        return Arrays.copyOf(names, names.length);
    }


    /**
     * Finds a name that matches the given fullName case-insensitively.
     *
     * @param fullName The full name to search for.
     * @return The matching name if found; otherwise, null.
     */
    public static String find(String fullName) {
        //todo: implement find method
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                return name;
            }
        }
        return null;
    }

    /**
     * Adds a new fullName to the names array if it doesn't already exist.
     *
     * @param fullName The full name to add.
     * @return True if the fullName is added successfully; false if it already exists.
     */
    public static boolean add(String fullName) {
        //todo: implement add method
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                return false;
            }
            String[] newArray = Arrays.copyOf(names, names.length + 1);
            newArray[newArray.length - 1] = fullName;
            names = newArray;

            return true;
        }
        return false;
    }


    /**
     * Find all names that match the given firstName.
     *
     * @param firstName The first name to search for.
     * @return An array containing all matching names.
     */
    public static String[] findByFirstName(String firstName) {
        //todo: findByFirstName method
        String firstNme = firstName.split(" ")[0];
        if (firstName.equalsIgnoreCase(firstNme)) {
            System.out.println("Found first name " + firstName);
        }
        return null;
    }


    /**
     * Find all names that match the given lastName.
     *
     * @param lastName The last name to search for.
     * @return An array containing all matching names.
     */
    public static String[] findByLastName(String lastName) {
        //todo: implement findByLastName method
        String firstNme = lastName.split(" ")[0];
        if (lastName.equalsIgnoreCase(firstNme)) {
            System.out.println("Found lastname: " + lastName);
        }
        return null;
    }


    /**
     * Updates a name in the names array from the original name to the updated name.
     *
     * @param original    The original name to update.
     * @param updatedName The updated name to set.
     * @return True if the name is updated successfully; false if the updated name already exists or the original name is not found.
     */
    public static boolean update(String original, String updatedName) {
        //todo: implement update method
        if (original == null || updatedName == null) return false;
        int targetIndex = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(original)) {
                targetIndex = i;
                break;
            }
        }
        if (targetIndex == -1) return false;
        names[targetIndex] = updatedName;
        return true;


    }


    /**
     * Removes a name from the names array, case-insensitively.
     *
     * @param fullName The full name to remove.
     * @return True if the name is removed successfully; false if the name is not found in the array.
     */
    public static boolean remove(String fullName) {
        //todo: implement remove method
        List<String> list = new ArrayList<>(Arrays.asList(names));
        System.out.println("removing " + fullName);
        boolean removed = list.removeIf(n -> n.equalsIgnoreCase(fullName));
        if (removed) names = list.toArray(new String[0]);
        System.out.println("Name removed with success ");

        return removed;
    }


}