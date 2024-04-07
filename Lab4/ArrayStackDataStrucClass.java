package Lab4;

public class ArrayStackDataStrucClass<T> implements ArrayStackADT<T>

{

     // Declare the required variables

    private T[] data;

    private int maxElements;

    private int stackTop;

    // Default constructor of the ArrayStackDataStrucClass class

    public ArrayStackDataStrucClass()

    {

    // Declare variables

        maxElements = 50;

        stackTop = 0;

        data = (T[]) new Object[maxElements];

    }

    // Overloaded and copy constructor of the ArrayStackDataStrucClass class

    public ArrayStackDataStrucClass(int elements)

    {

      // Declare required variables

        maxElements = elements;

        stackTop = 0;
        data = (T[]) new Object[maxElements];

    }

 

     // Declare the initializeStack method

    public void initializeStack()

    {

    // for loop to access the element

        for (int i = 0; i < stackTop; i++)

          // null the data 

            data[i] = null;

        // zero on the stackTopm

        stackTop = 0;

    }

   

  

    // Declare the isEmptyStack method

    public boolean isEmptyStack()

    {

    // return when stack top is equal to zero

        return (stackTop == 0);

    }
// Declare isFullStack methods

public boolean isFullStack()

{

// Return stackTop is equal to maxElements

    return (stackTop == maxElements);

}



// Create  a push method

public void push(T item) throws StackOverflowException

{

// Check the stack is full

    if (isFullStack())

        throw new StackOverflowException();



    data[stackTop] = item;

    stackTop++;

}

// Create peek methods

public T peek() throws StackUnderflowException

{

    if (isEmptyStack())

        throw new StackUnderflowException();
        return data[stackTop - 1];

    }

    // Create void pop methods

    public void pop() throws StackUnderflowException

    {

    // When stack is empty

    // throws exception

        if (isEmptyStack())

            throw new StackUnderflowException();

 

        // decrement stackTop

        stackTop--;

        data[stackTop] = null;

    }

}
