## Data Structures

#Arrays
•int[] arr = new int[10] (the [10 ] limits us);
    arr.length;
    →Uses loops alot
    →Can't change length

#ArrayList //api
•ArrayList <String> names = new ArrayList <String>();
    →Generic
    →Sets a standard amount of data
    →Always uses functions   
    →Can add or remove(Can change length)
    →Use if  you don't know how many numbers you have or if you
    want to add or remove
#Examples
arr[0] = 3;
names.add("Hi"); //adds it to the next spot on the list

arr[1] = 2;
names.set(1,"a");

arr.length
names.size();// or length can't remember

int x = arr[0]+1;
names.get(0);

for(int i = 0; i<names.size() ; i++){
    names.remove(3);
    i--;
    }

}

#MultiDimensional Array
•int[][] matrix = new int[3][5];// 3 arrays of length 5

•matrix[1][4] = 9;//row 1 column 4 now = 9

•matrix[2].length;

#MultiDimensional Examples

for(int row = 0; row <= matrix.length ; row ++){        //loop through rows in matrix
    for(int col = 0; col <= matrix[row].length; col++){ //loop through collumns in matrix
        matrix[row][col-1]
    }
}



