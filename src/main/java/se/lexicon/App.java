package se.lexicon;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int size = NameRepository.getSize();
        System.out.println(size);
        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan", "Melody", "Elias", "leandro"});
        System.out.println(" find all name: " + Arrays.toString(NameRepository.findAll()));
        System.out.println("list size: " +NameRepository.getSize());
        NameRepository.findByFirstName("Erik");
        NameRepository.findByLastName("svensson");
        String updateName = "Melody Green";
        boolean isNameUpdated = NameRepository.update("Melody", updateName);
        if (isNameUpdated) {
            System.out.println("name is updated: "+ updateName);
        }
        NameRepository.add("Nelson Carocca");
        System.out.println("added new name to list " + Arrays.toString(NameRepository.findAll()));

        // call more methods as needed
    }
}