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

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.2/a_Demo'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.2/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.2/span_demofirefly_fa fa-plus-circle'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.2/h4_New bill'))

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.2/input_Name_name'), 'Nissan Jor')

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.2/select_Euro ()US Dollar ()'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.2/input_Minimum amount_amount_min'), '10')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.2/input_Maximum amount_amount_max'), '11')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.2/input_Date_date'), '12/12/2023')

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.2/select_dailyweeklymonthlyquarterlyevery hal_79c7c6'), 
    'weekly', true)

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.2/input_Skip_skip'), '7')

WebUI.verifyElementText(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.2/button_Store new bill'), 'Store new bill')

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.2/button_Store new bill'))

WebUI.verifyElementText(findTestObject('Object Repository/Functional_Create_New_Bill/TC_7.2/strong_Success'), 'Success!')

WebUI.closeBrowser()

