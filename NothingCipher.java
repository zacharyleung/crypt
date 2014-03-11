public class NothingCipher extends Cipher {
    @Override
    public String encrypt(String plaintext) {
        return plaintext;
    }
}
