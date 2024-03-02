package choi.abstractfactory.factory;

import choi.abstractfactory.domain.boss.AttackBoss;
import choi.abstractfactory.domain.boss.Boss;
import choi.abstractfactory.domain.obstacle.Obstacle;
import choi.abstractfactory.domain.obstacle.RockObstacle;
import choi.abstractfactory.domain.smallflight.DashSmallFlight;
import choi.abstractfactory.domain.smallflight.SmallFlight;

public class EasyStageEnemyFactory extends EnemyFactory {

    @Override
    public Boss createBoss() {
        return new AttackBoss();
    }

    @Override
    public SmallFlight createSmallFlight() {
        return new DashSmallFlight();
    }

    @Override
    public Obstacle createObstacle() {
        return new RockObstacle();
    }
}
