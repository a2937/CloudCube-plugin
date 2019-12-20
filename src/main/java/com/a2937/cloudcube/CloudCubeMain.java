
package com.a2937.cloudcube;

import com.avairebot.config.EnvironmentOverride;
import com.avairebot.plugin.JavaPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CloudCubeMain extends JavaPlugin {

    public static final Logger LOGGER = LoggerFactory.getLogger(com.a2937.cloudcube.CloudCubeMain.class);


    @Override
    public void onEnable() {
        saveDefaultConfig();
        reloadConfig();

        EnvironmentOverride.overrideWithPrefix("CLOUDCUBE", getConfig());
    }

}
