package Lab4;

import java.util.*;

public class PrimeFactorizationDemo {
    public static void main(String[] args)

    {

    // ArrayStackDataStrucClass<Integer> object with 50 elements.

    ArrayStackDataStrucClass<Integer> list = new ArrayStackDataStrucClass<>(50);

        // Create the input list of 4 elements.

        int n[] = new int[]{3960, 1234, 222222, 13780};

        // Declare i is equal to zero

        int i = 0;

        // while loop to check element is less than 3

        while (i <= 3)

        {

          // Uses a try-catch block in the main() using pushes/pops

            try

            {

                int d = 2;

                while (n[i] > 1)

                {

                    if (n[i] % d == 0)

                    {

                         // push the element

                        list.push(d);
                        n[i] = n[i] / d;

                    } else

                        d++;

                }

               

            }

            // Catch exception

            catch (StackOverflowException e) {

                System.out.println(e.toString());

               }

 

 

            System.out.print("Ouput for input n element: ");

           

            while (!list.isEmptyStack())

            {

               //System.out.print("Output for input:" +n[i]);

                System.out.print(list.peek());

                list.pop();

                if (!list.isEmptyStack())

                    System.out.print(" * ");

            }

            System.out.println();

            // increment the i

            i++;

        }

    }

}
