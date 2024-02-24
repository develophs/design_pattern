package choi.state.state;

import choi.state.domain.VendingMachineV3;

public class SelectableState implements State {

    @Override
    public void insertCoin(final int coin, final VendingMachineV3 vm) {
        vm.increaseCoin(coin);
    }

    @Override
    public void select(final int productId, final int price, final VendingMachineV3 vm) {
        vm.provideProduct(productId);
        vm.decreaseCoin(price);
        if (!vm.hasCoin()) {
            vm.changeNoCoin();
        }
    }
}
