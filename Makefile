all:
	@echo "Cleaning all Maven and Gradle projects..."
	@find . -name "pom.xml" -execdir mvn clean \;
	@find . -name "build.gradle" -execdir gradle clean \;

.PHONY: all
