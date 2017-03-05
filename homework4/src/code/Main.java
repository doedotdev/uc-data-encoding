package code;

/**
 * There are five encoding programs using AES with different modes of operations in
 * DE9eCBC.java, DE9eCFB.java, DE9eOFB.java, DE9eCTR.java, and DE9eXTS.java.
 * Complete the decoding programs in DE9dCBC.java etc. if needed and decode the
 * test files DE9testCBC.de9 etc.  stallingskey.txt is used as the key for all
 * except XTS, in which case stallingskey2.txt is used.  Whenever there is a
 * second command line argument (for nonce, tweak, etc), tweak.txt is used.
 * Submit the decoded text files and your decoder source code.
 *
 * 5 encoding programs
 * 3 decoding programs
 * stallings key for all except xts
 * stallingskey 2 for xts
 *
 */
public class Main {

    public static void main(String[] args){
        DE9dCBC object = new DE9dCBC();
        String[] args2= {"stallingskey.txt"}; // DE9testCBC.de9
        object.main(args2);

        //DE9dXTS object1 = new DE9dXTS();
        //String[] args3= {"stallingskey2.txt"}; // DE9testCBC.de9
        //object.main(args3);
    }
}
