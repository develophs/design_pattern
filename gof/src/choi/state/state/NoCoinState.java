package choi.state.state;

import choi.state.domain.VendingMachineV3;

public class NoCoinState implements State {

    @Override
    public void insertCoin(final int coin, final VendingMachineV3 vm) {
        vm.increaseCoin(coin);
        vm.changeSelectable();
    }

    @Override
    public void select(final int productId, final int price, final VendingMachineV3 vm) {
        vm.showWarning();
    }
}
