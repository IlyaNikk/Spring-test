package main.dto;

public class CommonDTO<T> {

    private int code;

    private T message;

    public CommonDTO(int code, T message) {
        this.code = code;
        this.message = message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public T getMessage() {
        return message;
    }
}
