package choi.observer.status;

public class Status {

    private boolean normal;
    private int statusCode;

    public Status(boolean normal, int statusCode) {
        this.normal = normal;
        this.statusCode = statusCode;
    }

    public boolean isNormal() {
        return normal;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
