package com.vidhur2k.SpaceInvaders.control;

import com.almasb.ents.AbstractControl;
import com.almasb.ents.Entity;
import com.almasb.fxgl.entity.Entities;
import com.almasb.fxgl.physics.PhysicsComponent;

import static com.vidhur2k.SpaceInvaders.Config.*;

/**
 * Created by vidhur2k on 4/20/17.
 */
public class Enemy_BulletControl extends AbstractControl {

    private PhysicsComponent physicsComponent;

    @Override
    public void onAdded(Entity entity) {

        physicsComponent = Entities.getPhysics(entity);

        physicsComponent.setOnPhysicsInitialized(() -> physicsComponent.setLinearVelocity(0, 5 * BULLET_SPEED));

    }

    @Override
    public void onUpdate(Entity entity, double v) {

    }
}
