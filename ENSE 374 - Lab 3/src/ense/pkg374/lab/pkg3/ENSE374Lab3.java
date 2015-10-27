/**
AUTHOR: Clayton Brezinski 200220989
FILENAME: Ense374Lab3.java
DESCRIPTION: Main 
*/
package ense374.lab.pkg3;
import java.util.Scanner;
import java.util.Arrays;

/*
    Purpose:
    Arguements:
*/
public class Ense374Lab3 
{

    /*
    Purpose:
    Arguements:
    */
    public static void main(String[] args) 
    {
        // 
        ense374.lab.pkg3.ListElement head = new ense374.lab.pkg3.ListElement();
        head.setData(5);
        mainUI(head);
        
        
    }
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
            System.out.println("D: print the current linked list structure");
            System.out.println("X: exit");
            userInput = input.next(".").charAt(0);
            if (userInput == 'A' || userInput == 'a')
            {
                System.out.println("Please enter the integer data value for this node.");
                int newDataValue = input.nextInt();
                input.nextLine();
                ense374.lab.pkg3.ListElement toAddElement = new ense374.lab.pkg3.ListElement(newDataValue);
                head.addElement(toAddElement);
            }
            else if (userInput == 'B' || userInput == 'b')
            {
                System.out.println("Please enter the index of the node that you wish to delete");
                int deleteElementIndex = input.nextInt();
                input.nextLine();
                head.deleteElement(deleteElementIndex);
                System.out.println("Element: " + deleteElementIndex + " has been deleted");
            }
            else if (userInput == 'C' || userInput == 'c')
            {
                System.out.println("Please enter the index of the node that you wish to view");
                int viewElementIndex = input.nextInt();
                input.nextLine();
                ListElement temp = head.getElement(viewElementIndex);
                System.out.println(temp.getData());
            }
            else if (userInput == 'D' || userInput == 'd')
            {
                head.printLinkedListFromHead();
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
            
    
}



