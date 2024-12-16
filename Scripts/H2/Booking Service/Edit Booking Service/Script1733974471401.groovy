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

'Click Booking Service Dropdown'
WebUI.click(findTestObject('H2/Dashboard/ddl_Booking Service'))

'Navigate to Monitoring Booking Service Page'
WebUI.click(findTestObject('H2/Dashboard/link_Monitoring Booking Service'))

'Verify Monitoring Booking Service Page is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Booking Service/label_Monitoring Booking Service'), 10)

'Select Item by License Plate'
WebUI.selectOptionByValue(findTestObject('H2/Booking Service/select_Pilih item'), Item, true)

'Enter License Plate Number in Search Field'
WebUI.setText(findTestObject('H2/Booking Service/input_Cari Item'), Search)

'Click Search Item Button'
WebUI.click(findTestObject('H2/Booking Service/button_Cari Item'))

'Click Edit Booking Service Button'
WebUI.click(findTestObject('H2/Booking Service/button_Edit'))

'Verify Booking Service Popup is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Booking Service/label_Booking Service'), 10)

'Create Booking Service Data'
WebUI.click(findTestObject('H2/Booking Service/button_Buat Data Booking'))

'Verify Confirmation Popup is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Booking Service/popup_Simpan'), 10)

'Take Screenshot'
WebUI.takeScreenshot([('text') : GlobalVariable.timestamp])

'Confirm Booking Creation'
WebUI.click(findTestObject('H2/Booking Service/button_OK'))

'Verify Success Popup is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Booking Service/popup_Data berhasil disimpan'), 10)

'Take Screenshot'
WebUI.takeScreenshot([('text') : GlobalVariable.timestamp])

'Close Success Popup'
WebUI.click(findTestObject('H2/Booking Service/button_OK'))

