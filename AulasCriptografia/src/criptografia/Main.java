package criptografia;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {

        // DES
        KeyGenerator chave = KeyGenerator.getInstance("DES");
        SecretKey chaveSecretaDES = chave.generateKey();

        DES des = new DES(chaveSecretaDES);

        String mensagem = des.criptografarDES("Teste 123");
        String mensagemDescripto = des.descriptografaDES(mensagem);

        System.out.println("DES " + mensagem);
        System.out.println("DES " + mensagemDescripto);

        // AES

        IvParameterSpec iv = new IvParameterSpec(UUID.randomUUID().toString().substring(0, 16).getBytes(StandardCharsets.UTF_8));
        SecretKeySpec skeySpec = new SecretKeySpec("aesEndryptionKey".getBytes(StandardCharsets.UTF_8), "AES");

        AES aes = new AES(skeySpec, iv);

        String mensagemAES = aes.criptAES("Teste 321");
        String mensagemDescriptoAES = aes.descriptAES(mensagemAES);

        System.out.println("AES " + mensagemAES);
        System.out.println("AES " + mensagemDescriptoAES);


    }
}
