package com.taskmanager

fun main() {
    val taskManager = TaskManager()
    println("Welcome to the Kotlin Task Manager!")

    while (true) {
        println("\nChoose an option:")
        println("1. Add Task")
        println("2. List Tasks")
        println("3. Complete Task")
        println("4. Delete Task")
        println("5. Exit")
        print("Enter your choice: ")

        when (readlnOrNull()) {
            "1" -> {
                print("Enter task description: ")
                val description = readlnOrNull()
                if (!description.isNullOrBlank()) {
                    taskManager.addTask(description)
                    println("Task added successfully!")
                } else {
                    println("Task description cannot be empty.")
                }
            }
            "2" -> {
                val currentTasks = taskManager.listTasks()
                if (currentTasks.isEmpty()) {
                    println("No tasks yet. Add some!")
                } else {
                    println("\n--- Your Tasks ---")
                    currentTasks.forEach { task ->
                        val status = if (task.isCompleted) "[COMPLETED]" else "[PENDING]"
                        println("${task.id}. $status ${task.description}")
                    }
                    println("------------------")
                }
            }
            "3" -> {
                print("Enter ID of task to complete: ")
                val idInput = readlnOrNull()?.toIntOrNull()
                if (idInput != null) {
                    if (taskManager.completeTask(idInput)) {
                        println("Task $idInput marked as completed.")
                    } else {
                        println("Task with ID $idInput not found.")
                    }
                } else {
                    println("Invalid task ID.")
                }
            }
            "4" -> {
                print("Enter ID of task to delete: ")
                val idInput = readlnOrNull()?.toIntOrNull()
                if (idInput != null) {
                    if (taskManager.deleteTask(idInput)) {
                        println("Task $idInput deleted.")
                    } else {
                        println("Task with ID $idInput not found.")
                    }
                } else {
                    println("Invalid task ID.")
                }
            }
            "5" -> {
                println("Exiting Task Manager. Goodbye!")
                return
            }
            else -> println("Invalid choice. Please try again.")
        }
    }
}