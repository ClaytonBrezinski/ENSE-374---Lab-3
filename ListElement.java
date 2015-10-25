/**
AUTHOR: Clayton Brezinski 200220989
FILENAME: ListElement.java
DESCRIPTION: 
*/
package ense374.lab.pkg3;

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
    Purpose: add a ListElement to the 
    Arguements:
    */
    public void addElement(ListElement le)
    {
       
    }
    /*
    Purpose:
    Arguements:
    */
    public ListElement getElement(int index)
    {
        /* 
        this may have to have the head handed to it and set currentElement = to it.
        ListElement currentElement;
        for ( i = 0; i < index; i++)
        {
            currentElement = this.previous;
        }
        return currentElement
        */
    }
    
    /*
    Purpose:
    Arguements:
    */
    public void deleteElement(int index)
    {
        /* 
        will be overloaded
        if singly linked list ( if next = null ):
        ListElement currentElement = getElement(index - 1)
        ListElement elementBefore = currentElement
        go to element being deleted: currentElement = currentElement.previous
        elementBefore.previous = currentElement.previous
        delete currentElement. 
        
        if doubly linked list ( if next != null )
        ListElement currentElement = getElement(index-1)
        ListElement elementBefore = currentElement
        go to element being deleted: currentElement = currentElement.previous
        elementBefore.previous = currentElement.previous
        currentElement = currentElement.previous
        currentElement.next = elementBefore
        */
        
    }
    
    /*
    Purpose:
    Arguements:
    */
    public void printLinkedListFromTail()
    {
        
        /* will be overloaded for singly linked list or doubly linked list
        if singly linked list - create an array the size of the number of list elements. do same function as printLinkedListFromHead but instead of print 
        places the values in the array. From here, print the array backwards
        if doubly linked list - print using "next" pointer. loop until "next" = null
        */
    }
    
    /*
    Purpose:
    Arguements:
    */
    public void printLinkedListFromHead()
    {
        // simple print using "previous" pointer. loop until "previous" = null
    }
}
