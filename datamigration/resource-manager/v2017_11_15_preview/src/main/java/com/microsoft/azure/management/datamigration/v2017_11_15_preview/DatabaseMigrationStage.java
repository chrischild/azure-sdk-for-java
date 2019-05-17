/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DatabaseMigrationStage.
 */
public enum DatabaseMigrationStage {
    /** Enum value None. */
    NONE("None"),

    /** Enum value Initialize. */
    INITIALIZE("Initialize"),

    /** Enum value Backup. */
    BACKUP("Backup"),

    /** Enum value FileCopy. */
    FILE_COPY("FileCopy"),

    /** Enum value Restore. */
    RESTORE("Restore"),

    /** Enum value Completed. */
    COMPLETED("Completed");

    /** The actual serialized value for a DatabaseMigrationStage instance. */
    private String value;

    DatabaseMigrationStage(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DatabaseMigrationStage instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DatabaseMigrationStage object, or null if unable to parse.
     */
    @JsonCreator
    public static DatabaseMigrationStage fromString(String value) {
        DatabaseMigrationStage[] items = DatabaseMigrationStage.values();
        for (DatabaseMigrationStage item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}