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

'Call Login Test Case with Valid Credentials'
WebUI.callTestCase(findTestCase('H2/Login/Login - Valid Credential'), [('Lokasi') : 'Ahass Induk'], FailureHandling.STOP_ON_FAILURE)

'Click Booking Service Dropdown'
WebUI.click(findTestObject('H2/Dashboard/ddl_Booking Service'))

'Navigate to Monitoring Booking Service Page'
WebUI.click(findTestObject('H2/Dashboard/link_Monitoring Booking Service'))

'Verify Monitoring Booking Service Page is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Booking Service/label_Monitoring Booking Service'), 10)

'Click Add Booking Service Button'
WebUI.click(findTestObject('H2/Booking Service/button_Tambah Booking Service'))

'Verify Booking Service Form is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Booking Service/label_Booking Service'), 10)

'Enter Service Date'
WebUI.setText(findTestObject('H2/Booking Service/input__Tanggal Service'), '12-Dec-24')

'Select Service Time'
WebUI.click(findTestObject('H2/Booking Service/button_Pilih'))

'Verify Service Time Popup is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Booking Service/popup_Waktu Service'), 10)

'Choose Service Time Slot'
WebUI.click(findTestObject('H2/Booking Service/label_Jam Service'))

'Confirm Selected Service Time'
WebUI.click(findTestObject('H2/Booking Service/button_Pilih Waktu Service'))

'Enter License Plate Number (Front)'
WebUI.setText(findTestObject('H2/Booking Service/input__NoPolisi1'), 'B')

'Enter License Plate Number (Middle)'
WebUI.setText(findTestObject('H2/Booking Service/input__NoPolisi2'), '0001')

'Enter License Plate Number (Rear)'
WebUI.setText(findTestObject('H2/Booking Service/input__NoPolisi3'), 'AAA')

'Search Vehicle Data'
WebUI.click(findTestObject('H2/Booking Service/button_Cari'))

'Enter Vehicle Mileage'
WebUI.setText(findTestObject('H2/Booking Service/input__KM Unit'), '20000')

'Enter Year of Manufacture'
WebUI.setText(findTestObject('H2/Booking Service/input_Tahun Perakitan'), '2023')

'Select Customer Complaint'
WebUI.selectOptionByValue(findTestObject('H2/Booking Service/select_Keluhan Customer'), 'BEREBET', true)

'Select Service Location Type'
WebUI.selectOptionByValue(findTestObject('H2/Booking Service/select_Jenis Lokasi Service'), 'Reguler Bengkel', true)

'Create Booking Service Data'
WebUI.click(findTestObject('H2/Booking Service/button_Buat Data Booking'))

'Verify Confirmation Popup is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Booking Service/popup_Question'), 10)

'Confirm Booking Creation'
WebUI.click(findTestObject('H2/Booking Service/button_OK'))

'Verify Success Popup is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Booking Service/popup_Data berhasil disimpan'), 10)

'Close Success Popup'
WebUI.click(findTestObject('H2/Booking Service/button_OK'))

