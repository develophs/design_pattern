package choi.decorator.domain;

public class BufferDecorator extends Decorator {

    private StringPrinter delegate;

    public BufferDecorator(StringPrinter delegate) {
        super(delegate);
    }

    @Override
    public void write(String input) {
        super.doDelegate(buffer(input));
    }

    private String buffer(String input) {
        return "buffer ::: " + input;
    }
}
