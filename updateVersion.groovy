// updateVersion.groovy

import groovy.json.JsonSlurper

// Define paths
def testJsonFilePath = "C:/Users/SONY/Desktop/JSM-reader/VersionUpdation/test.json"
def releasePropertiesFilePath = "C:/Users/SONY/Desktop/JSM-reader/releaseProperties"

// Read test.json content
def testJsonContent = new File(testJsonFilePath).text
def json = new JsonSlurper().parseText(testJsonContent)

// Extract old and new version numbers
def oldVersion = json.version
def newVersion = "1.7.47" // New version to update

// Create or update releaseProperties file with new version
def releasePropertiesContent = "version=${newVersion}"
new File(releasePropertiesFilePath).text = releasePropertiesContent

println "Version number updated successfully to ${newVersion}."

