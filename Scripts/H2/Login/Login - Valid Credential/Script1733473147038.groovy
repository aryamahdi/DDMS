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

'Open Browser'
WebUI.openBrowser('')

'Maximize Window Browser'
WebUI.maximizeWindow()

'Navigate To DDMS H2'
WebUI.navigateToUrl(GlobalVariable.URL_H2)

'Verify \'Sign in - DDMS\' Label is Present'
WebUI.verifyElementPresent(findTestObject('H2/Login/label_Sign in - DDMS'), 10)

'Enter Username'
WebUI.setText(findTestObject('Object Repository/H2/Login/input_Sign in - DDMS_username'), GlobalVariable.Username)

'Enter Password'
WebUI.setText(findTestObject('Object Repository/H2/Login/input_Sign in - DDMS_password'), GlobalVariable.Password)

'Click \'Sign in\' Button'
WebUI.click(findTestObject('Object Repository/H2/Login/button_Sign in'))

'Verify \'Lokasi Service\' Label is Present'
WebUI.verifyElementPresent(findTestObject('H2/Login/label_Lokasi Service'), 10)

'Select Location from Dropdown'
WebUI.selectOptionByValue(findTestObject('Object Repository/H2/Login/select_Pilih Lokasi Service'), Lokasi, true)

'Click \'Confirm\' Button'
WebUI.click(findTestObject('Object Repository/H2/Login/button_Confirm'))

'Verify Redirect Message Popup Appears'
WebUI.verifyElementPresent(findTestObject('H2/Login/popup_Redirect Message'), 10)

'Click \'Yes\' on Redirect Message'
WebUI.click(findTestObject('Object Repository/H2/Login/button_Ya Redirect Message'))

'Verify \'DDMS\' Label is Present on Dashboard'
WebUI.verifyElementPresent(findTestObject('H2/Dashboard/label_DDMS'), 10)

