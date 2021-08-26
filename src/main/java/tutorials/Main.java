package tutorials;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<test> list = new ArrayList<>();
        test test = new test();
        test test1 = new test();
        test test2 = new test();
        list.add(test);
        list.add(test1);
        list.add(test2);
        tutorials.test test3 = list.stream().filter(e -> e.getS() == 3).findFirst().orElse(null);
        System.out.println(test3);


    }

}
class test{
    public int s = 1;

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
}


