package com.amanmehara.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Copy

/**
 * Created by Aman on 26-05-2017.
 */
class GreetingPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('hello', type: GreetingTask)
        project.task('hi', type: GreetingTask) {
            greeting = 'hi!'
        }
    }

}
