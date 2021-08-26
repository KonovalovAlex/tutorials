package tutorials.hashCodeEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(1, "vasya");
        MyClass myClass2 = new MyClass(2, "vasya");
        MyClass myClass3 = new MyClass(1, "vasya");

        System.out.println(myClass.hashCode());
        System.out.println(myClass2.hashCode());
        System.out.println(myClass.equals(myClass2));
        System.out.println(myClass==myClass2);

        HashMap<MyClass, String> objects = new HashMap<>();
        objects.put(myClass,"myclass1");
        System.out.println("added");
        objects.put(myClass2,"myclass2");

        System.out.println("колличество объектов " + objects.size());
        System.out.println(objects.get(myClass2));
    }
}


