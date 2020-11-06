import java.io.*;
import java.util.*;
import java.util.zip.*;

/**
 * This program reads contents of a ZIP file.
 *
 * @author www.codejava.net
 */
public class ReadZipFile {

    static List<String> retA = new ArrayList<>();

    private static void read(String zipFilePath) {
        try {

            ZipFile zipFile = new ZipFile(zipFilePath);

            Enumeration<? extends ZipEntry> entries = zipFile.entries();

            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                String name = entry.getName();
                //long compressedSize = entry.getCompressedSize();
                //long normalSize = entry.getSize();
                //String type = entry.isDirectory() ? "DIR" : "FILE";

                retA.add(name);
                //System.out.println(name);
                //System.out.format("\t %s - %d - %d\n", type, compressedSize, normalSize);
            }

            zipFile.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public static List<String> main(String args) {
        String zipFilePath = args;
        read(zipFilePath);
        return retA;
    }
}