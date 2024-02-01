package com.footballanalytics.backend.Application.common.mappings;

import com.footballanalytics.backend.Application.common.dto.PlayerDTo;
import com.footballanalytics.backend.Domain.entities.Player;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface PlayerMapper {
    @Mapping(source = "s.id", target = "customer.id")
    @Mapping(source = "customer.displayName", target = "customer.name")
    @Mapping(source = "street", target = "street.name")
    @Mapping(source = "postalCode", target = "postalCode.value")
    @Mapping(source = "country", target = "country.code")
    PlayerDTo toPlayer(Player player);

    @Mapping(source = "customer.id", target = "customer.id")
    @Mapping(source = "customer.name", target = "customer.displayName")
    @Mapping(source = "street.name", target = "street")
    @Mapping(source = "postalCode.value", target = "postalCode")
    @Mapping(source = "country.code", target = "country")
    Player toPlayerDto(PlayerDTo playerDTo);
}
