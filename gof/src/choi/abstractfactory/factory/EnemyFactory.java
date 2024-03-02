package choi.abstractfactory.factory;

import choi.abstractfactory.domain.boss.Boss;
import choi.abstractfactory.domain.obstacle.Obstacle;
import choi.abstractfactory.domain.smallflight.SmallFlight;

// 추상 팩토리 패턴
// 클라이언트 코드 변경없이 상태에 따라 팩토리에서 콘크리트 클래스를 변경해주기만 하면 된다.
public abstract class EnemyFactory {

    // stage에 따른 적 생성 팩토리를 다르게 구현해준다.
    public static EnemyFactory getFactory(int level) {
        if (level == 1) {
            return new EasyStageEnemyFactory();
        }
        return new HardEnemyFactory();
    }

    // 적, 장애물, 보스 생성을 위한 팩토리 메서드
    public abstract Boss createBoss();
    public abstract SmallFlight createSmallFlight();
    public abstract Obstacle createObstacle();
}
