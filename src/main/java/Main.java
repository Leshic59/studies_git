import org.codehaus.groovy.runtime.StringGroovyMethods;

public class Main {

    private static String msg = "Hello qa.quru!!!!!";

    public static void main(String [] args) {
        System.out.println("getMessage()");
    }

    private static StringGroovyMethods getMessage() {
        return msg;
    }
}
