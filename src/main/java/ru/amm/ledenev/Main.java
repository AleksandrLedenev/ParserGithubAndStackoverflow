package ru.amm.ledenev;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Handler gitHandler = new GitHubHandler(TypeSite.GITHUB);
        Handler StackHandler = new StackowerflowHandler(TypeSite.STACKOVERGLOW);

        gitHandler.setNext(StackHandler);

        String request = "https://github.com/AleksandrLedenev/laba-3";

        gitHandler.requestHandler(request, TypeSite.GITHUB);

    }
}