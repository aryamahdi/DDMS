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

'Take Screenshot'
WebUI.takeScreenshot([('text') : GlobalVariable.timestamp])

'Select Item Criteria'
WebUI.selectOptionByValue(findTestObject('H2/Booking Service/select_Pilih item'), 'Nomor Polisi', true)

'Enter Item Search Criteria'
WebUI.setText(findTestObject('H2/Booking Service/input_Cari Item'), 'B 0001 AAA')

'Click Search Item Button'
WebUI.click(findTestObject('H2/Booking Service/button_Cari Item'))

'Click Check In Button'
WebUI.click(findTestObject('H2/Booking Service/button_Check In'))

'Verify Booking Status Change Popup is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Booking Service/popup_Ubah Status Booking'), 10)

'Click OK to Confirm Status Change'
WebUI.click(findTestObject('H2/Booking Service/button_OK'))

'Select KPB Type'
WebUI.selectOptionByValue(findTestObject('H2/Work Order/select_Tipe KPB'), TipeKPB, true)

'Select Mechanic Name'
WebUI.selectOptionByValue(findTestObject('H2/Work Order/select_Nama Mekanik'), NamaMekanik, true)

'Click Load Data Button'
WebUI.click(findTestObject('H2/Work Order/button_Memuat Data'))

'Take Screenshot'
WebUI.takeScreenshot([('text') : GlobalVariable.timestamp])

'Open Data Carrier Tab'
WebUI.click(findTestObject('H2/Work Order/tab_Data Pembawa'))

'Select Same as Owner Checkbox'
WebUI.click(findTestObject('H2/Work Order/input_Sama Dengan Pemilik'))

'Select Relationship Between Carrier and Owner'
WebUI.selectOptionByValue(findTestObject('H2/Work Order/select_Hubungan Pembawa dan Pemilik'), HubunganPembawa, true)

'Select Reason for Visiting AHASS'
WebUI.selectOptionByValue(findTestObject('H2/Work Order/select_Alasan Datang ke AHASS'), AlasanDatang, true)

'Take Screenshot'
WebUI.takeScreenshot([('text') : GlobalVariable.timestamp])

'Save Data Carrier'
WebUI.click(findTestObject('H2/Work Order/button_Simpan Data Pembawa'))

'Verify Data Carrier Popup is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Work Order/popup_Data Pembawa'), 10)

'Take Screenshot'
WebUI.takeScreenshot([('text') : GlobalVariable.timestamp])

'Close Data Carrier Popup'
WebUI.click(findTestObject('H2/Work Order/button_Ok Popup Data Pembawa'))

'Adjust Fuel Tank Meter'
WebUI.dragAndDropByOffset(findTestObject('H2/Work Order/button_Set Meter Tangki Bensin'), 200, 0)

'Enter Unit Entry Origin'
WebUI.setText(findTestObject('H2/Work Order/input__Asal Unit Entry'), AsalUnitEntry)

'Submit Unit Entry Origin'
WebUI.sendKeys(findTestObject('H2/Work Order/input__Asal Unit Entry'), Keys.chord(Keys.ENTER))

'Take Screenshot'
WebUI.takeScreenshot([('text') : GlobalVariable.timestamp])

'Select Work Execution by Mechanic'
WebUI.click(findTestObject('H2/Work Order/rdr_Langsung dikerjakan oleh mekanik'))

'Confirm Spare Parts Taken'
WebUI.click(findTestObject('H2/Work Order/rdr_Ya Spare Part Dibawa'))

'Take Screenshot'
WebUI.takeScreenshot([('text') : GlobalVariable.timestamp])

'Sign on SA Canvas'
WebUI.doubleClick(findTestObject('H2/Work Order/canvas_SA'))

'Sign on Customer Canvas'
WebUI.doubleClick(findTestObject('H2/Work Order/canvas_Customer'))

'Take Screenshot'
WebUI.takeScreenshot([('text') : GlobalVariable.timestamp])

'Click Create Work Order Button'
WebUI.click(findTestObject('H2/Work Order/button_Buat WO'))

'Verify Work Order Popup is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Work Order/popup_Work Order'), 10)

'Take Screenshot'
WebUI.takeScreenshot([('text') : GlobalVariable.timestamp])

'Close Work Order Popup'
WebUI.click(findTestObject('H2/Work Order/button_Ok Work Order'))

