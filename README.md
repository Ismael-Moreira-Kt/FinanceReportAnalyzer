<h1 align="center">FinanceReportAnalyzer</h1>
<p>FinanceReportAnalyzer is a Java application that uses Selenium to extract financial data from finance.yahoo.com. The application collects information and saves it in an Excel spreadsheet for future analysis and consultation.</p>


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


<h2 id="overview">Overview</h2>
<p>FinanceReportAnalyzer was developed to automate the collection and analysis of financial data. It is able to:</p>

<ul>
    <li><b>Extract Data:</b> Collect financial information such as stock name, price, change and percentage change from a web page.</li>
    <li><b>Process Data:</b> Filter and prepare data for reports.</li>
    <li><b>Generate Reports:</b> Create a report in Excel format with the data collected.</li>
</ul>


<h2 id="features">Features</h2>
<ul>
    <li><b>Data Extraction:</b> Uses Selenium WebDriver to browse and extract information from the Yahoo Finance page.</li>
    <li><b>Report generation:</b> Creates and updates an Excel spreadsheet with the extracted data.</li>
    <li><b>Logging:</b> Uses Log4j to record operations and any errors during execution.</li>
</ul>