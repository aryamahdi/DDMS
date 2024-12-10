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

WebUI.click(findTestObject('H2/Dashboard/ddl_Masterdata H2'))

WebUI.click(findTestObject('H2/Dashboard/link_Master Unit Customer'))

WebUI.click(findTestObject('H2/Master Unit Customer/button_Tambah'))

WebUI.verifyElementPresent(findTestObject('H2/Master Unit Customer/popup_Tambah Data Unit Customer'), 0)

WebUI.setText(findTestObject('H2/Master Unit Customer/input__Nama'), Nama)

WebUI.selectOptionByValue(findTestObject('H2/Master Unit Customer/select_ID Jenis Kelamin'), IDJenisKelamin, true)

WebUI.selectOptionByValue(findTestObject('H2/Master Unit Customer/select_ID Tipe Customer'), IDTipeCustomer, true)

WebUI.setText(findTestObject('H2/Master Unit Customer/input_Nomor KTP'), NomorKTP)

WebUI.click(findTestObject('H2/Master Unit Customer/button_Cari Unit Tipe'))

WebUI.verifyElementPresent(findTestObject('H2/Master Unit Customer/popup_Cari Tipe Motor'), 0)

WebUI.setText(findTestObject('H2/Master Unit Customer/input_Nama Unit Tipe Motor'), UnitTipe)

WebUI.click(findTestObject('H2/Master Unit Customer/button_Cari Tipe Motor'))

WebUI.click(findTestObject('H2/Master Unit Customer/button_Tambah Unit'))

WebUI.setText(findTestObject('H2/Master Unit Customer/input_Nomor STNK'), NomorSTNK)

WebUI.setText(findTestObject('H2/Master Unit Customer/input_No Polisi_1'), NoPolisi1)

WebUI.setText(findTestObject('H2/Master Unit Customer/input_No Polisi_2'), NoPolisi2)

WebUI.setText(findTestObject('H2/Master Unit Customer/input_No Polisi_3'), NoPolisi3)

WebUI.setText(findTestObject('H2/Master Unit Customer/input_Nomor Mesin'), NomorMesin)

WebUI.setText(findTestObject('H2/Master Unit Customer/input_Nomor Chasis'), NomorChasis)

WebUI.setText(findTestObject('H2/Master Unit Customer/input_Tahun Perakitan'), TahunPerakitan)

WebUI.setText(findTestObject('H2/Master Unit Customer/input__Alamat KTP'), AlamatKTP)

WebUI.setText(findTestObject('H2/Master Unit Customer/input__Alamat Terkini'), AlamatTerkini)

WebUI.setText(findTestObject('H2/Master Unit Customer/input__Alamat Email'), AlamatEmail)

WebUI.setText(findTestObject('H2/Master Unit Customer/input_Kota'), Kota)

WebUI.setText(findTestObject('H2/Master Unit Customer/input_Kecamatan'), Kecamatan)

WebUI.setText(findTestObject('H2/Master Unit Customer/input_Kelurahan'), Kelurahan)

WebUI.setText(findTestObject('H2/Master Unit Customer/input_Nomor Kode Pos'), NomorKodePos)

WebUI.setText(findTestObject('H2/Master Unit Customer/input_Agama'), Agama)

WebUI.setText(findTestObject('H2/Master Unit Customer/input__Nomor Telepon'), NomorTelepon)

WebUI.click(findTestObject('H2/Master Unit Customer/button_SIMPAN'))

WebUI.waitForPageLoad(3)

WebUI.closeBrowser()

