package Collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ProgrammingLanguages {
    public static void main(String[] args) {
        LinkedHashSet languages = new LinkedHashSet<>(10);
        languages.add("C");
        languages.add("C++");
        languages.add(".net");
        languages.add("Java");
        languages.add("Python");

        System.out.println("1: " + languages);

        System.out.println("2: " + languages.clone());

        System.out.println("3: " + languages.isEmpty());

        System.out.println("4: " + languages.contains("SQL"));

        System.out.println("5: " + languages.size());

        LinkedHashSet moreLanguages = new LinkedHashSet<>(languages);
        moreLanguages.add("SQL");
        moreLanguages.add("Java Script");
        moreLanguages.add("Basic");
        moreLanguages.add("PHP");
        moreLanguages.add("Cobol");
        moreLanguages.add("Assembly Language");
        System.out.println(moreLanguages);

        for (Object object : moreLanguages){
            System.out.println(object);
        }
        System.out.println("----------------------");

        Iterator allLanguages = moreLanguages.iterator();
        while (allLanguages.hasNext()){
            System.out.println(allLanguages.next());
        }






    }
}
