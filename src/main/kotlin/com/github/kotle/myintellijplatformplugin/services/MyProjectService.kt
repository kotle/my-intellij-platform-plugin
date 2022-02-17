package com.github.kotle.myintellijplatformplugin.services

import com.intellij.openapi.project.Project
import com.github.kotle.myintellijplatformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
