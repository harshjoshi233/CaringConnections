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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://caring-connections-qa.azurewebsites.net/')

WebUI.setText(findTestObject('Object Repository/Senior_Logout/Page_CaringConnections-v-1.17/input_username'), 'harshjo2344@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Senior_Logout/Page_CaringConnections-v-1.17/input_password'), 
    'QmrIyMB454Sq0s0w1zzgnQ==')

WebUI.click(findTestObject('Object Repository/Senior_Logout/Page_CaringConnections-v-1.17/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('Senior_Logout/Page_CaringConnections-v-1.17/img'), 0)

WebUI.click(findTestObject('Object Repository/Senior_Logout/Page_CaringConnections-v-1.17/img'))

WebUI.closeBrowser()

