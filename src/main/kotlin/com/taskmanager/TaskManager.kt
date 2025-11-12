package com.taskmanager

class TaskManager {
    private val tasks = mutableListOf<Task>()
    private var nextId = 1

    fun addTask(description: String): Task {
        val newTask = Task(nextId++, description)
        tasks.add(newTask)
        return newTask
    }

    fun listTasks(): List<Task> {
        return tasks.toList() // Return an immutable copy
    }

    fun completeTask(id: Int): Boolean {
        val task = tasks.find { it.id == id }
        return if (task != null) {
            task.isCompleted = true
            true
        } else {
            false
        }
    }

    fun deleteTask(id: Int): Boolean {
        return tasks.removeIf { it.id == id }
    }
}