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
WebUI.callTestCase(findTestCase('H2/Login/Valid Credential'), [('Lokasi') : 'Ahass Induk'], FailureHandling.STOP_ON_FAILURE)

'Click Work Order Dropdown on Dashboard'
WebUI.click(findTestObject('H2/Dashboard/ddl_Work Order'))

'Click Assignment Service Link on Dashboard'
WebUI.click(findTestObject('H2/Dashboard/link_Assignment Service'))

'Define Mechanic Name Variable'
def strmekanik = NamaMekanik

'Select Mechanic Name in Assignment Service'
WebUI.click(findTestObject('H2/Assignment Service/label_Nama Mekanik', [('mekanikid') : strmekanik]))

'Verify Work Order Details are Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Assignment Service/label_Rincian Work Order'), 10)

'Retrieve License Plate Number'
NoPolisi = WebUI.getText(findTestObject('H2/Assignment Service/input_No Polisi Unit'))

'Click Start Button'
WebUI.click(findTestObject('H2/Assignment Service/button_Start'))

'Verify Confirmation Popup for Start Work Order'
WebUI.verifyElementPresent(findTestObject('H2/Assignment Service/label_Apakah Anda yakin'), 10)

'Click OK Button on Confirmation Popup'
WebUI.click(findTestObject('H2/Assignment Service/button_OK Question'))

'Verify Work Order Started Successfully'
WebUI.verifyElementPresent(findTestObject('H2/Assignment Service/label_Pekerjaan dimulai'), 10)

'Click Yes Button to View PDF'
WebUI.click(findTestObject('H2/Assignment Service/button_Yes'))

'Verify PDF Viewer is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Assignment Service/label_PDF Viewer'), 10)

'Close PDF Viewer'
WebUI.click(findTestObject('H2/Assignment Service/button_Close PDF Viewer'))

'Click Hold Work Order Button'
WebUI.click(findTestObject('H2/Assignment Service/button_Hold WO'))

'Verify Hold Work Order Reason Form is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Assignment Service/label_Alasan Hold Work Order'), 10)

'Select Hold Work Order Reason'
WebUI.selectOptionByValue(findTestObject('H2/Assignment Service/select_Alasan Hold Work Order'), AlasanHoldWorkOrder, true)

'Fill Additional Information for External Work if Applicable'
if (AlasanHoldWorkOrder == 'Pekerjaan Luar') {
    'Enter External Work Name'
    WebUI.setText(findTestObject('H2/Assignment Service/input_Nama Pekerjaan Luar'), NamaPekerjaan)

    'Enter Estimated Cost for External Work'
    WebUI.setText(findTestObject('H2/Assignment Service/input_Estimasi Biaya'), EstimasiBiaya)

    'Enter External Work Date'
    WebUI.setText(findTestObject('H2/Assignment Service/input_Tanggal Pekerjaan'), TanggalPekerjaan)

    'Enter Vendor Name for External Work'
    WebUI.setText(findTestObject('H2/Assignment Service/input_Nama Vendor'), NamaVendor)
}

'Click OK Button on Hold Work Order Reason Form'
WebUI.click(findTestObject('H2/Assignment Service/button_OK Alasan Hold Work Order'))

'Verify Confirmation Popup for Hold Work Order'
WebUI.verifyElementPresent(findTestObject('H2/Assignment Service/label_Apakah Anda yakin'), 10)

'Click OK Button on Confirmation Popup'
WebUI.click(findTestObject('H2/Assignment Service/button_OK Question'))

'Verify Hold Work Order Successful Popup is Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Assignment Service/popup_Berhasil Hold WO'), 10)

'Click OK Button on Successful Hold Work Order Popup'
WebUI.click(findTestObject('H2/Assignment Service/button_OK Question'))

'Navigate to Hold Work Order Monitoring'
WebUI.click(findTestObject('H2/Dashboard/link_Hold WO Monitoring'))

'Click Refresh Button on Monitoring Page'
WebUI.click(findTestObject('H2/Hold Work Order Monitoring/button_Refresh'))

'Filter by License Plate in Monitoring'
WebUI.selectOptionByValue(findTestObject('H2/Hold Work Order Monitoring/select_Pilih Item'), 'Nomor Polisi', true)

'Enter License Plate Number for Search'
WebUI.setText(findTestObject('H2/Hold Work Order Monitoring/input_Cari'), NoPolisi)

'Click Search Button'
WebUI.click(findTestObject('H2/Hold Work Order Monitoring/button_Cari'))

'View Work Order Details'
WebUI.click(findTestObject('H2/Hold Work Order Monitoring/button_Detail Work Order'))

'Verify Work Order Data Details are Displayed'
WebUI.verifyElementPresent(findTestObject('H2/Assignment Service/label_Data Work Order'), 10)

