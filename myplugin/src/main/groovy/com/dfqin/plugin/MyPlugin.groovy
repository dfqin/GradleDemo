  
package com.dfqin.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

public class MyPlugin implements Plugin<Project> {
    void apply(Project project) {
       project.task('printTask') << {
            println "this is a plugin task ！！！"
        }
    }
}