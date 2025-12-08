package PasswordMng;


import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Scanner;

public class PasswordManager {

    private Vault vault;
    private JSONArray credentials;
    private Scanner scanner;

    public PasswordManager() {
        scanner = new Scanner(System.in);
        vault = new Vault();
        credentials = new JSONArray();
    }

    public void start() {
        if (vault.vaultExists()) {
            System.out.print("Enter master password: ");
            String masterPassword = scanner.nextLine();
            credentials = vault.loadVault(masterPassword);
            if (credentials == null) {
                System.out.println("Wrong master password. Exiting...");
                return;
            }
        } else {
            System.out.print("Set a new master password: ");
            String masterPassword = scanner.nextLine();
            vault.saveVault(masterPassword, credentials);
            System.out.println("Vault created!");
        }

        while (true) {
            System.out.print("\nCommand (add, get, update, delete, list, exit): ");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "add":
                    addCredential();
                    break;
                case "get":
                    getCredential();
                    break;
                case "update":
                    updateCredential();
                    break;
                case "delete":
                    deleteCredential();
                    break;
                case "list":
                    listCredentials();
                    break;
                case "exit":
                    vault.saveVault(vault.getMasterPassword(), credentials);
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid command. Try again.");
            }
        }
    }


    private void addCredential() {
        System.out.print("Site: ");
        String site = scanner.nextLine();
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        JSONObject cred = new JSONObject();
        cred.put("site", site);
        cred.put("username", username);
        cred.put("password", password);

        credentials.put(cred);
        vault.saveVault(vault.getMasterPassword(), credentials);
        System.out.println("Credential added!");
    }

    private void getCredential() {
        System.out.print("Site to retrieve: ");
        String site = scanner.nextLine();
        for (int i = 0; i < credentials.length(); i++) {
            JSONObject cred = credentials.getJSONObject(i);
            if (cred.getString("site").equalsIgnoreCase(site)) {
                System.out.println("Username: " + cred.getString("username"));
                System.out.println("Password: " + "*".repeat(cred.getString("password").length()));
                return;
            }
        }
        System.out.println("Credential not found.");
    }

    private void updateCredential() {
        System.out.print("Site to update: ");
        String site = scanner.nextLine();
        for (int i = 0; i < credentials.length(); i++) {
            JSONObject cred = credentials.getJSONObject(i);
            if (cred.getString("site").equalsIgnoreCase(site)) {
                System.out.print("New Username: ");
                cred.put("username", scanner.nextLine());
                System.out.print("New Password: ");
                cred.put("password", scanner.nextLine());
                vault.saveVault(vault.getMasterPassword(), credentials);
                System.out.println("Credential updated!");
                return;
            }
        }
        System.out.println("Credential not found.");
    }

    private void deleteCredential() {
        System.out.print("Site to delete: ");
        String site = scanner.nextLine();
        for (int i = 0; i < credentials.length(); i++) {
            JSONObject cred = credentials.getJSONObject(i);
            if (cred.getString("site").equalsIgnoreCase(site)) {
                credentials.remove(i);
                vault.saveVault(vault.getMasterPassword(), credentials);
                System.out.println("Credential deleted!");
                return;
            }
        }
        System.out.println("Credential not found.");
    }

    private void listCredentials() {
        if (credentials.isEmpty()) {
            System.out.println("No credentials stored.");
            return;
        }
        for (int i = 0; i < credentials.length(); i++) {
            JSONObject cred = credentials.getJSONObject(i);
            System.out.println((i + 1) + ". " + cred.getString("site") +
                    " | " + cred.getString("username") +
                    " | " + "*".repeat(cred.getString("password").length()));
        }
    }
}
