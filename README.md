<h1 align="center">FinanceReportAnalyzer</h1>
<p>FinanceReportAnalyzer is a Java application that uses Selenium to extract financial data from finance.yahoo.com. The application collects information and saves it in an Excel spreadsheet for future analysis and consultation.</p>

<br><br>

<h2>Contents</h2>
<p align="center">
    <a href="#overview"> Overview </a> |
    <a href="#features"> Features </a> |
    <a href="#prerequisites"> Prerequisites </a> |
    <a href="#installation"> Installation and Configuration </a> |
    <a href="#usage"> Usage </a> |
    <a href="#structure"> Project Structure </a> |
    <a href="#license"> License </a>
</p>

<br><br>

<h2 id="overview">Overview</h2>
<p>FinanceReportAnalyzer was developed to automate the collection and analysis of financial data. It is able to:</p>

<ul>
    <li><b>Extract Data:</b> Collect financial information such as stock name, price, change and percentage change from a web page.</li>
    <li><b>Process Data:</b> Filter and prepare data for reports.</li>
    <li><b>Generate Reports:</b> Create a report in Excel format with the data collected.</li>
</ul>

<br><br>

<h2 id="features">Features</h2>
<ul>
    <li><b>Data Extraction:</b> Uses Selenium WebDriver to browse and extract information from the Yahoo Finance page.</li>
    <li><b>Report generation:</b> Creates and updates an Excel spreadsheet with the extracted data.</li>
    <li><b>Logging:</b> Uses Log4j to record operations and any errors during execution.</li>
</ul>

<br><br>

<h2 id="prerequisites">Prerequisites</h2>
<p>Before running the project, you will need:</p>
<ul>
    <li>Java Development Kit (JDK) 17 or higher</li>
    <li>Apache Maven for managing dependencies and building the project</li>
    <li>ChromeDriver for automation with Selenium</li>
    <li>Internet to access the Yahoo Finance website</li>
</ul>

<br><br>

<h2 id="installation">Installation and Configuration</h2>
<ol>
    <li><b>Clone the Repository:</b></li>

```bash
    git clone https://github.com/Ismael-Moreira-Kt/FinanceReportAnalyzer
    cd FinanceReportAnalyzer
```

<li><b>Configure ChromeDriver:</b></li>
<p>Download the ChromeDriver compatible with your browser version and place it in an accessible directory. Update the path to the ChromeDriver in the DataExtractorService class:</p>

```java
    public static final String CHROME_DRIVER_PATH = "/path/to/chromedriver";
```

<li><b>Compile and Run the Project:</b></li>
<p>Compile the project using Maven:</p>

```bash
    mvn clean package
```

<p>Run the application:</p>

```bash
    cd FinanceReportAnalyzer/target
    java -jar FinanceReportAnalyzer-1.0-SNAPSHOT.jar
```

</ol>

<br><br>

<h2 id="usage">Usage</h2>
<p>When you run the application, it will perform the following actions:</p>
<ul>
    <li><b>Data Extraction:</b> It will collect financial data from the configured URL.</li>
    <li><b>Data Processing:</b> Filters and prepares the data.</li>
    <li><b>Report Generation:</b> It will create or update an Excel spreadsheet with the extracted data.</li>
</ul>
<p>The execution logs will be recorded in the logs directory specified in the Log4j configuration.</p>

<br><br>

<h2 id="structure">Project structure</h2>
<p>The project is organized as follows:</p>
<ul>
    <li><b>src/main/java/com/fra/ -</b> Contains the application source code.</li>
    <ul>
        <li><b>App.java -</b> Main class that executes the workflow.</li>
        <li><b>service/ -</b> Contains services for extracting, processing, generating reports and manipulating dates.</li>
        <li><b>util/ -</b> Contains utilities, such as the logger configuration.</li>
        <li><b>model/ -</b> Contains the Report model class.</li>
    </ul>
    <li><b>src/main/resources/ -</b> Contains configuration files, such as log4j.properties.</li>
    <li><b>pom.xml -</b> Maven configuration file, including dependencies and plugins.</li>
</ul>

<br><br>


<h2 id="license">License</h2>
<p>This project is licensed under the <a href="./LICENSE">MIT License</a>.</p>