# README - kotlin task for job placement

## Project Overview
This is a Kotlin-based Android application developed as a technical task for DevSky Software House. It showcases advanced features such as a never-ending service, canvas drawing, and displaying overlays over other apps. This application is designed for educational and demonstration purposes to illustrate the implementation of these features in a real-world Android application.

## Features
1. **Never Ending Service (`CounterService`):** A foreground service that continuously runs in the background, incrementing a counter. It uses a wake lock to ensure the service keeps running even when the device is idle.
![service](https://github.com/Hasnain17/DevSkyTasks/assets/62245237/d9f1e140-8780-4ead-8967-a338d56a0916)

2. **Canvas Drawing (`CanvasActivity`):** An interactive canvas that allows users to draw with different shapes and colors. This feature demonstrates the use of custom views and handling touch events in Android.
![canvas](https://github.com/Hasnain17/DevSkyTasks/assets/62245237/83decb73-fdf7-4504-8072-6b13783e49dc)

3. **Display Over Other Apps (`Window` class):** The app can display custom overlays on top of other applications. It showcases the use of `WindowManager` for creating floating windows and managing their layout and visibility.
![diplay](https://github.com/Hasnain17/DevSkyTasks/assets/62245237/f70f62e0-8922-4d62-837f-1d2d6a22e2d9)

## Key Concepts
- **Foreground Service:** Ensures that the service continues to run without being killed by the system for resource optimization.

- **Wake Locks:** Prevents the phone from going into a deep sleep state, ensuring the service runs continuously.

- **Custom Views and Canvas:** Demonstrates drawing on a canvas, handling touch events, and creating custom interactive UI components.

- **Android Permissions:** Implementing and handling permissions like `SYSTEM_ALERT_WINDOW` for displaying content over other apps.

- **Window Management:** Using `WindowManager` to add, update, or remove custom views on the screen.

- **Android ViewModel:** Demonstrates the use of ViewModel for managing UI-related data in a lifecycle-conscious way.

- **LiveData:** Used for observing changes in data and updating the UI accordingly.

- **Coroutines:** Utilized for performing asynchronous tasks efficiently.

- **Android WorkManager:** Manages and schedules background tasks that need to run in a certain order or conditions.

- **Notifications:** Used for keeping the user informed when the app runs in the background.

## Setup and Installation
1. Clone the repository.
2. Open the project in Android Studio.
3. Ensure all dependencies are properly synced.
4. Run the application on an emulator or physical device.

## Permissions
The app requires the following permissions:
- `SYSTEM_ALERT_WINDOW`: To display overlays over other applications.
- `WAKE_LOCK`: To prevent the phone from sleeping when running the never-ending service.

## Running the Application
1. Start the main activity (`MainActivity`).
2. Use the buttons to navigate between different features.
3. Grant necessary permissions when prompted.

## Contributing
Contributions to enhance features or fix bugs are welcome. Please follow the standard pull request process.



**Note:** This README provides a basic overview of the project. Detailed documentation of each class and method is available within the code comments. This project was created for technical task for DevSky Software House.
