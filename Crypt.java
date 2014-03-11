import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class Crypt {
    /**
     * Usage:
     * java Crypt <cipher> <input file>
     */
    public static void main(String[] args) throws Exception {
//        for (int i = 0; i < args.length; ++i) {
//            System.out.printf("args[%d] = %s\n", i, args[i]);
//        }
        if (args.length != 2) {
            System.out.println("Usage:");
            System.out.println("java Crypt <cipher> <input file>");
        }

        String cipherName = args[0];
        String fileName = args[1];

        Cipher cipher = (Cipher) Cipher.class
                .getClassLoader()
                .loadClass(args[0])
                .newInstance();

        List<String> lines = Files.readAllLines(Paths.get(fileName), 
                StandardCharsets.UTF_8);
        for (String s : lines) {
            System.out.println(cipher.encrypt(s));
        }
    }
}
