
public class HammingUtils {
    /**
     * Raise 2 by the provided integer
     * @param power: The number you want to raise 2 by
     * @return The result
     */
    public static int raise2By(int power){
        if(power <1)
            return 1;
        return 2 << power-1;
    }


    /**
     * This method counts the number of 1 in a byte stream
     * @param b: byte[] -> An array of bytes whose 1's you want to count
     * @return count:int
     */
    public static int countOnes(byte b[]){
        int count = 0;
        for(int i=0; i< b.length;i++){
            byte current = b[i];

            while(current != 0 ){
                if(((int)current & 0x01)==1)
                    count++;
                current = (byte)(current>>1);
            }
        }
        return count;

    }

    /**
     * This method extracts the bits specified by the hammingBit to calculate the hammingParity
     * @param sourceArray : The array containing data
     * @param hammingBit : The hamming bit that must be used to obtain the result
     * @return byte[]: The resultant bit pattern
     */
    public static byte[] extractBitsAt(byte sourceArray[], int hammingBit){
        int counter = 1;
        byte out[] = new byte[sourceArray.length];
        int outPointer = 0, outBasePointer = 1;
        for(int i=0; i<=sourceArray.length; i++){
            byte current = sourceArray[i];

        }
        return out;
    }


    public static int getHammingPattern(int hammingBit){
        if (hammingBit <= 0)
            return -1;

        int result = 0;
        for(int i = hammingBit; i < 32; i++){
           if((i & hammingBit) == hammingBit)
               // must or the ith bit
               System.out.println("adding i = "+i);
               result = result | (1 << i);
        }
        return result;
    }



    /**
     * This method returns the bit present in the array at the specified index... note its values must range from 1 to 8
     * @param theByte The byte from which you want to extract the bit
     * @param index The position of the bit... NOTE this isnt an index its values must be between 1 and 8, if not -1 is returned
     * @return
     */
    public static int getBitAt(byte theByte , int index){
        if(index <=0 || index>8)
            return -1;
        return (theByte >> index) & 0x01;

    }

}
