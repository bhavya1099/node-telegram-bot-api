 # Karate Feature File Execution Guide

This guide explains how to execute Karate feature files. We will use the Karate JAR file to directly run feature files via the command line.

## Prerequisites

1. **Karate JAR File**: Obtain the 'karate.jar' file from the appropriate source.

2. **Feature File**: Ensure you have a valid Karate '.feature' file to execute.

3. **Configuration Directory**: Optional — if you have custom configurations, you can specify the directory where your 'karate-config.js' file exists.

## Command Syntax

Use the following command to execute a Karate feature file:


java -Dkarate.config.dir=<config-dir> -jar <karate_jar_filepaht> <feature_filepath>


### Parameters
- **<config-dir>**: (Optional) Path to the directory containing the karate-config.js file. If not provided, Karate will use the default configuration.
- **<karate_jar_filepath>**: Path to the Karate JAR file.
- **<feature_filepath>**: Path to the Karate .feature file you want to run.

## Example Usage

Here is an example to illustrate:

1. Suppose:
   - Your Karate JAR file is at /var/tmp/Roost/bin/karate-1.5.1.jar.
   - Your feature file is located at /var/tmp/Roost/RoostGPT/karate-test/1752577743/source/node-telegram-bot-api/karate-tests/Country/country_id_delete/country_id_delete.feature.
   - Your 'karate-config.js' configuration file is in 'karate-tests/config'.

2. Run the feature file using the following command:


java -Dkarate.config.dir=karate-tests/config -jar /var/tmp/Roost/bin/karate-1.5.1.jar /var/tmp/Roost/RoostGPT/karate-test/1752577743/source/node-telegram-bot-api/karate-tests/Country/country_id_delete/country_id_delete.feature

## Output

Upon successful execution, Karate will output the test results in the console or terminal. If any reports are generated, they will be located in the default Karate output directory unless overridden in your project configuration.

## Troubleshooting
- **Incorrect JAR or feature file path**: Double-check the file paths in your command.
- **Missing karate-config.js**: Ensure your configuration file is placed in the correct directory if specified.

## Notes
- Ensure your feature file is syntactically correct to avoid runtime errors.