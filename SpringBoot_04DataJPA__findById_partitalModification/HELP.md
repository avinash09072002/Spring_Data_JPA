# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.5/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.5/maven-plugin/build-image.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.3.5/reference/data/sql.html#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.




# Understanding @Autowired in Spring

When you use `@Autowired` on `private I_ArtistRepository artistRepository`, Spring's Dependency Injection mechanism takes care of instantiating and injecting the implementation of the `I_ArtistRepository` interface into the `artistRepository` variable. Here’s what happens behind the scenes:

### 1. Spring Container Scans for Beans
During the application startup, Spring scans your classpath for components annotated with `@Repository`, `@Service`, `@Component`, etc. The `I_ArtistRepository` interface is identified as a Spring Data repository.

### 2. Spring Data JPA Creates an Implementation
Spring Data JPA dynamically creates a concrete implementation of `I_ArtistRepository` at runtime. This implementation includes the methods defined by `CrudRepository` (such as `save`, `findAll`, `findById`, etc.).

### 3. Dependency Injection
When the `@Autowired` annotation is used, Spring checks the application context for a suitable bean of type `I_ArtistRepository`. It finds the auto-generated implementation and injects it into the `artistRepository` field.

### 4. Repository Functionality
Once injected, the `artistRepository` object has all the CRUD capabilities provided by `CrudRepository`. When `artistRepository.save(artist)` is called, the auto-generated implementation takes the `artist` object and performs the necessary logic to insert or update the record in the database.

### 5. Transaction Management
If transaction management is configured, Spring also ensures that the method runs within a transaction to maintain data consistency.

---

Overall, Spring handles all the creation, injection, and wiring so you can focus on calling the methods directly without worrying about the implementation details.
