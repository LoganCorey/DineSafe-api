import xml.etree.ElementTree as ET
import os
import  urllib.request
from zipfile import ZipFile


class EstablishmentNotFoundException(Exception):
    """
    Exception is thrown when a search fails to find the establishment in the
        dinesafe.xml file
    """

class DineSafeApi:

    def __init__(self):
        self.dineSafeFileLink = os.path.dirname(os.path.abspath(__file__))
    
    def _downloadDineSafeZip(self):
        """
        downloads a zip containing the dinesafe xml file
        """
        url = "http://opendata.toronto.ca/public.health/dinesafe/dinesafe.zip"
        request = urllib.request.urlretrieve(url, self.dineSafeFileLink + "/dinesafe.zip")
        return request
    
    def _extractXML(self):
        """ str -> None
        Extracts the xml file from the dinsafe.zip file
        """
        with ZipFile(self.dineSafeFileLink + "/dinesafe.zip") as zip:
            zip.extract("dinesafe.xml", self.dineSafeFileLink)
    
    def updateXML(self):
        """
        Updates the dinesafe XML file in a given directory
        """
        self._downloadDineSafeZip()
        self._extractXML()

    def search(self, resturantName):
        """
        Performs a search on the dinesafe.xml file for the resturant name
        """
        tree = ET.parse(self.dineSafeFileLink + "/dinesafe.xml")
        root = tree.getroot()

        for establishmentRow in root:
            establishmentName = establishmentRow.find('ESTABLISHMENT_NAME').text

            if establishmentName == resturantName:
                return establishmentRow
        raise EstablishmentNotFoundException("Could not find establishment {}".format(resturantName))


