package Work3;

/**
 * Класс Greeter нарушает сразу несколько принципов SOLID
 * Среди прочего, это принцип единой ответственности и принцип открытости/закрытости.
 */

public class Greeter {
    private String formality = "";

    public String greet() {
        switch (this.formality) {
            case "formal":
                return "Good evening, sir.";
            case "casual":
                return "Sup bro?";
            case "intimate":
                return "Hello Darling!";
            default:
                return "Hello.";
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
