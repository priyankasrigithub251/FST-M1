package Activities;

import static java.lang.System.out;

public class Activity8 {
    public static void main(String[] args) throws CustomException {

      try {
            Activity8.exceptionTest("Test input string");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("This will not execute");
        } catch (CustomException e) {
          System.out.println("\nText inside Catch block  " + e.getMessage());
      }
    }
        static void exceptionTest(String str) throws CustomException{
            if (str == null) {
                throw new CustomException("\nThis is Exception Handler as String entered is null");
            } else {
                System.out.println(str);
            }

        }
    }
