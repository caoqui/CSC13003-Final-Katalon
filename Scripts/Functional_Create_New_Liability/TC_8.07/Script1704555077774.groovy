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

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.07/a_Demo'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.07/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.07/span_demofirefly_fa fa-plus-circle'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.07/h4_New liability'))

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.07/input_I owe amount_opening_balance'), 
    '12')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.07/input_Start date of debt_opening_balance_date'), 
    '12/30/2023')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.07/input_Interest_interest'), '17')

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.07/button_Store new liability'))

WebUI.verifyElementText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.07/p_The name field is required'), 
    'The name field is required.')

WebUI.verifyElementText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.07/small_Create a new liability'), 
    'Create a new liability')

WebUI.closeBrowser()
