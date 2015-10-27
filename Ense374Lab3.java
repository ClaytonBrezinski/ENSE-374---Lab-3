/**
AUTHOR: Clayton Brezinski 200220989
FILENAME: Ense374Lab3.java
DESCRIPTION: Main 
*/
package ense374.lab.pkg3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Ense374Lab3 
{

    /*
    Purpose: main
    Arguements:
    */
    public static void main(String[] args) 
    {
        // 
        ense374.lab.pkg3.ListElement head = new ense374.lab.pkg3.ListElement();
        head.setData(5);
        mainUI(head); 
    }
    /*
    Purpose: to give a UI and to give the user what they want
    Arguements: ListElement - the given head requested in the assignment
    */
    private static void mainUI(ListElement head)
    {
        Scanner input = new Scanner(System.in);
        char userInput = 'q';
        while (userInput != 'x')    
        {
            System.out.println("What would you like to do?");
            System.out.println("A: add a node to the linked list");
            System.out.println("B: delete a node from the linked list");
            System.out.println("C: view a node from the linked list");
            System.out.println("D: print the current linked list structure head to tail");
            System.out.println("E: print the current linked list structure tail to head");
            System.out.println("X: exit");
            userInput = input.next(".").charAt(0);
            if (userInput == 'A' || userInput == 'a')
            {
                
                System.out.println("Please enter the value of the node you wish to create");
                int newDataValue = ensureInteger(input);
                input.nextLine();
                ense374.lab.pkg3.ListElement toAddElement = new ense374.lab.pkg3.ListElement(newDataValue);
                head.addElement(toAddElement);
            }
            else if (userInput == 'B' || userInput == 'b')
            {
                System.out.println("Please enter the index of the node that you wish to delete");
                int deleteElementIndex = ensureInteger(input);
                input.nextLine();
                head = head.deleteElement(deleteElementIndex);
                System.out.println("Element: " + deleteElementIndex + " has been deleted");
                if (head == null)
                {
                    System.out.println("There is no head present, please enter a data value for the head.");
                    int newDataValue = ensureInteger(input);
                    head = new ense374.lab.pkg3.ListElement(newDataValue);
                }
            }
            else if (userInput == 'C' || userInput == 'c')
            {
                
                System.out.println("Please enter the index of the node that you wish to view");
                int viewElementIndex = ensureInteger(input);
                input.nextLine();
                ListElement temp = head.getElement(viewElementIndex);
                System.out.println(temp.getData());
            }
            else if (userInput == 'D' || userInput == 'd')
            {
                head.printLinkedListFromHead();
            }
            else if (userInput == 'E' || userInput == 'e')
            {
                head.printLinkedListFromTail();
            }
            else if (userInput == 'X' || userInput == 'x')
            {
                    System.out.println("Exiting program");
                    break;
            }
            else
            {
                System.out.println("Incorrect input");
            }
        }
    }
    
    /*
    Purpose: To make sure that the user enters an interger 
    Arguements: Scanner - allows the system to read in values from the user
    */
    public static int ensureInteger(Scanner input)
    {
        int variable;
        while (true)
                {
                    try
                    {
                        System.out.print("Please enter the integer data value:");
                        variable = input.nextInt();
                    }
                    catch(InputMismatchException  e)
                    {
                        System.out.println("This is not an integer");
                        input.nextLine();
                        continue;
                    }
                    break;
                }
        return variable;
    }
            
    
}



