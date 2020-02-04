/*
Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.

Example

    For year = 1905, the output should be
    centuryFromYear(year) = 20;
    For year = 1700, the output should be
    centuryFromYear(year) = 17.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] integer year

    A positive integer, designating the year.

    Guaranteed constraints:
    1 ≤ year ≤ 2005.

    [output] integer
        The number of the century the year is in.
*/
public class centuryFromYearJ {

int centuryFromYear(int year) {
    
    int century = 1;
    // Loop of all the years from 1 o 2005
    for (int c = 1; c <= 2005; c++) {
        
        // Changes the century every n01 years (101, 201, 301, 401)!
        if (c == (100 * century) + 1) {
            century++;
        }
        // Century finder 
        if (c == year) {
            break;
        }
        
    }

    return century;
    }
}