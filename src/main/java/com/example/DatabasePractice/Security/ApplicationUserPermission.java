package com.example.DatabasePractice.Security;

public enum ApplicationUserPermission {
    ADMIN("admin"),
    USER("user");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }
}
