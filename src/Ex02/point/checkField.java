package Ex02.point;

public class checkField {
    /**
     * Check if a field is null, empty or blank.
     *
     * @param field String field to check
     * @param label Prefix for error message.
     * @throws NullPointerException     in case field is null.
     * @throws IllegalArgumentException in case field is empty or blank.
     */
    public static void checkNullOrEmptyOrBlank(String field, String label) {
        if (field == null) {
            throw new NullPointerException(label + " should not be null.");
        }
        if (field.isEmpty() || field.isBlank())
            throw new IllegalArgumentException(label + " should not be empty or blank.");
    }
}
