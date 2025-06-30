package se.lexicon;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int size = NameRepository.getSize();
        System.out.println(size);
        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan", "Melody", "Elias", "leandro"});
        System.out.println(Arrays.toString(NameRepository.findAll()));
        System.out.println(NameRepository.getSize());
        NameRepository.findByFirstName("Erik");
        NameRepository.findByLastName("svensson");
       boolean updateName=  NameRepository.update("Melody", "Melody Green");
       if(updateName){
           System.out.println("name is updated");
       }
       NameRepository.remove("Mehrdad Javan");
        // call more methods as needed
    }
}