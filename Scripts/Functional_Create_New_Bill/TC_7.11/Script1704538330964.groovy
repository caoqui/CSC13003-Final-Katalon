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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.firefly-iii.org/')

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.11/a_Demo'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.11/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.11/span_demofirefly_fa fa-plus-circle'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.11/h4_New bill'))

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.11/input_Name_name'), 'Joe hanh')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.11/input_Minimum amount_amount_min'), '1')

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.11/button_Store new bill'))

WebUI.verifyElementText(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.11/p_The maximum amount field is required'), 
    'The maximum amount field is required.')

WebUI.verifyElementText(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.11/small_Create new bill'), 'Create new bill')

WebUI.closeBrowser()

