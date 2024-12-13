# Appium Automation Project - Igor Fainshtein

This project demonstrates a basic automation framework using **Appium** and the **Page Object Model (POM)** design pattern for testing Android applications. The project is structured to promote modularity, readability, and reusability.

Additionally, a non-POM test class can be found in the 'tests'-> `WITHOUT.POM` package for reference.

## Features

- Uses **TestNG** for test management.
- Implements the **Page Object Model (POM)** design pattern.
- Provides reusable actions through `ActionsHelper`.
- Includes a logging utility for timestamped messages.

## Prerequisites

1. **Java**
   - Ensure Java 21 is installed .
2. **Android SDK**
   - Install and configure the Android SDK. Ensure the `ANDROID_HOME` environment variable is set.
3. **Appium**
   - Install Appium server (v2.x recommended).
4. **Dependencies**
   - Add the required dependencies in your `pom.xml` (if using Maven):

```xml
<dependencies>
    <dependency>
        <groupId>io.appium</groupId>
        <artifactId>java-client</artifactId>
        <version>9.3.0</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.10.2</version>
    </dependency>
</dependencies>
```

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/appium-automation-project.git
   cd appium-automation-project
   ```

2. Open the project in your favorite IDE (e.g., IntelliJ IDEA).

3. Run the Appium server:
   ```bash
   appium
   ```

4. Execute the tests:
   - From the IDE: Run `BatteryTest.java` as a TestNG test.
   - From the command line (if using Maven):
     ```bash
     mvn test
     ```

## Test Description

### `BatteryTest`
This test verifies the following:
1. Navigates to the **Battery** settings in the Android device.
2. Reads and verifies the battery percentage.
3. Toggles the "Show battery percentage in status bar" setting.






## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

