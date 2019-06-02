# DineSafe Python API
[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)
DineSafe is Toronto's Public Health's food and safety program.  This group has released information pertrianing to the health status of each establishment in Toronto.  This module allows users to access the data via python instead of having hte visit DineSafe website (https://www.toronto.ca/health/dinesafe/index.htm)

### Installation

Currently you need to move the DineSafeApi folder into your project and import the classes as seen in the main.py example

```python
from DineSafeApi.DineSafeApi import DineSafeApi, EstablishmentNotFoundException
from DineSafeApi.Establishment import Establishment
```

### Usage
I tried to keep the api as simple as possible and the basic usage is as follows (after the classes have been imported)
```python
    api = DineSafeApi()
	api.updateXML()
	resturant = api.search("resturant name")
```
If the resutrnat name is in the XML file then you are free to access any attributes present in the XML file.  This is because the search function returns an Establishment class which just has the resturants information in a class.  If the resturant is not found then an EstablishmentNotFoundException is thrown.


License
----

GNU

**All features of XML still need to be added to Establishment class, setup.py also needs to be added**

