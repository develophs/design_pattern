package choi.abstractfactory.domain.stage;

import choi.abstractfactory.domain.boss.Boss;
import choi.abstractfactory.domain.obstacle.Obstacle;
import choi.abstractfactory.domain.smallflight.SmallFlight;
import choi.abstractfactory.factory.EnemyFactory;

/**
 * Stage 클래스의 코드 변경없이
 * 보스, 적, 장애물의 타입 변경, 생성 변경을 할 수 있다.
 */
public class Stage {

    private EnemyFactory enemyFactory;
    private Boss boss;
    private SmallFlight smallFlight;
    private Obstacle obstacle;

    /**
     * EnemyFactory 타입을 DI 받게 되면
     * 정적메서드인 getFactory(level) 메서드를 사용하지 않아도 된다.
     */
    public Stage(int level) {
        enemyFactory = EnemyFactory.getFactory(level);
    }

    private void createEnemies() {
        smallFlight = enemyFactory.createSmallFlight();
        boss = enemyFactory.createBoss();
    }

    private void createObstacle() {
        obstacle = enemyFactory.createObstacle();
    }
}
