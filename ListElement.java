/**
AUTHOR: Clayton Brezinski 200220989
FILENAME: ListElement.java
DESCRIPTION: 
*/
package ense374.lab.pkg3;
import java.util.Arrays;
/**
 *
 * 
 */

/*
    Purpose:
    Arguements:
*/
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
    Arguements:
    */
    public void addElement(ListElement le)
    {
        ListElement currentElement = this;
        while (currentElement.previous != null)
        {
            currentElement = currentElement.previous;
        }
        currentElement.previous = le;
    }
    /*
    Purpose:
    Arguements:
    */
    public ListElement getElement(int index)
    {
        
        //this may have to have the head handed to it and set currentElement = to it.
        ListElement currentElement = this;
        for (int i = 0; i < index; i++)
        {
            currentElement = this.previous;
        }
        return currentElement;
    }
    
    /*
    Purpose:
    Arguements:
    */
    public void deleteElement(int index)
    {
        ListElement currentElement = getElement(index - 1);
        ListElement elementBefore = currentElement;
        //go to element being deleted: 
        currentElement = currentElement.previous;
        elementBefore.previous = currentElement.previous;
        currentElement = null;
        System.gc();
        
    }
    
    /*
    Purpose:
    Arguements:
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
}
