package com.github.ysl3000.benchmarks;

import com.github.ysl3000.Plugin3;
import com.github.ysl3000.api.IPlugin;
import org.openjdk.jmh.annotations.Benchmark;

public class ContextSwitchReturnType extends AbstractBenchmark {


    @Benchmark
    public void runBenchmark(){

        IPlugin plugin = preparePluginLoader.getPluginLoader().getPlugin("Plugin3");

        if(plugin != null && plugin instanceof Plugin3){
            System.out.println("Result Message is: "+((Plugin3)plugin).returnMessage("ContextSwitch with returntype"));
        }

    }

}
