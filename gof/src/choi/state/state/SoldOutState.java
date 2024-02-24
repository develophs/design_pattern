package choi.state.state;

import choi.state.domain.VendingMachineV3;

public class SoldOutState implements State{

    @Override
    public void insertCoin(final int coin, final VendingMachineV3 vm) {
        vm.returnCoin(coin);
    }

    @Override
    public void select(final int productId, final int price, final VendingMachineV3 vm) {
        vm.showWarning();
    }
}
