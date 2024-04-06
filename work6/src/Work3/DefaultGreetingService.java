package Work3;

public class DefaultGreetingService implements GreetingService{

    Greeting greeting = new DefaultGreeting();

    @Override
    public String greet() {
        return greeting.greet();
    }

    @Override
    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }
}
