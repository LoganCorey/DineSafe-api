import unittest
from DineSafeApi.DineSafeApi import DineSafeApi, EstablishmentNotFoundException
from DineSafeApi.Establishment import Establishment
import os 
API =  DineSafeApi()

class TestDineSafeMethods(unittest.TestCase):

    def testDownload(self):
        """
        Tests if the zip file is downloaded correctly
        """
        # if the file exists delete it
        zipExists = os.path.isfile(os.path.dirname(os.path.abspath(__file__)) + '/DineSafeApi/dinesafe.zip')
        pathToZip = os.path.dirname(os.path.abspath(__file__)) + '/DineSafeApi/dinesafe.zip'
        if  zipExists:
            os.remove(pathToZip)

        API._downloadDineSafeZip()

        self.assertTrue(zipExists)
    
    def testXMLExtraction(self):
         # if the file exists delete it
        xmlExists = os.path.isfile(os.path.dirname(os.path.abspath(__file__)) + '/DineSafeApi/dinesafe.xml')
        pathToXML = os.path.dirname(os.path.abspath(__file__)) + '/DineSafeApi/dinesafe.xml'

        if xmlExists:
            os.remove(pathToXML)

        API._extractXML()
        self.assertTrue(xmlExists)
    
if __name__ == '__main__':
   unittest.main()
    