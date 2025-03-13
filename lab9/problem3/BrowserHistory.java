package lab9.problem3;

import java.util.Stack;

public class BrowserHistory {

    private String currentUrl;
    private Stack<String> history = new Stack<>();
    private Stack<String> forwardUrls = new Stack<>();

    public BrowserHistory(String currentUrl) {
        this.currentUrl = currentUrl;
    }

    public String getCurrentUrl() {
        return currentUrl;
    }

    public void setCurrentUrl(String currentUrl) {
        this.currentUrl = currentUrl;
    }

    public void visit(String url) {
        if (url == null || url.isEmpty())
            throw new IllegalArgumentException("Invalid url");
        history.push(this.currentUrl);
        this.currentUrl = url;
        forwardUrls.clear();
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (history.size() == 0) {
            System.out.println("No history to go back to.");
            return;
        }
        String previousUrl = history.pop();
        forwardUrls.push(this.currentUrl);
        this.currentUrl = previousUrl;
        System.out.println("Back to: " + previousUrl);
    }

    public void forward() {
        if (forwardUrls.size() == 0) {
            System.out.println("No forward history.");
            return;
        }
        String forwardUrl = forwardUrls.pop();
        this.currentUrl = forwardUrl;
        System.out.println("Forward to: " + forwardUrl);
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("home.html");
        // Start with home.html
        browser.visit("page1.html");
        browser.visit("page2.html");
        browser.back();
        browser.back();
        browser.back();
        browser.forward();
        browser.forward();
        browser.forward();
        browser.visit("page3.html");
    }

}
