package com.amanmehara.gradle

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import static org.junit.Assert.*
import org.junit.Test

/**
 * Created by Aman on 26-05-2017.
 */
class GreetingPluginTest {
    @Test
    void greeterPluginAddsGreetingTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'com.amanmehara.greeting'

        assertTrue(project.tasks.hello instanceof GreetingTask)

    }
}
