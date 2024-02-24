package choi.state.domain;

/**
 * 자판기 첫 출시
 * 상태 : 노코인, 선택가능(코인이 충분히 있는경우)
 * 모든 상태와 책임을 자판기가 가지고있다.
 *
 * 추가 요구 사항 :: 제품이 없는 경우 (상태) 동전을 넣으면(기능요청) -> 결과 : 바로 동전을 되돌려준다.
 * 상태가 추가되면 기존에 있던 if-else문 또는 switch문 전부를 수정해야한다.
 */
public class VendingMachineV2 {
    
    private static enum State { NO_COIN, SELECTABLE, SOLD_OUT }

    private State state = State.NO_COIN;
    private int coin = 0;

    public void insertCoin(int coin) {
        switch (state) {
            case NO_COIN :
                increaseCoin(coin);
                changeSelectable();
                break;

            case SELECTABLE:
                increaseCoin(coin);
                break;

            case SOLD_OUT:
                returnCoin(coin);
        }
    }

    public void select(int productId, int price) {
        switch (state) {
            case NO_COIN :
            case SOLD_OUT:
                showWarning();
                break;

            case SELECTABLE:
                decreaseCoin(price);
                provideProduct(productId);
                if (!hasCoin()) {
                    changeNoCoin();
                }
                break;
        }
    }

    private void showWarning() {
        System.out.println("경고등 표시");
    }

    private void changeSelectable() {
        state = State.SELECTABLE;
    }

    private void changeNoCoin() {
        state = State.NO_COIN;
    }

    private boolean hasCoin() {
        return coin > 0;
    }

    private void increaseCoin(int coin) {
        this.coin += coin;
    }

    private void decreaseCoin(int coin) {
        if (this.coin < coin) {
            throw new IllegalStateException("동전이 부족합니다.");
        }
        this.coin -= coin;
    }

    private void provideProduct(int productId) {
        System.out.println(productId + " :: 상품 제공");
    }

    private void returnCoin(int coin) {
        decreaseCoin(coin);
        changeNoCoin();
        System.out.println(coin + " :: 반환");
    }

    public State getState() {
        return state;
    }

    public int getCoin() {
        return coin;
    }
}
