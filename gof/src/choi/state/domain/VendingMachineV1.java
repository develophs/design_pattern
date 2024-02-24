package choi.state.domain;

/**
 * 자판기 첫 출시
 * 상태 : 노코인, 선택가능(코인이 충분히 있는경우)
 * 모든 상태와 책임을 자판기가 가지고있다.
 */
public class VendingMachineV1 {
    
    private static enum State { NO_COIN, SELECTABLE }

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
        }
    }

    public void select(int productId, int price) {
        switch (state) {
            case NO_COIN :
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

    public State getState() {
        return state;
    }

    public int getCoin() {
        return coin;
    }
}
