package choi.state.domain;

import choi.state.state.NoCoinState;
import choi.state.state.SelectableState;
import choi.state.state.State;

/**
 * 자판기 첫 출시
 * 상태 : 노코인, 선택가능(코인이 충분히 있는경우)
 * 모든 상태와 책임을 자판기가 가지고있다.
 *
 * 추가 요구 사항 :: 제품이 없는 경우 (상태) 동전을 넣으면(기능요청) -> 결과 : 바로 동전을 되돌려준다.
 * 상태가 추가되면 기존에 있던 if-else문 또는 switch문 전부를 수정해야한다.
 *
 * 상태가 추가되어도 VendingMachineV3의 기능 호출은 변함이 없다.
 * 새롭게 추가된 상태에서 상태를 변경해주고, vm의 기능을 호출한다.
 */
public class VendingMachineV3 {

    private State state = new NoCoinState();
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
        state = new SelectableState();
    }

    public void changeNoCoin() {
        state = new NoCoinState();
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
        return state.getClass().getSimpleName();
    }

    public int getCoin() {
        return coin;
    }
}
