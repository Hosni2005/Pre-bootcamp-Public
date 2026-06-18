package cafeJava;


public class CafeJava {
    public static void main(String[] args) {

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";


        double mochaPrice = 3.5;
        double coppuciPrice = 6.4;
        double lattehPrice = 2.00;
        double coffePrice = 1.50;


        String customer1 = "Shatha";
        String customer2 = "Ahmad";
        String customer3 = "Sali";
        String customer4 = "Adam";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;


        System.out.println(generalGreeting + customer1);


        if (isReadyOrder3) {
            System.out.println(customer3);
            System.out.println(readyMessage);
        } else {
            System.out.println(pendingMessage);
        }


        if (isReadyOrder2) {
            System.out.println(customer2+readyMessage);
             String output = String.format("%s %s %s", customer2, displayTotalMessage, coppuciPrice);
            System.out.println(output);
        } else {
            System.out.println(pendingMessage);
        }

        System.out.println(displayTotalMessage+(lattehPrice * 2));

        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

System.out.println(displayTotalMessage + (lattehPrice -coffePrice));

    }
}