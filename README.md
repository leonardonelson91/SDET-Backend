# NASA's Open API Java Testing Framework

## Requisites
* Java 8+
* NASA Public API Key (To generate a key, please go to https://api.nasa.gov/index.html#getting-started)

## Instructions

Before running the tests, please make sure to set the environment variable **API_KEY** with your API key generated from NASA's API website:

* In a Windows environment, run the following command: ```set API_KEY=<YOUR_API_KEY>```
* In a unix environment, the API_KEY can be set along with the running command as described in the next step.

## Running the Tests

In a terminal window, run the following command:

Windows:```gradlew test ```

Unix: ```API_KEY=<YOUR_API_KEY> ./gradlew test```

## API's Used

* Mars Rover Photos

## Scenarios Covered

1. Retrieve the Mars photos made by "Curiosity" on 1000 Martian sol.
2. Retrieve the Mars photos made by "Curiosity" on Earth date equal to 1000 Martian sol.
3. Retrieve and compare the Mars photos made by "Curiosity" on 1000 sol and on Earth date equal to 1000 Martian sol.
4. Validate that the amounts of pictures that each "Curiosity" camera took on 1000 Mars sol is not greater than 10 times the amount taken by other cameras on the same date.

## Checking the Results

The results are registered in an HTML Report after the test execution at the following path: ```app/build/reports/tests/test/index.html```


