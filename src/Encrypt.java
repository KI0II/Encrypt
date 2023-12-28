public class Encrypt {
    public static String encrypt (String message, String key) {
        String encryptedMessage = message
                .replaceAll("a", key + "z")
                .replaceAll("e", key + "x")
                .replaceAll("i", key + "c")
                .replaceAll("o", key + "v")
                .replaceAll("u", key + "b");
        return encryptedMessage;
    }
    public static String encryptTime (String date, String key) {
        String encryptedTime = date
                .replaceAll("1", key + "z")
                .replaceAll("2", key + "x")
                .replaceAll("3", key + "c")
                .replaceAll("4", key + "v")
                .replaceAll("5", key + "b");
        return encryptedTime;
    }
}
