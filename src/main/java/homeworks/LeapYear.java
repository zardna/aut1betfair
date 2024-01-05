package homeworks;

//Display the number of days in month February from a year between 1900-2016 that is read from keyboard
//HINT
//A year is a leap year if:
//-Is divisible by 4 but not by 100
//-Is divisible by 100 but not by 400


public class LeapYear {

    public static void main(String args[]) {

        int year = 1999;

        if (year % 4 != 0 && (year % 100 == 0 || year % 400 != 0)) {
            System.out.println("In february " + year + " there are 28 days.");
        } else {
            System.out.println("In february " + year + " there are 29 days.");
        }
    }
}













//public class LeapYear {
//    public static void main(String[] args) {
//
//        for (int i = 1900; i <= 2016; i++) {
//            if (i % 4 == 0) {
//                if (i % 100 != 0 || i % 400 == 0) {
//                    System.out.println(i + ": A leap Year");
//                } else {
//                    System.out.println(i + ": Not a leap year");
//                }
//            } else {
//                System.out.println(i + ": Not a leap year");
//            }
//        }
//    }
//}
