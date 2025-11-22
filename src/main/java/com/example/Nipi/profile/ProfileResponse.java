package com.example.Nipi.profile;

import java.util.UUID;

public record ProfileResponse(
        UUID id,
        String userName,
        String fullName,
        String phoneNumber,
        String bio,
        String profilePictureUrl,
        String coverPictureUrl,
        String location,

        Integer totalFriend,
        String formattedCreatedAt,
        String formattedUpdatedAt
) {}
