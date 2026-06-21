package exceptions;
import java.util.ArrayList;

public class TestExceptions {

    public static void main(String[] args) {

        ArrayList<Object> myList = new ArrayList<Object>();

        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");


        for (int i = 0; i < myList.size(); i++) {

            try {

                Integer castedValue = (Integer) myList.get(i);

                System.out.println("Value: " + castedValue);

            } catch (ClassCastException e) {

                System.out.println("Error Message: " + e.getMessage());
                System.out.println("Index where error happened: " + i);
                System.out.println("Value causing error: " + myList.get(i));
            }

        }

        System.out.println("Program continued successfully!");
    }
}