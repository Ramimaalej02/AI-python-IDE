# Kotlin Task Manager

A simple command-line task manager application built with Kotlin and Gradle.

## Features

- Add new tasks with a description.
- List all pending and completed tasks.
- Mark tasks as completed.
- Delete tasks.

## How to Run

1.  **Clone the repository (or create the files manually):**
    ```bash
    git clone <repository-url>
    cd kotlin-task-manager
    ```

2.  **Build the project:**
    ```bash
    ./gradlew build
    ```

3.  **Run the application:**
    ```bash
    ./gradlew run
    ```
    or, to run the built JAR:
    ```bash
    java -jar build/libs/kotlin-task-manager-1.0-SNAPSHOT.jar
    ```

## Project Structure

```
.
├── build.gradle.kts
├── settings.gradle.kts
├── src/
│   └── main/
│       └── kotlin/
│           └── com/
│               └── taskmanager/
│                   ├── App.kt
│                   ├── Task.kt
│                   └── TaskManager.kt
├── .gitignore
└── README.md
```