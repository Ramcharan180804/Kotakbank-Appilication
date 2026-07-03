package util;

public class UTRGenerator {

    private static long count = 987654321001L;

    public static String generateUTR() {
        return "UTR" + count++;
    }
}
