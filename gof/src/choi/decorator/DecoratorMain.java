package choi.decorator;

import choi.decorator.domain.BufferDecorator;
import choi.decorator.domain.EncryptDecorator;
import choi.decorator.domain.NatureStringPrinter;
import choi.decorator.domain.StringPrinter;

/**
 * 데코레이터 패턴 : 상속을 통한 기능 확장은 불필요한 클래스의 증가가 많아 질 수 있다.
 * 상속 및 기능 확장이 커질수록 계층 구조를 파악하기 힘들다.
 * 같은 타입을 상속받고 데코레이터들을 이용해서 기능 적용 순서를 조절하여
 * 기능을 확장할 수 있다.
 */
import java.util.Scanner;

public class DecoratorMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String input = scanner.nextLine();

        // DI 순서를 변경하여도 타입 불일치 컴파일 에러가 발생하지 않는다.
        //StringPrinter printer = new BufferDecorator(new EncryptDecorator(new NatureStringPrinter()));
        StringPrinter printer = new EncryptDecorator(new BufferDecorator(new NatureStringPrinter()));

        printer.write(input);
        scanner.close();
    }
}
