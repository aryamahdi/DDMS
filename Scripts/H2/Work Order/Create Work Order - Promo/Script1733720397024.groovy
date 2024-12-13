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

'Click Work Order Dropdown on Dashboard'
WebUI.click(findTestObject('H2/Dashboard/ddl_Work Order'))

'Click Work Order Link on Dashboard'
WebUI.click(findTestObject('H2/Dashboard/link_Work Order'))

'Select KPB Type'
WebUI.selectOptionByValue(findTestObject('H2/Work Order/select_Tipe KPB'), TipeKPB, true)

'Select Mechanic Name'
WebUI.selectOptionByValue(findTestObject('H2/Work Order/select_Nama Mekanik'), NamaMekanik, true)

'Enter Front Plate Number'
WebUI.setText(findTestObject('H2/Work Order/input__No Polisi (Depan)'), NoPolisi1)

'Enter Middle Plate Number'
WebUI.setText(findTestObject('H2/Work Order/input__No Polisi (Tengah)'), NoPolisi2)

'Enter Back Plate Number'
WebUI.setText(findTestObject('H2/Work Order/input__No Polisi (Belakang)'), NoPolisi3)

'Click Load Data Button'
WebUI.click(findTestObject('H2/Work Order/button_Memuat Data'))

'Enter KM Reading'
WebUI.setText(findTestObject('H2/Work Order/input__KM Motor'), KMMotor)

'Adjust Fuel Tank Meter'
WebUI.dragAndDropByOffset(findTestObject('H2/Work Order/button_Set Meter Tangki Bensin'), 200, 0)

'Enter Unit Entry Origin'
WebUI.setText(findTestObject('H2/Work Order/input__Asal Unit Entry'), AsalUnitEntry)

'Submit Unit Entry Origin'
WebUI.sendKeys(findTestObject('H2/Work Order/input__Asal Unit Entry'), Keys.chord(Keys.ENTER))

'Add Customer Complaint'
WebUI.click(findTestObject('H2/Work Order/button_Tambah Keluhan Customer'))

'Verify Complaint Input Popup is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Work Order/popup_Input Keluhan'), 10)

'Select Complaint Type'
WebUI.selectOptionByValue(findTestObject('H2/Work Order/select_Keluhan'), Keluhan, true)

'Submit Customer Complaint'
WebUI.click(findTestObject('H2/Work Order/button_Kirim Input Keluhan'))

'Select Work Execution by Mechanic'
WebUI.click(findTestObject('H2/Work Order/rdr_Langsung dikerjakan oleh mekanik'))

'Confirm Spare Parts Taken'
WebUI.click(findTestObject('H2/Work Order/rdr_Ya Spare Part Dibawa'))

'Open Data Carrier Tab'
WebUI.click(findTestObject('H2/Work Order/tab_Data Pembawa'))

'Select Same as Owner Checkbox'
WebUI.click(findTestObject('H2/Work Order/input_Sama Dengan Pemilik'))

'Select Relationship Between Carrier and Owner'
WebUI.selectOptionByValue(findTestObject('H2/Work Order/select_Hubungan Pembawa dan Pemilik'), HubunganPembawa, true)

'Select Reason for Visiting AHASS'
WebUI.selectOptionByValue(findTestObject('H2/Work Order/select_Alasan Datang ke AHASS'), AlasanDatang, true)

'Save Data Carrier'
WebUI.click(findTestObject('H2/Work Order/button_Simpan Data Pembawa'))

'Verify Data Carrier Popup is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Work Order/popup_Data Pembawa'), 10)

'Close Data Carrier Popup'
WebUI.click(findTestObject('H2/Work Order/button_Ok Popup Data Pembawa'))

'Click Check Promo Button'
WebUI.click(findTestObject('H2/Work Order/button_Cek Promo'))

'Sign on SA Canvas'
WebUI.doubleClick(findTestObject('H2/Work Order/canvas_SA'))

'Sign on Customer Canvas'
WebUI.doubleClick(findTestObject('H2/Work Order/canvas_Customer'))

'Click Create Work Order Button'
WebUI.click(findTestObject('H2/Work Order/button_Buat WO'))

'Verify Work Order Popup is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Work Order/popup_Work Order'), 10)

'Close Work Order Popup'
WebUI.click(findTestObject('H2/Work Order/button_Ok Work Order'))

