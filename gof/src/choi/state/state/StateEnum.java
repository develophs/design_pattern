package choi.state.state;

import choi.state.domain.VendingMachineV4;

/**
 * 상태 (State)값들을 Enum을 이용하여 한번에 관리할 수 있다.
 * 상태 추가시 Enum 코드만 수정하면 된다.
 */
public enum StateEnum {
    NO_COIN {
        @Override
        public void insertCoin(final int coin, final VendingMachineV4 vm) {
            vm.increaseCoin(coin);
            vm.changeSelectable();
        }

        @Override
        public void select(final int productId, final int price, final VendingMachineV4 vm) {
            vm.showWarning();
        }
    },
    SELECTABLE {
        @Override
        public void insertCoin(final int coin, final VendingMachineV4 vm) {
            vm.increaseCoin(coin);
        }

        @Override
        public void select(final int productId, final int price, final VendingMachineV4 vm) {
            vm.provideProduct(productId);
            vm.decreaseCoin(price);
            if (!vm.hasCoin()) {
                vm.changeNoCoin();
            }
        }
    },
    SOLD_OUT {
        @Override
        public void insertCoin(final int coin, final VendingMachineV4 vm) {
            vm.returnCoin(coin);
        }

        @Override
        public void select(final int productId, final int price, final VendingMachineV4 vm) {
            vm.showWarning();
        }
    };

    public abstract void insertCoin(int coin, VendingMachineV4 vm);

    public abstract void select(int productId, int price, VendingMachineV4 vm);
}
