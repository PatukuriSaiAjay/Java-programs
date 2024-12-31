public class demo 
{
    public static void main(String[] args) 
    {
        byte a=127;                           //byte size:1 byte,        range: -128 to 127
        short b=30000;                        // short size:2 byte,      range:  -32768 to 32767
        int c=54322;                          // int size:4 byte,        range: 2^{31} to 2^{31}-1
        long d=344777373;                     // long size:8 byte,       range :2^{63} to 2^{63}-1

        float e= 40.5f;                       // float size:4 byte,      range: 3.4* 10^{-38} to 3.4* 10^{38}
        double f= 63044.212214;               // double size:8 byte,     range : 1.7 * 10^{-308} to 1.7 * 10^{308}

        char g='A';                           // char size: 2 bytes

        boolean h=true;                       // boolean size: 1 bit

    }
    
}

