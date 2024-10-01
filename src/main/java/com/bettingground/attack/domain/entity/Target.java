package com.bettingground.attack.domain.entity;

import jakarta.persistence.*;

@Embeddable
public class Target {
    @Column(name = "target_monster_token")
    private String monsterToken;
}
