/** Exceptions and Errors
 * Types of Error:
 * 1. Compile-time error or Syntactical error
 * 2. Run-time error or Exceptions - Exception Handling
 * 3. Logical error or Semantic error or Bug
 * 
 * Types of Statements:
 * 1. Normal Statement
 * 2. Critical Statement
 * 
 * Note - Write critical statements in try block
 * Note - Generally -able are interfaces but in case of Throwable it is a class.
 * 
 * Exceptions hierarchy:
 * 
 * Object
 * Throwable
 *  - Error
 *      - ThreadDeath
 *      - IOError
 *      - VirtualMachineError
 *          - OutOfMemory Error
 *  - Exception
 *      - RuntimeException  (Unchecked Exceptions)
 *          - ArithmeticException
 *          - ArrayIndexOutOfBoundsException
 *          - NullPointerException
 *      - SQLException  (Checked Exception)
 *      - IOException   (Checked Exception)
 * 
 * Note - RuntimeException are also called as Unchecked Exceptions.
 * Unchecked Exceptions are not forced to handle by the compiler but
 * Checked Exceptions are forced by the compiler.
 * 
 * - throws keyword is used for ducking or delegating the exception.
 * - It is helpful in handling checked exception.
 */

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class Exceptions {
    public static void main(String args[]) {
        try {
            Class.forName("MyExceptions");
        } catch(ClassNotFoundException e) {
            System.out.println("Class not found");
            e.printStackTrace();
        }

        int i = 0;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try {
            if (i == 0) throw new MyException("Cannot divide a number by zero");
            j = 6 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch(MyException e) {
            System.out.println(e);
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero." + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Outside the limit of array.");
        } catch(Exception e) {
            System.out.println("Something went wrong - " + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}