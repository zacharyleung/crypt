public class CaesarCipher extends Cipher {
    @Override
    public String encrypt(String plaintext) {
        StringBuilder ciphertext = new StringBuilder(plaintext);
        for (int i = 0; i < ciphertext.length(); ++i) {
            char c = ciphertext.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (ciphertext.charAt(i) - 'a' + 3) % 26);
            }
            ciphertext.setCharAt(i, c);
        }
        return ciphertext.toString();
    }
}
