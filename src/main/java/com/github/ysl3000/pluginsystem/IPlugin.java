package com.github.ysl3000.pluginsystem;

/**
 * Created by ysl3000
 */
public  interface IPlugin {

    String getPluginIdentity();

    void onEnable();

    void onDisable();


}
