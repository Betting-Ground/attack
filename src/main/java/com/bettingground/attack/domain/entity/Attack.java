package com.bettingground.attack.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.*;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

@Entity
@Table(name = "attacks")
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Attack extends BaseEntity {

    private static final String ATTACK_TOKEN_PREFIX = "attack_";

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "attack_id")
    private Long id;
    private String attackToken;
    @Embedded
    private Target target;
    private Long damage;
    private LocalDateTime attackTime;

}
