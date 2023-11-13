package ru.amm.ledenev;

public abstract class Handler {
    private int typeSite;
    private Handler next;

    public Handler(int typeSite) {
        this.typeSite = typeSite;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public void requestHandler(String request, int type){
        if (type == typeSite){
            writeResult(request);
        }
        if (next != null){
            next.requestHandler(request, type);
        }
    }
    public abstract void writeResult(String request);
}
