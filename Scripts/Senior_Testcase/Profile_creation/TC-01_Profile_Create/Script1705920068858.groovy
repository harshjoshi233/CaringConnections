import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://caring-connections-qa.azurewebsites.net/')

WebUI.click(findTestObject('profile/Page_CaringConnections-v-1.17/button_Sign Up'))

//enter first name and last name
WebUI.setText(findTestObject('profile/Page_CaringConnections-v-1.17/input__name'), 'Palak')

//enter zip code
WebUI.setText(findTestObject('profile/Page_CaringConnections-v-1.17/input__zipcode'), '414141')

//enter emailID
WebUI.setText(findTestObject('profile/Page_CaringConnections-v-1.17/input__username'), 'palak223@gmail.com')

//enter password
WebUI.setText(findTestObject('profile/Page_CaringConnections-v-1.17/input__password'), 'Test@123')

//select role
WebUI.click(findTestObject('profile/Page_CaringConnections-v-1.17/input__role'))

WebUI.verifyElementPresent(findTestObject('Creation_Profile_Senior/Profile_Creation_Page_Objects/Text_Expectations_From_Companion'), 
    0)

//Verify Text "Select the Button of your choice"
WebUI.verifyElementPresent(findTestObject('Creation_Profile_Senior/Profile_Creation_Page_Objects/Text_Select the button of your choice to create your profile'), 
    0)

//Verify Text "We are exicted"
WebUI.verifyElementPresent(findTestObject('Creation_Profile_Senior/Profile_Creation_Page_Objects/Text_We are excited'), 
    0)

//Click on I want to type button
WebUI.waitForElementClickable(findTestObject('Creation_Profile_Senior/Profile_Creation_Page_Objects/btn_I_Want_To_Type'), 
    65)

//click on I wnt to type button
WebUI.click(findTestObject('Creation_Profile_Senior/Profile_Creation_Page_Objects/btn_I_Want_To_Type'))

//enter you profie info
WebUI.setText(findTestObject('Creation_Profile_Senior/Profile_Creation_Page_Objects/Input_I_Want_To_Type'), 'Greetings, I\'m Palak, a seasoned explorer in the journey of life, joyfully celebrating my 58 years of existence. With a background in environmental science, I dedicated decades to understanding and preserving the natural world. Beyond scientific pursuits, I find solace in the rhythm of pottery, shaping clay into intricate forms, and the therapeutic art of cooking. In a companion, I seek someone who shares my passion for environmental conservation and has an appreciation for the creative blend of artistry and sustainable living. Health-wise, I\'ve faced challenges with asthma, but with careful management and regular breathing exercises, I continue to pursue my passions with vigor. Life has been a captivating adventure, and I look forward to molding new experiences with a like-minded soul who appreciates the beauty of nature and the creativity of the human spirit.')

