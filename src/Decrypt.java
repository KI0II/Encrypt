public class Decrypt {
    public static String decrypt (String encryptedMessage, String key) {
        String decryptedMessage = encryptedMessage
                .replaceAll(key + "z", "a")
                .replaceAll(key + "x", "e")
                .replaceAll(key + "c", "i")
                .replaceAll(key + "v", "o")
                .replaceAll(key + "b", "u");
        return decryptedMessage;
    }
    public static String decryptTime (String encryptedTime, String key) {
        String decryptedTime = encryptedTime
                .replaceAll(key + "z", "1")
                .replaceAll(key + "x", "2")
                .replaceAll(key + "c", "3")
                .replaceAll(key + "v", "4")
                .replaceAll(key + "b", "5");
        return decryptedTime;
    }
}
