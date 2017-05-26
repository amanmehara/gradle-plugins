package com.amanmehara.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by Aman on 26-05-2017.
 */
class GreetingTask extends DefaultTask {

    String greeting = 'hello from GreetingTask'

    @TaskAction
    def greet() {
        println greeting
    }

}
