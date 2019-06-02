
class Establishment:
    def __init__(self, DineSafeXMLRow):
        self.name = DineSafeXMLRow.find('ESTABLISHMENT_NAME').text
        self.foodType = DineSafeXMLRow.find('ESTABLISHMENTTYPE').text
        self.inspectionDate = DineSafeXMLRow.find('INSPECTION_DATE').text
        self.infractionDetails = DineSafeXMLRow.find('INFRACTION_DETAILS').text

    def getName(self):
        return self.name

    def getInspectionDate(self):
        return self.inspectionDate

    def getInfractionDetails(self):
        return self.infractionDetails

    def __str__(self):
        string = "Resturant: {}, foodType: {}, infractionDetails: {}".format(self.name, self.foodType, self.infractionDetails)
        return string
