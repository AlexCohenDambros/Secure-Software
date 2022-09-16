package criptografia;

import javax.crypto.*;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class DES {
    private SecretKey chaveSecretaDES;

    public DES(SecretKey chaveSecretaDES) {
        this.chaveSecretaDES = chaveSecretaDES;
    }

    public String criptografarDES(String mensagem) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");

        cipher.init(Cipher.ENCRYPT_MODE, chaveSecretaDES);


        byte[] criptografado = cipher.doFinal(mensagem.getBytes());

        return Base64.getEncoder().encodeToString(criptografado);

    }

    public String descriptografaDES(String encrypted) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");
        cipher.init(Cipher.DECRYPT_MODE, chaveSecretaDES);

        byte[] original = cipher.doFinal(Base64.getDecoder().decode(encrypted));

        return new String(original, StandardCharsets.UTF_8);
    }
}
