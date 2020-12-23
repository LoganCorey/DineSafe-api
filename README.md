# DineSafe API

DineSafe is an open data initiative provided by the city of Toronto.  This initiative made public information on the safety of establishments in regards to inspections that are done, any fines incurred or any issues that arose during an inspection.



The current way to access this data is via navigating to http://opendata.toronto.ca/public.health/dinesafe/dinesafe.zip, unzipping the data and scanning an xml file.  I wanted to take this process and create an API that any could access; having more ways and easier ways to access this important information can lead to further develop in the way Toronto can be made aware of the locations that they are eating at.



## How To Use

###### BASE API Route:

 https://api-dinesafe.herokuapp.com/establishment/

###### Search By Establishment Id

 https://api-dinesafe.herokuapp.com/establishment/{id}

example:  https://api-dinesafe.herokuapp.com/establishment/10

###### Search

 https://api-dinesafe.herokuapp.com/establishment/search?query=

To learn more about searching please view  the web page available here https://logancorey.github.io/DineSafe-api/



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

1. Clone  the repo
2. run the command `mvn install`
3. run the command `rake diensafe:fetch && rake dinesafe:extract && rake dinesafe:create`
4. run the command `spring-boot:run`
5. Your API will now be available at http://localhost:8080/establishment 

### Testing

The Dinesafe API has a few simple tests already made for it testing basic features such as searching and getting establishments.  To run these tests run the command `mvn test` 



## Future Considerations

Being a bit more forward thinking it would be a good idea to implement the following

- Expanding on the searching features with more operators allowing for more complex queries
- Implement some kind of API throttling if there are a lot of calls