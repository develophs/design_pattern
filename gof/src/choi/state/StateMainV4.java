package choi.state;

import choi.state.domain.VendingMachineV4;

public class StateMainV4 {

    public static void main(String[] args) {
        final VendingMachineV4 vm = new VendingMachineV4();
        System.out.println(vm.getState() + " :: " + vm.getCoin());
        vm.select(1, 1);

        vm.insertCoin(10);
        System.out.println(vm.getState() + " :: " + vm.getCoin());

        vm.select(1, 1);
        System.out.println(vm.getState() + " :: " + vm.getCoin());

        vm.select(2, 9);
        System.out.println(vm.getState() + " :: " + vm.getCoin());

    }
}
