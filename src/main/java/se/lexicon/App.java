package se.lexicon;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {


        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan"});
        int size = NameRepository.getSize();
        System.out.println(size);
        System.out.println(Arrays.toString(NameRepository.findAll()));



        System.out.println("added name: " + NameRepository.add("Ernesto Carocca"));
        System.out.println("added name: " + Arrays.toString(NameRepository.findAll()));
        System.out.println("added name: " + NameRepository.find("ernesto carocca"));

    }
}
