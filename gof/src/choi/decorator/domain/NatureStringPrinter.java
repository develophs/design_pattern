package choi.decorator.domain;

public class NatureStringPrinter implements StringPrinter {

    @Override
    public void write(final String input) {
        System.out.println(input);
    }
}
