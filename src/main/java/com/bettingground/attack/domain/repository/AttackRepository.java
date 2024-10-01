package com.bettingground.attack.domain.repository;

import com.bettingground.attack.domain.entity.*;
import org.springframework.data.jpa.repository.*;

public interface AttackRepository extends JpaRepository<Attack, Long> {
}
