package PasswordMng;


import org.json.JSONArray;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Base64;

public class Vault {

    private static final String VAULT_FILE = "vault.enc";
    private String masterPassword;

    public String getMasterPassword() { return masterPassword; }

    public boolean vaultExists() { return new File(VAULT_FILE).exists(); }

    public JSONArray loadVault(String password) {
        try {
            this.masterPassword = password;
            String encrypted = new String(Files.readAllBytes(Paths.get(VAULT_FILE)));
            String decrypted = decrypt(encrypted, masterPassword);
            return new JSONArray(decrypted);
        } catch (Exception e) {
            return null;
        }
    }

    public void saveVault(String password, JSONArray credentials) {
        try {
            this.masterPassword = password;
            String jsonStr = credentials.toString();
            String encrypted = encrypt(jsonStr, password);
            Files.write(Paths.get(VAULT_FILE), encrypted.getBytes());
        } catch (Exception e) {
            System.out.println("Error saving vault: " + e.getMessage());
        }
    }

    private SecretKeySpec getKey(String password) throws Exception {
        byte[] key = password.getBytes("UTF-8");
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        key = sha.digest(key);
        return new SecretKeySpec(key, "AES");
    }

    private String encrypt(String strToEncrypt, String password) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, getKey(password));
        return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
    }

    private String decrypt(String strToDecrypt, String password) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, getKey(password));
        return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
    }
}
