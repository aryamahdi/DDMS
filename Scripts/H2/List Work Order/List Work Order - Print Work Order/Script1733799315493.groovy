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

WebUI.navigateToUrl(GlobalVariable.URL_H2)

WebUI.click(findTestObject('H2/Dashboard/ddl_Work Order'))

WebUI.click(findTestObject('H2/Dashboard/link_List WO'))

WebUI.click(findTestObject('H2/List Work Order/button_Refresh'))

WebUI.selectOptionByValue(findTestObject('H2/List Work Order/select_Pilih Item'), Item, true)

WebUI.setText(findTestObject('H2/List Work Order/input_Cari_Item'), NoPolisi)

WebUI.click(findTestObject('H2/List Work Order/button_Cari'))

WebUI.click(findTestObject('H2/List Work Order/button_Print WO'))

WebUI.verifyElementPresent(findTestObject('H2/List Work Order/label_Ukuran Cetakan Work Order'), 10)

WebUI.selectOptionByValue(findTestObject('H2/List Work Order/select_Ukuran Kertas'), UkuranKertas, true)

WebUI.click(findTestObject('H2/List Work Order/button_Cetak WO'))

