public class adjacentElementsProductJ {
    /*
    Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.integer inputArray

    An array of integers containing at least two elements.

    Guaranteed constraints:
    2 ≤ inputArray.length ≤ 10,
    -1000 ≤ inputArray[i] ≤ 1000.

    [output] integer
        The largest product of adjacent elements.

    */
    int adjacentElementsProduct(int[] inputArray) {

        int m = -1000;
        int mult = 0;
    
        for (int c = 0; c != inputArray.length - 1; c++) {
            mult = inputArray[c] * inputArray[c+1];
    
            if (mult > m) {
                m = mult; 
            }
        }
        return m;
    }
}