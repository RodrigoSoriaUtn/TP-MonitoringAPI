# TP-MonitoringAPI
Detects, inform, and store information about the browser and the OS of who enters to the web page

## Teory:

## [Maven](https://maven.apache.org/what-is-maven.html)

  * ### Goals: 


    * mvn clean: Validates that the project is correct and all the necessary information is available.
    
    * mvn compile: Compiles the source code of the project. Also doing a *mvn clean*.
    
    * mvn package: Takes the compiled code and package it in its *distributable format*, for example, a .jar. After doing a mvn test.
    
    * mvn install: Install the package in to the local repository, making it ready for use in other projects locally.


 * ### Scopes: 
 
    * compile: Default scope. It determines that the *compile dependencies* are available in all classpaths of a project. Is fully transitive, so those dependencies are propagated to dependent projects.
     
    * provided: Is like the compile scope, but needs to be specified into the JDK or a container to provide the dependencies at *runtime*. Is only available on the compilation and test classpaths and is not transitive.
    
    * runtime: This scope indicates that the dependency is not required for compilation, but is required for the execution. It is on the runtime and test classpaths.
    
    * test: This scope indicates that the dependency is only available for the test compilation and execution phases. Is not transitive.
    
    * system: This scope is like the provided scope but it requires the JAR wich contains it explicity, is always available and is not looked up in a repository.
    
    * import: (only in maven 2.0) is only supported on a dependency of type pom in the <dependencyManagement> section. The dependencies in this scope doesn't participate in limiting the transitivity of a dependency.
    

    

 * ### Archetype





 * ### Basic structure of a maven project






 * ### Differences between *Archetype* and *Artifact*




  
## [Spring](https://spring.io/)

  * **@Component**
  ```
  ```
  * **@Repository**
  ```
  ```
  * **@Service**
  ```
  ```
  * **@Controller**
  ```
  ```
  
## [Rest](https://en.wikipedia.org/wiki/Representational_state_transfer)

