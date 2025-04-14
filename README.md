[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=19160650)
# Lab 15 - Selection Sort + Array Methods

**Implement the Selection Sort Algorithm Using Array Methods**

_Learning Objective: Demonstrate an understanding of creating static methods with arrays._

### 

[How Selection Sort Works](https://www.youtube.com/watch?v=g-PGLbMth_g) (watch until 2:22)


## Lab Prompt:
We often use the same methods over and over again. To make it easier to reuse these, we create utility classes which are a collection of useful methods centered around a common theme.  For example, `UtilityBelt` is a collection of useful methods for getting console input. 

For this lab you will write useful methods inside the class ``ArrayMethods`` for int arrays.

## Lab Instructions: 

### Step 1: 
We want to be able to view the contents of an array in a readable format. Create a static method ``arrayString()`` that takes an array of integers and will output a String of an array as a horizontal list, separated by commas and enclosed with curly brackets as shown here:
```
{ 12, 16, 26, 42, 53, 77, 84 }
```


### Step 2: 
Write a method ``swap()`` to swap two elements in an int array given the indexes where the swap should occur. Be careful that you don’t overwrite a value that you still need to access before storing it elsewhere. Swapping the values stored at two indexes in an array has multiple uses, such as for sorting an array or reversing an array.

### Step 3:
Given an array and an index, write a method ``indexOfMin()`` to find the index of the minimum element in the array, starting from that specific index. This method will loop through the array and return the index of the minimum element, beginning from the start index (ignores all earlier indices). 

For example, if we have an array: ```int[] numbers = {42, 16, 84, 12, 77, 26, 53};``` and we call the method: ```ArrayMethods.indexOfMin(numbers, 0);``` the index 3 should be returned (since 12 is the min, starting at index 0). 

However, if we call: ```ArrayMethods.indexOfMin(numbers, 4);``` the index of 5 should be returned (since 26 is the min, when starting at index 4)

**Note that the index where the minimum occurs needs to be returned, not the minimum value itself**


### Step 4:
Write a method ``reverse()`` to reverse the order of a given array.  Invoke the ``swap()`` method within the body of this method to demonstrate the modular code essential to object oriented programming. 

For example, if we have an array: ```int[] numbers = {42, 16, 84, 12, 77, 26, 53};``` and we call the method: ```ArrayMethods.reverse(numbers);``` We then have 
``` 
{53, 26, 77, 12, 84, 16, 42}
```

### Step 5:
Write a method ``selectionSort()`` that takes an array and sorts it into ascending order (least to greatest). Invoke the ``swap()`` and ``indexOfMin()`` methods you already wrote within the body of this method. 

If we have an array ```int[] numbers = {42, 16, 84, 12, 77, 26, 53};``` Calling ```ArrayMethods.selectionSort(numbers);``` would return:
```
{ 12, 16, 26, 42, 53, 77, 84 }
``` 