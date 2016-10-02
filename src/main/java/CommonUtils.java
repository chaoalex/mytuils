import java.io.File;

/**
 * @author wuchao03
 * @version 1.0
 * @date 16/10/1
 */
public class CommonUtils {
    /**
     * Convert the String to byte
     *
     * @param str
     *
     * @return
     */
    public static byte stringToByte(String str) {
        if (str.length() == 1) {
            return (byte) str.charAt(0);
        }
        if ("\\t".equals(str)) {
            return 0x9;
        }
        if ("\\n".equals(str)) {
            return 0xa;
        }
        if ("\\0".equals(str)) {
            return 0x0;
        }
        try {
            Byte val = Byte.decode(str);
            return val.byteValue();
        } catch (NumberFormatException ex) {
            return 0x0;
        }
    }

    /**
     * Guarantee path ends with file separator
     *
     * @param path
     *
     * @return
     */
    public static String guaranteeEndWithSeparator(String path) {
        if (!path.endsWith(File.separator)) {
            path = path + File.separator;
        }

        return path;
    }
}
