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