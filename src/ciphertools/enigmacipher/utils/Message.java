package ciphertools.enigmacipher.utils;

public class Message {
    private String message;

    /**
     *
     */
    public Message() {
        message = "";
    }

    /**
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message.toUpperCase();
    }

    /**
     *
     * @param message
     */
    public void toUpperCase(String message) {
        message.toUpperCase();
    }

    /**
     *
     * @param index
     * @return
     */
    public char charAt(int index) {
        return message.charAt(index);
    }

    public int length() {
        return message.length();
    }
}