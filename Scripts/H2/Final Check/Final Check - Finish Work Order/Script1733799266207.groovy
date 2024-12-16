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

WebUI.click(findTestObject('H2/Dashboard/ddl_Work Order'))

WebUI.click(findTestObject('H2/Dashboard/link_Final Check'))

WebUI.click(findTestObject('H2/Final Check/button_Refresh'))

WebUI.setText(findTestObject('H2/Final Check/input_Cari No Polisi'), NoPolisi)

WebUI.click(findTestObject('H2/Final Check/button_Cari'))

WebUI.click(findTestObject('H2/Final Check/button_Finish'))

WebUI.verifyElementPresent(findTestObject('H2/Final Check/popup_Apakah Anda yakin'), 10)

WebUI.click(findTestObject('H2/Final Check/button_Cancel Popup'))

