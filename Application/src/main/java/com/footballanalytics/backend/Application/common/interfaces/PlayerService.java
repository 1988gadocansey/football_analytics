package com.footballanalytics.backend.Application.common.interfaces;

import com.footballanalytics.backend.Application.common.dto.PlayerDTo;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PlayerService extends ReactiveCrudRepository<PlayerDTo, UUID> { }
