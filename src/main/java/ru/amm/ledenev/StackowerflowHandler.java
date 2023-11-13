package ru.amm.ledenev;

public class StackowerflowHandler extends Handler{
    public StackowerflowHandler(int typeSite) {
        super(typeSite);
    }

    @Override
    public void writeResult(String request) {
        System.out.println("Номер вопроса: " + gettingNumberFromLink(request));
    }

    private String gettingNumberFromLink(String link){
        String[] tabs = link.split("/");
        return tabs[4];
    }
}


//https://stackoverflow.com/questions/77476002/adding-wpf-page-file-type-in-excel-vsto-project