package com.mj.mjjiagou.log;

import org.jetbrains.annotations.NotNull;

public class JustLogManager {
    private static JustLogManager instance;

    private JustLogConfig config;

    private JustLogManager() {

    }

    public static JustLogManager getInstance() {
        if (instance == null) {
            instance = new JustLogManager();
        }
        return instance;
    }

    public void init(@NotNull JustLogConfig config) {
        this.config = config;
    }

    public JustLogConfig getConfig() {
        return config;
    }
}
