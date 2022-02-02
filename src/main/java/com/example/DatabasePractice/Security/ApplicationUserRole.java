package com.example.DatabasePractice.Security;

import com.google.common.collect.Sets;

import java.util.Set;

public enum ApplicationUserRole {
    ADMIN(Sets.newHashSet(ApplicationUserPermission.ADMIN)),
    USER(Sets.newHashSet(ApplicationUserPermission.USER));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
