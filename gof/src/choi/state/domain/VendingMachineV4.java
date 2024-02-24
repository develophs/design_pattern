package choi.state.domain;

import choi.state.state.NoCoinState;
import choi.state.state.SelectableState;
import choi.state.state.State;
import choi.state.state.StateEnum;

/**
 * 책에 소개된 상태패턴 : 모든 상태를 인터페이스와 구체 클래스로 관리
 * Enum을 통한 상태 관리 : 하나의 Enum에서 상태클래스를 관리할 수 있다.
 */
public class VendingMachineV4 {

    private StateEnum state = StateEnum.NO_COIN;
    private int coin = 0;

    public void insertCoin(int coin) {
        state.insertCoin(coin, this);
    }

    public void select(int productId, int price) {
        state.select(productId, price, this);
    }

    public void showWarning() {
        System.out.println("경고등 표시");
    }

    public void changeSelectable() {
        state = StateEnum.SELECTABLE;
    }

    public void changeNoCoin() {
        state = StateEnum.NO_COIN;;
    }

    public boolean hasCoin() {
        return coin > 0;
    }

    public void increaseCoin(int coin) {
        this.coin += coin;
    }

    public void decreaseCoin(int coin) {
        if (this.coin < coin) {
            throw new IllegalStateException("동전이 부족합니다.");
        }
        this.coin -= coin;
    }

    public void provideProduct(int productId) {
        System.out.println(productId + " :: 상품 제공");
    }

    public void returnCoin(int coin) {
        decreaseCoin(coin);
        changeNoCoin();
        System.out.println(coin + " :: 반환");
    }

    public String getState() {
        return state.name();
    }

    public int getCoin() {
        return coin;
    }
}
