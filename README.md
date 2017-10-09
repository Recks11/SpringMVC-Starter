<h3 align="center">SpringMVC Starter</h3>
<p> A Spring starter project with XML based configuration to get you upp and running for a small to medium scale spring application</p>

## Dependencies included (Some in comments) 
- Hibernate
- Spring security
- Jackson
- Mail sender
- GZip for web compression
<p> Dependencies can be changed as you like update to current version if you like</p>

## How to setup on Intellij Idea
- Clone the repo: `git clone https://github.com/Recks11/SpringMVC-Starter.git` or download it
- Import Intellij Idea and enable auto import when asked. if you are not asked go to `Preferences > Build, execution, deployment > Build Tools > Maven > Importing ` and tick `Import maven projects automatically`
- In the `POM.xml` file change the spring version to the version you want to use this repo uses the 4.3.10.RELEASE
- In Intellij IDEA go to `File > Project Structure > Facets` and change the `web resource directory` to the location of the `web.xml` file which is
`src/main/webapp`
- In `File > Project Structure > artifacts` select all available artifacts and add to lib or just double click them one at a time
- Create a new run configuration from `run > Edit configurations` click the `+` and select `Tomcat > local` if you have tomcat installed select tomcat home (where its installed or extracted to) in the before lunch section you'll see an error click fix to select the artifact to use for deployment
- Press apply then press OK and now run the application. you should immediately land in the 'IT WORKS page'.
- Happy development

## How to setup on eclipse
<p>Coming soon...</P>

## Project Structure
<p>This is the overall project structure</p>

```
SpringMVC Starter/
├── src/
│   ├── main/
│   │   └── com/
│   │       └── name/
│   │           ├── controllers/
│   │           │   └── indexController.java
│   │           └── data/
│   │                 ├── model/
│   │                 │   └── user.java
│   │                 ├── repository
│   │                 └── services
│   │
│   ├── resources/
│   │   ├── hibernate.properties
│   │   ├── jdbc.properties
│   │   └── log4j.properties
│   │
│   ├── webapp/
│   │   ├── resources/
│   │   │   ├── css/
│   │   │   ├── js/
│   │   │   └── media/
│   │   │
│   │   └── WEB-INF/
│   │       ├── spring/
│   │       │   ├── applicationContext.xml
│   │       │   └── dispatcher-servlet.xml
│   │       ├── views/
│   │       │   └── index.jsp
│   │       └── web.xml
│   │
│   └── test/
│       └── java/
│   
└── pom.xml
```