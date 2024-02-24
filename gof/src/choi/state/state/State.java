package choi.state.state;

import choi.state.domain.VendingMachineV3;

/**
 * 상태를 컨텍스트 객체에 두는게 아닌,
 * 상태 객체를 따로 생성한다.
 * 동일한 기능 요청을 상태에 따라 다르게 구현한다.
 * 
 * 자판기를 부모를 생성하고 구체 클래스를 상속을 사용해도 되지만, 지금은 그냥 진행 >> 메서드 접근제어자를 다 변경해야함. V1,V2는 내부호출로 충분하다.
 */
public interface State {
    
    void insertCoin(int coin, VendingMachineV3 vm);

    void select(int productId, int price, VendingMachineV3 vm);
}
