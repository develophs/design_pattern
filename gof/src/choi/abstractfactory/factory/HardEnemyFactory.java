package choi.abstractfactory.factory;

import choi.abstractfactory.domain.boss.Boss;
import choi.abstractfactory.domain.boss.CloningBoss;
import choi.abstractfactory.domain.obstacle.BombObstacle;
import choi.abstractfactory.domain.obstacle.Obstacle;
import choi.abstractfactory.domain.smallflight.MissileSmallFlight;
import choi.abstractfactory.domain.smallflight.SmallFlight;

public class HardEnemyFactory extends EnemyFactory {

    @Override
    public Boss createBoss() {
        return new CloningBoss();
    }

    @Override
    public SmallFlight createSmallFlight() {
        return new MissileSmallFlight();
    }

    @Override
    public Obstacle createObstacle() {
        return new BombObstacle();
    }
}
