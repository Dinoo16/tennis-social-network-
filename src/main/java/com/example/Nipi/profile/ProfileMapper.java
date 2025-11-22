package com.example.Nipi.profile;

import org.mapstruct.*;
import java.time.LocalDateTime;


@Mapper(componentModel = "spring")
public interface ProfileMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Profile toEntity(ProfileRequest request);

    @Mapping(target = "formattedCreatedAt", source = "createdAt", qualifiedByName = "formatDateTime")
    @Mapping(target = "formattedUpdatedAt", source = "updatedAt", qualifiedByName = "formatDateTime")
    ProfileResponse toResponse(Profile profile);

//    @Named("formatDateTime")
//    default String formatDateTime(LocalDateTime dateTime) {
//        return dateTime != null ? dateTime.toString() : null;
//    }
}
