package com.example.Nipi.profile;

public record ProfileRequest(
        String userName,
        String fullName,
        String phoneNumber,
        String bio,
        String profilePictureUrl,
        String coverPictureUrl,
        String location
) {}
