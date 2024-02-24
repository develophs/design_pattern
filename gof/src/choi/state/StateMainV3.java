package choi.state;

import choi.state.domain.VendingMachineV3;

/**
 * 상태 패턴 : 동일한 기능 요청을 객체의 상태에따라 다르게 구현해야할 때 사용한다.
 * ex) 1. 자판기에 동전이 0개인 경우(상태) 상품을 클릭하면(동일한 기능요청) -> 결과 : 경고등 표시
 *     2. 자판기에 동전이 충분히 있는경우(상태) 상푸 상품을 클릭하면(동일한 기능요청) -> 결과 : 상품 제공 및 동전 갯수 차감
 */
public class StateMainV3 {

    public static void main(String[] args) {
        final VendingMachineV3 vm = new VendingMachineV3();
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
