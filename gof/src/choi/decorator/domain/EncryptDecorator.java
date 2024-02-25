package choi.decorator.domain;

public class EncryptDecorator extends Decorator{

    public EncryptDecorator(final StringPrinter delegate) {
        super(delegate);
    }

    @Override
    public void write(final String input) {
        final String encrypt = encrypt(input); //자신의 책임을 수행
        super.doDelegate(encrypt); //부모 메서드 호출
    }

    private String encrypt(String input) {
        return "***" + input + "***";
    }
}
