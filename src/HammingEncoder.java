public class HammingEncoder{
    private byte data[];
    private byte encodedData[];
    private int r;// number of parity bits
    private boolean isEven;
    private int length;
    public HammingEncoder(final byte data[], final boolean isEven, final int len ){
        this.data = data;
        this.isEven = isEven;
        this.length = len;
        this.calculateR();
    }


    public void encodeHamming(){
        //a loop for parity bits

        /**
         * The take i leave i pattern
         * which essentially means check if the i'th bit is set ... if not ignore
         */
        int currentHammingBit, hammingBitPattern;
        for(int i=1; i<= this.r; i++){

            currentHammingBit = HammingUtils.raise2By(i);
            hammingBitPattern = HammingUtils.getHammingPattern(currentHammingBit);



        }
    }


    /** GETTERS **/

    public byte[] getData(){
        return this.data;
    }
    public byte[] getEncodedData(){
        return this.encodedData;
    }
    public int getR(){
        return this.r;
    }


    /**
     * This method calculates the value of R
     */
    private void calculateR(){
        int len = this.length;

        if(len == 1){
            this.r = 2;
            return;
        }
        int init = (int)Math.floor(Math.sqrt(this.length));
        // since formula is 2 to pow r >= len + r + 1, incrementing init by one that makes it 2
        while((2 << init) < (len+init+2))
            init++;

        this.r = init+1;

    }

}