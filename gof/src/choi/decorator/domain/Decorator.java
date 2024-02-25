package choi.decorator.domain;

/**
 * 새롭게 알게된 지식 :
 * 추상클래스를 이용하여 인터페이스를 구현하게 되면
 * 인터페이스에 선언한 추상 메서드들을 구현하지 않아도 컴파일 에러가 발생하지 않는다.
 * why) 추상 클래스는 인스턴스를 생성할 수 없다.
 *
 * 데코레이터를 구혀하기위한 기반클래스 생성 : 인터페이스를 선언한 타입을 구현하기 때문에 타입에러가 발생하지 않는다.
 * 추상클래스를 이용하여 인터페이스를 구현하도록하고,
 * 추상클래스의 자손들이 구현 책임을 맡는다.
 */
public abstract class Decorator implements StringPrinter {

    private StringPrinter delegate;

    //생성자를 이용하여 책임을 위임할 클래스를 주입해준다.
    public Decorator(StringPrinter delegate) {
        this.delegate = delegate;
    }

    //주입받은 타입의 write메서드 실행
    protected void doDelegate(String input) {
        delegate.write(input);
    }
}
