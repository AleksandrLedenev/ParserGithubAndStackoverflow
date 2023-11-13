package ru.amm.ledenev;

public class GitHubHandler extends Handler{

    public GitHubHandler(int typeSite) {
        super(typeSite);
    }

    @Override
    public void writeResult(String request) {
        System.out.println("Имя автора: " + gettingNameAuthorFromLink(request));
        System.out.println("Имя репозитория: " + gettingNameRepositoriesFromLink(request));
    }

    private String gettingNameRepositoriesFromLink(String link){
        String[] tabs = link.split("/");
        return tabs[4];
    }

    private String gettingNameAuthorFromLink(String link){
        String[] tabs = link.split("/");
        return tabs[3];
    }
}
