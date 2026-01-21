public class Solution {
    public final static int MAX_VALUE = 1000000007;
    public int solve(int A) {
        long total = 0, noOfOnePerBit, bitsCount = 0;
        long val;
        while (A != 0) {

            if (A == 1) {

                total = (total + 1) % MAX_VALUE;

                break;

            }
            val = 2;

            bitsCount = 1;
            while (val * 2 <= A) {

                val = val * 2;

                bitsCount++;

            }
            noOfOnePerBit = val / 2;

            while (bitsCount > 0) {

                total = (total + noOfOnePerBit) % MAX_VALUE;

                bitsCount--;

            }

            

            // As we are reducing A in the next line from A -> A - (int) val

            // there will next bit 1 for all the higher number, adding that difference

            total = (total + A - (int)val + 1) % MAX_VALUE;

            A = A - (int)val;

        }

        

        return (int) total;
    }
}




Custom 
