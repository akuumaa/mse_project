# On Mind

On Mind is a modular productivity application for personal organization and activity tracking. It follows a local-first approach and allows users to customize their experience through optional modules.

Developed as part of the Mobile Software Engineering course at Technische Hochschule Mittelhessen (THM), Winter Semester 2026/27.

## Tech Stack

- Kotlin Multiplatform: Shared application logic for Android and Web
- Compose Multiplatform: Cross-platform user interface
- Room / SQLite: Local data persistence on Android)
- Go / PostgreSQL: Backend and synchronization

## Project Structure

- ``androidApp/``: Android application entry point
- ``shared/``: Shared UI and business logic
- ``webApp/``: Web application entry point

## Getting Started 

Open the project in Android Studio and let Gradle synchronize.

**Android build:**

````bash
./gradlew :androidApp:assembleDebug
````


**Web (Wasm):**

````bash
./gradlew :webApp:wasmJsBrowserDevelopmentRun
````


On Windows, use .\gradlew.bat instead of ./gradlew.

### Running tests

Use the run button in your IDE's editor gutter, or run tests using Gradle tasks:

- Android tests: `./gradlew :shared:testAndroidHostTest`
- Web tests:
  - Wasm target: `./gradlew :shared:wasmJsTest`
  - JS target: `./gradlew :shared:jsTest`

---

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html),
[Compose Multiplatform](https://kotlinlang.org/compose-multiplatform/),
[Kotlin/Wasm](https://kotl.in/wasm/)…

We would appreciate your feedback on Compose/Web and Kotlin/Wasm in the public Slack channel [#compose-web](https://slack-chats.kotlinlang.org/c/compose-web).
If you face any issues, please report them on [YouTrack](https://youtrack.jetbrains.com/newIssue?project=CMP).