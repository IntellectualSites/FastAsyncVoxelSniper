package com.thevoxelbox.voxelsniper;

import org.bukkit.configuration.file.FileConfiguration;

/**
 * Configuration storage defining global configurations for VoxelSniper.
 */
public class VoxelSniperConfiguration {
    public static final String CONFIG_IDENTIFIER_MAX_BRUSH_SIZE = "max-brush-size";
    public static final String CONFIG_IDENTIFIER_MESSAGE_ON_LOGIN_ENABLED = "message-on-login-enabled";
    public static final int DEFAULT_MAX_BRUSH_SIZE = 30;
    public static final boolean DEFAULT_MESSAGE_ON_LOGIN_ENABLED = true;
    private FileConfiguration configuration;

    /**
     * @param configuration Configuration that is going to be used.
     */
    public VoxelSniperConfiguration(FileConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * Returns maximum size of brushes that FastAsyncVoxelSniper can use.
     *
     * @return maximum brush size
     */
    public int getVoxelSniperMaxBrushSize() {
        return configuration.getInt(CONFIG_IDENTIFIER_MAX_BRUSH_SIZE, DEFAULT_MAX_BRUSH_SIZE);
    }

    /**
     * Returns if the login message is enabled.
     *
     * @return true if message on login is enabled, false otherwise.
     */
    public boolean isMessageOnLoginEnabled() {
        return configuration.getBoolean(CONFIG_IDENTIFIER_MESSAGE_ON_LOGIN_ENABLED, DEFAULT_MESSAGE_ON_LOGIN_ENABLED);
    }
}
