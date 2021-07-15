public class Main {

    public static void main(String[] args) {

        double[] myList = {1.2, 1.3, 4.3, 5.6};
        for (double number : myList) {
            System.out.println(number);
        }
        System.out.println("--------------------");
        double total = 0;
        //for(int i = 0; i < myList.length; i++){
        //     total = total + myList[i];
        //  }   OR YOU CAN USE LIKE THIS:

        for (double number : myList) {
            total = total + number;
        }// THIS SHAPE İS MORE ACCURATE
        System.out.println("TOTAL IS ==> " + total);

        System.out.println("--------------------");

        double theBiggest;
        theBiggest = myList[0];


        for (double number : myList) {
            if (theBiggest < number) {
                theBiggest = number;
            }
        }
        System.out.println("THE BIGGEST NUMBER IS ==> " + theBiggest);
    
    }

}
