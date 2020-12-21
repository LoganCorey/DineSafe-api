# DineSafe API

DineSafe is an open data initiative provided by the city of Toronto.  This initiative made public information on the safety of establishments in regards to inspections that are done, any fines incurred or any issues that arose during an inspection.



The current way to access this data is via navigating to http://opendata.toronto.ca/public.health/dinesafe/dinesafe.zip, unzipping the data and scanning an xml file.  I wanted to take this process and create an API that any could access; having more ways and easier ways to access this important information can lead to further develop in the way Toronto can be made aware of the locations that they are eating at.




## Getting Started



### Prerequisites

- JRE 1.8
  - https://www.oracle.com/ca-en/java/technologies/javase-jre8-downloads.html
- Maven v3.6.3
  - https://maven.apache.org/
- Ruby v2.7.2p137
  - https://www.ruby-lang.org/en/
- Sqlite3
  - https://www.sqlite.org/index.html

### Installation
Run the command `mvn install` and rake diensafe:fetch && rake dinesafe:extract && rake dinesafe:create


### Testing

In order to test the api run the command `mvn test` 