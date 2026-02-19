# Memora UI Test (Maven) Project
Check existing maven on your macine before creating your project.
```bash
mvn --version
```

Execute the folloving command on your terminal to create an empty Memora UI Test (Maven) Project.
```bash
mvn archetype:generate -DgroupId=dev.memora -DartifactId=memora-ui-test -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false
```

To run specific file, use the following command:
```bash
mvn -Dtest=YourTestFileName test
```

To run specific test method within a test file, use the following command:
```bash
mvn -Dtest=YourTestFileName#yourTestMethodName test
```