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

WebUI.callTestCase(findTestCase('H2/Login/Login - Valid Credential'), [('Lokasi') : 'Ahass Induk'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/ddl_Work Order'))

WebUI.click(findTestObject('Dashboard/link_Work Order'))

WebUI.selectOptionByValue(findTestObject('Work Order/select_Tipe KPB'), TipeKPB, true)

WebUI.selectOptionByValue(findTestObject('Work Order/select_Nama Mekanik'), NamaMekanik, true)

WebUI.setText(findTestObject('Work Order/input__No Polisi (Depan)'), NoPolisi1)

WebUI.setText(findTestObject('Work Order/input__No Polisi (Tengah)'), NoPolisi2)

WebUI.setText(findTestObject('Work Order/input__No Polisi (Belakang)'), NoPolisi3)

WebUI.click(findTestObject('Work Order/button_Memuat Data'))

WebUI.setText(findTestObject('Work Order/input__KM Motor'), KMMotor)

WebUI.dragAndDropByOffset(findTestObject('Work Order/button_Set Meter Tangki Bensin'), 200, 0)

WebUI.setText(findTestObject('Work Order/input__Asal Unit Entry'), AsalUnitEntry)

WebUI.sendKeys(findTestObject('Work Order/input__Asal Unit Entry'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Work Order/button_Tambah Keluhan Customer'))

WebUI.verifyElementPresent(findTestObject('Work Order/popup_Input Keluhan'), 10)

WebUI.selectOptionByValue(findTestObject('Work Order/select_Keluhan'), Keluhan, true)

WebUI.click(findTestObject('Work Order/button_Kirim Input Keluhan'))

WebUI.click(findTestObject('Work Order/rdr_Langsung dikerjakan oleh mekanik'))

WebUI.click(findTestObject('Work Order/rdr_Ya Spare Part Dibawa'))

WebUI.click(findTestObject('Work Order/tab_Data Pembawa'))

WebUI.click(findTestObject('Work Order/input_Sama Dengan Pemilik'))

WebUI.selectOptionByValue(findTestObject('Work Order/select_Hubungan Pembawa dan Pemilik'), HubunganPembawa, true)

WebUI.selectOptionByValue(findTestObject('Work Order/select_Alasan Datang ke AHASS'), AlasanDatang, true)

WebUI.click(findTestObject('Work Order/button_Simpan Data Pembawa'))

WebUI.verifyElementPresent(findTestObject('Work Order/popup_Data Pembawa'), 10)

WebUI.click(findTestObject('Work Order/button_Ok Popup Data Pembawa'))

WebUI.doubleClick(findTestObject('Work Order/canvas_SA'))

WebUI.doubleClick(findTestObject('Work Order/canvas_Customer'))

WebUI.click(findTestObject('Work Order/button_Buat WO'))

WebUI.verifyElementPresent(findTestObject('Work Order/popup_Work Order'), 10)

WebUI.click(findTestObject('Work Order/button_Ok Work Order'))

