package limeng.org.util;

public class BytesTool {

    public static String bytes2String(byte[] bytes) {
        char[] var1 = new char[bytes.length];
        for(int var2 = 0; var2 != var1.length; ++var2) {
            var1[var2] = (char)(bytes[var2] & 255);
        }
        return new String(var1);
    }

}
