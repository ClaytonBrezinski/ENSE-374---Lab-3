/**
AUTHOR: Clayton Brezinski 200220989
FILENAME: ListElement.java
DESCRIPTION: class file for the listElement variables used in lab 3
*/
package ense374.lab.pkg3;
import java.util.Arrays;
import java.util.InputMismatchException;


public class ListElement
{
    private ListElement next;
    private ListElement previous; 
    private int data;
    
    /*
    Purpose: Default Constructor for a ListElement
    Arguements: none
    */
    public ListElement()
    {
        this.data = 0;
        this.next = null;
        this.previous = null;
    }
    /*
    Purpose: Overloaded constructor for a ListElement
    Arguements: int - data value you wish to set this new list element as
    */
    public ListElement(int inData)
    {
        this.data = inData;
        this.next = null;
        this.previous = null;
    }
    /*
    Purpose: Set the data variable of the ListElement
    Arguements: int - data value to be set
    */
    public void setData(int inData)
    {
        this.data = inData;
    }
    public void setNext(ListElement pointTo)
    {
        this.next = pointTo;
    }
    /*
    Purpose: return the data variable of the ListElement
    Arguements: none
    */
    public int getData()
    {
       return this.data; 
    }
    /*
    Purpose: add a ListElement to the linked list
    Arguements: ListElement - the list element that you wish to add to the list
    */
    public void addElement(ListElement le)
    {
        ListElement currentElement = this;
        // if the head is not present, create one
        if (this == null)
        {
            setData(le.data);
        }
        while (currentElement.previous != null)
        {
            currentElement = currentElement.previous;
        }
        currentElement.previous = le;
        le.setNext(currentElement);
    }
    /*
    Purpose: Get the element at the given index
    Arguements: int - index of the object we wish to find. 
    */
    public ListElement getElement(int index)
    {
        
        ListElement currentElement = this;
        for (int i = 0; i < index; i++)
        {
                if (currentElement.previous == null && (i - index != 0))
                {
                    System.out.println("this node does not exist so we will return the closest node");
                    break;
                }
                else
                {
                    currentElement = currentElement.previous;
                }
        }
        return currentElement;
    }
    
    /*
    Purpose: Delete the node at the given index
    Arguements: int - index of the node wished to be deleted. 
    */
    public ListElement deleteElement(int index)
    {
        // need to take into account if the head is deleted
        if (index == 0)
        {
            // if its only the head present
            ListElement currentElement = getElement(0);
            if (currentElement == null)
            {
                // do nothing, no head present. 
            }
            else if (currentElement.previous == null)
            {
                currentElement = null;
            }
            // if it has other nodes present
            else if (currentElement.previous != null)
            {
                currentElement = currentElement.previous;
                currentElement.setNext(null);
            }
            System.gc();
            return currentElement;
        }
        else
        {
            //go to element being deleted: 
            ListElement currentElement = getElement(index - 1);
            ListElement elementBefore = currentElement;
            currentElement = currentElement.previous;
            
            elementBefore.previous = currentElement.previous;
            ListElement elementAfter = currentElement.previous;
            elementAfter.next = elementBefore;
            currentElement = null;
            System.gc();
            return this;          
        }  
    }
    
    /*
    Purpose: to print the linked list from the head to the tail
    Arguements: none
    */
    public void printLinkedListFromHead()
    {
        ListElement currentElement = this;
        System.out.print(this.data + " ");
        while (currentElement.previous != null)
        {
            System.out.print(currentElement.previous.getData() + " ");
            currentElement = currentElement.previous;
        }
        System.out.println("\n");
        // simple print using "previous" pointer. loop until "previous" = null
    }
    /*
    Purpose: to print the linked list from the tail to the head
    Arguements: none
    */
    public void printLinkedListFromTail()
    {
        ListElement currentElement = this;
        while (currentElement.previous != null)
        {
            currentElement = currentElement.previous;
        }
        
        while (currentElement.next != null)
        {
            System.out.print(currentElement.data + " ");
            currentElement = currentElement.next;
        }
        System.out.print(this.data);
        System.out.println("\n");
    }
    
}        

