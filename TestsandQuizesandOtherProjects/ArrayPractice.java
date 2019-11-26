public class ArrayPractice{
  public static void main ( String[] args )
  {
    double[] val = new double[4];  // an array of double 
                                   // cells initialized to 0.0
    val[0] = 0.12;
    val[1] = 1.43;
    val[2] = 2.98;

    int j = 3;
    System.out.println( "cell 3: " + val[ j   ] );
    System.out.println( "cell 2: " + val[ j-1 ] );

    j = j-2;
    System.out.println( "cell 1: " + val[ j   ] );
   }
}

// Here is a list of facts about arrays. You may wish to refer back to a page that discusses a particular fact in greater detail.

// array An array is an object that has room for several values, all of the same type.

// Each value is stored in a cell of the array. The values stored in an array are sometimes called the elements of the array.

// If there are N cells in the array, the cells are indexed from 0 up to (N-1).

// The index must be an integer value (byte, short, or int).

// array, declaration An array declaration looks like:

//     int[] intArray;
    
// This declaration declares the array reference intArray. It does not create the actual object.

// An array can be declared and constructed in a combined statement:

//     int[] intArray = new int[17];
    
// This declaration declares the array reference intArray, and constructs an array object containing 17 cells that can hold int.

// When an array object is constructed using the new operator, the cells are array, default initialization initialized to the default value of the type of the cell. Numeric types are initialized to zero.

// Once an array object has been constructed, the number of cells it has can not be changed. (However, a completely new array object, with a different number of cells, can be constructed to replace the first array object.)

// subscripted variable A subscripted variable such as intArray[12] can be used anywhere an ordinary variable of the same type can be used.

// The index used with an array can be stored in a variable, for example

//     int j = 5 ;
//     intArray[ j ] = 24;  // same as: intArray[ 5 ] = 24
    
// The index used with an array can be computed in an expression, for example

//     int j = 5 ;
//     intArray[ j*2 + 3 ] = 24;  // same as: intArray[ 13 ] = 24
    
// array, bounds checking The index used with an array must be within the range 0..(N-1) where N is is number of cells of the array.

// If an index that is out of bounds is used with an array, an exception is thrown and the program stops running (unless it catches the exception.)

// An array can be declared, constructed, and initialized using an array, initializer list initializer list. This can only be done when the array is first declared.

// Arrays can be confusing at first. But they are very important. If you are somewhat uncertain about arrays, take a break. Then, sometime later, come back to this chapter and work through it again.

// The next chapter will discuss further aspects of arrays.