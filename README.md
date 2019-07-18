# RESTandSpring
REST app with Spring
# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Spring Tools plugin
 * install Spring tools X from Eclipse marketplace
 
All the GA/Release artifacts are published to Maven Central, so if only releases are needed, there is no need to add any new repo into the pom. There is however a custom, browsable Maven repository available for Spring Releases as well, if for some reason Central is not available:

<repositories>
    <repository> 
        <id>repository.spring.release</id> 
        <name>Spring GA Repository</name> 
        <url>http://repo.spring.io/release</url> 
    </repository>
</repositories>

For Milestones and RCs, the following repo needs to be added to the pom:
<repositories>
    <repository> 
        <id>repository.spring.milestone</id> 
        <name>Spring Milestone Repository</name> 
        <url>http://repo.spring.io/milestone</url> 
    </repository>
</repositories>

Similar to milestones, Spring Snapshots are hosted in a custom repository:
<repositories>
    <repository> 
        <id>repository.spring.snapshot</id> 
        <name>Spring Snapshot Repository</name> 
        <url>http://repo.spring.io/snapshot</url> 
    </repository>
</repositories>

Spring Developer Tools
https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-devtools.html
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-devtools</artifactId>
		<optional>true</optional>
	</dependency>
provide additional development-time features, automatically restart the app when the code is updated

@Autowired - inject annotated field
@Bean - annotated methods creates beans from third party classes, with default bean equal to the name of the annotated method
@Component (also called Beans) - components to inject
@Component("componentName") -if name is not provided , component name is the same as class name written in camel case
@Conditional - another way to include/exclude beans apart from @Profile, based on conditions you provide
@ConditionalOnClass
@ConditionalOnProperty
@ConditionalOnMissingBean
@Configuration - class annotated with this annotation is used to create beans from some third party classes
@Inject - for injecting, but @Autowired is little bit more powerful
@Primary - in case of multiple beans, bean annotated with @Primary is injected
@Profile("profileName") - for which profile to start this bean
@Qualifier(qualifierName) - qualifies what bean to inject
@RequestMapping - request url mapping handled by controller
@Resource -for injecting, but @Autowired is little bit more powerful
@RestController - controller, controls the ULRs, combines @Controller and @ResponseBody, two annotations that results in
		web requests returning data rather than view(MVC)
@SpringBootApplication - package containing @SpringBootApplication class and all sub packages are scanned for classes to add in 
		"Application context" 
		- combines @Configuration - tags the class as a source of bean definitions for the application context
		- @EnabeAutiConfiguration - tells Spring Boot to start adding beans based on classpath settings, other beans and various 
					property settings
		- @ComponentScan - tells Spring to look for other components, configurations and services in the package, allowing it to
					find controllers 
@SpringBootApplication(scanBasePackageClasses = {SomeClcass.class}) - package containing SomaClass.class and all the sub packages are
		scanned for classes to add in "Application context", you can specify a list of classes