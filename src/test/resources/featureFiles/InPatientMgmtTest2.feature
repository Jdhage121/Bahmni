Feature: InPatient Module functionality for admitting, transferring and discharging the patients

Background:
Given user launches Bahmni application and logs on successfully onto patient queue page
    #And user clicks on InPatient app on the home page


Scenario:To validate that user can admit or transfer or discharge a patient successfully
When user clicks on queuepagetab and selects action for the patient id pid
 #  |queuepagetab|action|pid|
|All|Admit|GAN203024|
|WardList|TransferSame|GAN203021|
|WardList|TransferDiff|GAN203023|
|All|TransferDiff|GAN203015|
|All|TransferSame|GAN203015|
|Admitted|TransferSame|GAN203021|
Then patient should be successfully disposed as required

@Smoke
Scenario:To validate that user cannot assign more than two patients the same day and cannot assign same bed twice to the same patient
When user clicks on queuepagetab and selects action for the patient id pid
     #  |queuepagetab|action|pid|
|Admitted|TransferDuplicate|GAN203021|
    # data below is for two scenarios
         # 1. ward list and admitted tabs should not have option of admit patient on patient movement page
     # 2.If two patients are assigned to one bed, user should not be allowed to assign one more patient to the same bed
|Admitted|TransferNotIfMoreThanTwo|GAN203021|
Then patient should be successfully disposed as required
